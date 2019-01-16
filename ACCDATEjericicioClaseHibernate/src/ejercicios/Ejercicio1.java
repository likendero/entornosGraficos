/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;
import ies.entity.Alumno;
import ies.util.iesUtil;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
/**
 *
 * @author Javier Gonzalez Rives
 */
public class Ejercicio1 {
        
    public static void main(String[] args) {
        try{
        SessionFactory factory = iesUtil.getSessionFactory();
        Session sesion = factory.openSession();
        
        Query q = sesion.createQuery("select new List( avg(m.modulo.horas),m.alumno.nombre) from Matricula m group by m.alumno.dni");
        Iterator<?> it = q.iterate();
        while(it.hasNext()){
            List media = (List) it.next();
            System.out.println("la media es "  + media.get(0) + " de " + media.get(1));
        }
        
        
        
        sesion.close();
        factory.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
