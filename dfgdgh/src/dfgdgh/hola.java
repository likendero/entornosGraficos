/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dfgdgh;




import java.io.Serializable;
import java.util.EventListener;
import javax.swing.JSpinner;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.util.EventObject;

/**
 *
 * @author Javier Gonzalez Rives
 */
public class hola
        extends JSpinner implements Serializable, ChangeListener {

    @Override
    public void stateChanged(ChangeEvent evt) {
        if(this.maximo < (int)this.getValue() ){
            this.setValue(maximo);
            if(max != null){
                max.capturarMaximo(new MaximoEvent(this));
            }
        }
    }
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
    
    public hola() {
        this.addChangeListener(this);
        this.maximo = 10;
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
    
    public void addMaxListener(MaximoListener max){
        this.max = max;
    }
    public void removeMaxListener(MaximoListener max){
        this.max = null;
    }
    
}
