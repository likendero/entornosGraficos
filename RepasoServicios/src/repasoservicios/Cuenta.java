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
public class Cuenta {
    private int dinero;
    /**
     * cuenta que 
     */
    public Cuenta(int dinero){
        super();
        this.dinero = dinero;
    }
    /**
     * retirar dinero del banco
     */
    public /*synchronized*/ void  retirar(int cantidad){
        
        if((dinero-cantidad) < 0){
            System.out.println("no hay suficiente dinero en la cuenta");
            
        }else{
            // se realiza la operacion
            dinero -= cantidad;
            System.out.println("Se han retirado " + cantidad + " €" + 
                    "\n restante " + dinero + " €");
        }
        
    }

    public int getDinero() {
        return dinero;
    }
    
}
