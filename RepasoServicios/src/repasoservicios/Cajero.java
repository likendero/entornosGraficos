/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repasoservicios;

/**
 *
 * @author likendero
 */
public class Cajero implements Runnable{
    private Cuenta cuenta;
    boolean control;
    /**
     * constructor de la cuenta
     * @param cuenta 
     */
    public Cajero(Cuenta cuenta){
        super();
        this.cuenta = cuenta;
        this.control = true;
    }

    @Override
    public void run() {
        while(control){
            
            int cantidad = (int)(Math.random()*19+1);
            if(cuenta.getDinero() > 0){
                cuenta.retirar(cantidad);
            }else{
                control = false;
            }
            
            try{
                Thread.sleep(1000);
            }catch(InterruptedException in){
            }
        }
    }
}
