/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientetcpencriptado;

import ficherosSeparados.Descifrar;
import java.io.BufferedReader;
import java.io.PrintWriter;



/**
 *
 * @author Javier Gonzalez Rives
 */
public class BandejaDeEntrada implements Runnable{
    
    private BufferedReader lector; 

    public BandejaDeEntrada(BufferedReader lector) {
        this.lector = lector;
    }
    /**
     * metodo que recibe el mensaje del cliente
     */
    private String recibirMensaje(){
        String entrada = "";    
        try{
            entrada = lector.readLine();
            System.out.println(entrada);
            entrada = Descifrar.descifrarAes25664(entrada,ClienteTcpEncriptado.CLAVE);
        
        }catch(Exception ex){

        }
        entrada = entrada.trim();
        return entrada;
    }
    @Override
    public void run() {
        
        while(true){
            try{
                System.out.println(recibirMensaje());
            }catch(Exception ex){
                System.out.println("error en el envio " + ex.getMessage());
            }
        }
    }
    
}
