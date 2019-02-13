package servidor;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;
public class HiloServidor implements Runnable{

    private static Scanner key = new Scanner(System.in);
    private ArrayList<Cliente> clientes;
    private ArrayList<Cliente> baneados;
    private Cliente chatPrivatoCli;
    private boolean control;
    /**
     * constructor del hilo para inciciar la escucha del server
     */
    public HiloServidor(ArrayList<Cliente> clientes){
        super();
        this.clientes = clientes;
        this.baneados = new ArrayList<>();
        this.chatPrivatoCli = null;
        this.control = true; 
    }
    // METODOS ////////////////////////////////////////////////////
    /**
     * metodo que comprueba si se trata de un comado
     * @param mensaje de entrada a comprobar
     * @return true si se trata de un mensaje false else
     */
    private boolean comandos(String mensaje){
        mensaje = mensaje.trim();
        
        // si es un comando empieza por barra
        if(!mensaje.isEmpty() && mensaje.charAt(0) == '\\'){
            String[] partes = mensaje.split(" ",2);
           if(partes.length < 2){
                String aux = partes[0];
                partes = new String[2];
                partes[0] = aux;
                partes[1] = "";
            }
            // ejecucion segun el comando
            switch(partes[0]){
                case "\\exit":
                    System.out.println("fin del servidor");
                    System.exit(0);
                break;
                case "\\help":
                    System.out.println("\\help Ayuda\n" +
                    "\\exit cerrar el servidor"+
                    "\\b Banear Cliente\n" +
                    "\\l listar Clientes\n" +
                    "\\r Ver clientes Baneados\n" +
                    "\\p Chat privado\n" +
                    "\\z Salir de Privado");
                break;
                case "\\b":
                    if(partes[1].isEmpty())
                        System.out.println("hace falta un codigo de cleinte");
                    else
                    try{
                        int id = Integer.parseInt(partes[1]);
                        boolean exito = false;
                        // recorrido
                        for(int i = 0; i < clientes.size(); i++){
                            // comprobacion del id
                            if(clientes.get(i).getId() == id){
                                /*
                                    el remove se puede hacer segun objeto, esto hace posible
                                    el borrado a trabes de un for each.
                                */
                                clientes.remove(i);
                                exito = true;
                            }
                        }
                        // mensaje de baneao realizado o no
                        System.out.println(exito? "se ha baneado el usuario correctamente":
                        "no se ha encontrado el usuario");
                    }catch(InputMismatchException in){
                        System.out.println(" el id debe ser numerico");
                    }catch(Exception ex){
                    }
                break;
                case "\\l":
                    System.out.println("Clientes Conectados: ");
                    // se muestra los integrantes de la lista de baneados
                    for(Cliente cli: clientes){
                        System.out.println(cli.getNombre());
                    }
                break;
                case "\\r":
                    System.out.println("Clientes baneados: ");
                    // se muestra los integrantes de la lista de baneados
                    for(Cliente cli: baneados){
                        System.out.println(cli.getNombre());
                    }
                break;
                case "\\p":
                    if(partes[1].equals("")){
                        System.out.println("falta un segundo argumento <nombre cliente>");
                    }else if(chatPrivatoCli != null){
                        System.out.println("ya se encuentra en un chat privado");
                    }else{
                        for(Cliente cli: clientes){
                            //  se captura el cliente con el nombre deseado
                            if(cli.getNombre().equals(partes[1])){
                                chatPrivatoCli = cli;
                            }
                        }
                    }
                break;
                case "\\z":
                    // si exise elimina el chat privado
                    if(chatPrivatoCli == null){
                        System.out.println("no hay chat privado");
                    }else{
                        chatPrivatoCli = null;
                        System.out.println("chat privado finalizado");
                    }
                break;
                default: 
                    System.out.println("no es un comando valido");
                break;
            }
            return true;
        }
        return false;

    }
    // CONTROL HILO ///////////////////////////////////
    @Override
    public void run() {
        // bucle del hilo
        while(control){
            String entrada = key.nextLine();
            
            // se manda un mensaje si la entrada no es un comando
            if(!comandos(entrada)){
               // si existe un cliente en privado solo se le manda a el
                if(chatPrivatoCli != null){
                    chatPrivatoCli.getPw().println("(Privado)Servidor: " + entrada);
                    chatPrivatoCli.getPw().flush();
                }
                else// el mensaje se manda por cada Cliente
                for(Cliente cli: clientes){
                    try{
                        // PrintWriter escritor = cli.getPw();
                        cli.getPw().println("Servidor: " + entrada);
                        cli.getPw().flush();
                        //System.out.println(entrada.trim());
                    }catch(Exception ex){
                        System.out.println("Ha ocurrido un error: ");
                        ex.printStackTrace();
                    }
                }
            }
        }
    }


}