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
public class Ejercicio2 {
    public static void main(String[] args) {
        try{
        SessionFactory factory = iesUtil.getSessionFactory();
        Session sesion = factory.openSession();
        
        Query q = sesion.createQuery("select count(m.alumno) from Matricula m where m.modulo.nombre = 'ACDAT' ");
        Iterator<?> it = q.iterate();
        
        
        Long media = (Long) it.next();
        System.out.println("el numero de alumnos es de "  + media);
        
        sesion.close();
        factory.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
