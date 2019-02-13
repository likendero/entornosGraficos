/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package componentes;




import java.io.Serializable;
import java.util.EventListener;
import javax.swing.JSpinner;

import java.util.EventObject;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


/**
 *
 * @author Javier Gonzalez Rives
 */
public class SpinnerMensajeMaximo5 extends JSpinner implements Serializable {

   
    /**
     * clase para crear el evento
     */
    public class MaximoEvent extends EventObject{
        
        public MaximoEvent(Object source) {
            super(source);
        }
    }
    /**
     * interfaz para añadir el listener
     */
    public interface MaximoListener extends EventListener{
        void capturarMaximo(MaximoEvent evt);
    }
    // CUERPO DE LA CLASE //////////////////////////////////////////////////////
    private int maximo;
    private MaximoListener max;
    
    public SpinnerMensajeMaximo5() {
        
       this.addChangeListener(new ChangeListener() {
           @Override
           public void stateChanged(ChangeEvent e) {
               acciones();
           }
       });
          
        this.maximo = 10;
    }
    public void acciones(){
         if(maximo < (int)getValue() ){
                this.setValue(maximo);
           
        }
         if(max != null){
                max.capturarMaximo(new MaximoEvent(this));
            }
    }
    // GETTERS SETTERS ////////////////////////////////////////////////////

    public int getMaximo() {
        return maximo;
    }

    public void setMaximo(int maximo) {
        this.maximo = maximo;
    }

    public MaximoListener getMax() {
        return max;
    }

    public void setMax(MaximoListener max) {
        this.max = max;
    }
    
    public void addMaximoListener(MaximoListener max){
        this.max = max;
    }
    public void removeMaximoListener(MaximoListener max){
        this.max = null;
    }
    
}
