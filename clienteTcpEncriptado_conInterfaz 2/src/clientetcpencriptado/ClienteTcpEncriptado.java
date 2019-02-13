package clientetcpencriptado;
import ficherosSeparados.Cifrar;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.InputMismatchException;
import java.util.Scanner;
import javax.swing.JFrame;
/**
 *
 * @author Javier Gonzalez Rives
 */
public class ClienteTcpEncriptado {
    private static final Scanner key = new Scanner(System.in);
    public static final String CLAVE = "chat1998";
    private static PrintWriter escritor;
    private static String ip;
    private static int puerto;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ip = "";
        puerto = 0;
        
        Socket conexion = null;
        BufferedReader lector = null;
            
        // try para la introduccion de datos
        try{
                // ventana de configuracion para los datos
                introducirIpPuerto intro = new introducirIpPuerto(null, true);
                intro.setVisible(true);
                // mientras que esta ventana no termine el porgrama no sigue
                while(intro.isVisible()){}
            try{
                // control de la ip y del puerto
                if(ip != null && puerto != 0){
                    conexion = new Socket(ip, puerto);
                    // conexion de entrada
                    lector = new BufferedReader(new InputStreamReader(conexion.getInputStream()));
                    escritor = new PrintWriter(new OutputStreamWriter(conexion.getOutputStream()));
                }
                // control de los flujos
                if(lector != null && escritor != null && conexion != null ){
                    // inicio del hilo que se eencarga de leer los mensajes de entrada
                    VentanaChat chat = new VentanaChat();
                    BandejaDeEntrada bandeja = new BandejaDeEntrada(lector,chat);
                    Thread hiloLector = new Thread(bandeja);
                    hiloLector.start();
                    // inicio de la ventana del chat
                    chat.setVisible(true);
                    chat.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                }
            }catch(IOException io){
                System.out.println("error de entrada y salida de datos");
            }
        }catch(Exception ex){
            
        }
    }
    /**
     * metodo que manda el mensaje que se le pasa por parametro a todos los usuarios
     */
    public static void enviarMensaje(String mensaje){
        if(!mensaje.trim().isEmpty()){
            System.out.println( mensaje = Cifrar.cifrarAes25664(mensaje, CLAVE));
            escritor.println(mensaje);
            escritor.flush();
        }
    }
    public static String getIp() {
        return ip;
    }

    public static void setIp(String ip) {
        ClienteTcpEncriptado.ip = ip;
    }

    public static int getPuerto() {
        return puerto;
    }

    public static void setPuerto(int puerto) {
        ClienteTcpEncriptado.puerto = puerto;
    }
    
}
