/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repasoservicios;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author likendero
 */
public class RepasoServicios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            Cuenta cuenta = new Cuenta(500);
            Cajero cajero1 = new Cajero(cuenta);
            Cajero cajero2 = new Cajero(cuenta);
            ExecutorService ex = Executors.newFixedThreadPool(2);
            ex.execute(cajero1);
            ex.execute(cajero2);
            ex.shutdown();
            while(!ex.isTerminated()){
            }
            System.out.println("fin del programa");
        }catch(Exception ex){
        }
    }
    
}
