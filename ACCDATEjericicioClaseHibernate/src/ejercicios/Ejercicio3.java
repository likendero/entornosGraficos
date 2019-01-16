/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import ies.util.iesUtil;
import java.util.Iterator;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author Javier Gonzalez Rives
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        try{
        SessionFactory factory = iesUtil.getSessionFactory();
        Session sesion = factory.openSession();
        
        Query q = sesion.createQuery("select m.alumno.nombre from Matricula m "
                + "where m.modulo.nombre = 'PSP' order by m.alumno.nombre");
        Iterator<?> it = q.iterate();
            System.out.println("alumnos en psp");
        while(it.hasNext()){
            String nombre = (String) it.next();
            System.out.println(nombre);
        }
        
        
        
        sesion.close();
        factory.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
