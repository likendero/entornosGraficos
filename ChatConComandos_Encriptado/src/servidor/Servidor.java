package servidor;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;



/**
 * clase que crea un servidor
 * @author Javier Gonzalez Rives
 */
public class Servidor{
    
    private static final int PUERTO = 17778;
    private static int idCliente = 0;
    private static ServerSocket servidor;
    private static ArrayList<Cliente> clientes;
    /**
     * metodo principal
     * @param args
     */
    public static void main(String[] args) {
        
        try{
            // creacion de la lista de clientes
            clientes = new ArrayList<>();
            servidor = new ServerSocket(PUERTO);
            System.out.println("inicio del servidor");
            HiloServidor hiloServidor = new HiloServidor(clientes);
            Thread in = new Thread(hiloServidor);
            in.start();
            // bucle que acepta nuevos clientes
            while(true){
                //  conexion con los clientes
                Socket conexion = servidor.accept();
                // flujos de lectura escritura del cliente
                BufferedReader bf = new BufferedReader(
                    new InputStreamReader(conexion.getInputStream()));
                PrintWriter pw = new PrintWriter(conexion.getOutputStream());
                // CLiente
                Cliente cliente = new Cliente(idCliente++, "cliente"+(idCliente-1),bf,pw);
                // add
                clientes.add(cliente);
                // creacion y lanzamiento del hilo
                HiloClientes hiloClientes = new HiloClientes(clientes, cliente);
                Thread hilo = new Thread(hiloClientes,cliente.getNombre());
                hilo.start();
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }

}