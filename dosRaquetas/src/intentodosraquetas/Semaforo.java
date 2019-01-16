/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intentodosraquetas;

/**
 *
 * @author Javier Gonzalez Rives
 */
public class Semaforo {
    boolean control;

    public Semaforo(boolean control) {
        this.control = control;
    }

    public Semaforo() {
        control = false;
    }
    
    public boolean isControl() {
        return control;
    }

    public void setControl(boolean control) {
        this.control = control;
    }
    
}
