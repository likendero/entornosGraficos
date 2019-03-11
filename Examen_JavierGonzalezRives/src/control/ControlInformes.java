package control;

import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import modelo.Conexion;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
import org.apache.commons.logging.Log;
import vista.InformesDialog;
import vista.VentanaPrincipal;

/**
 *
 * @author Javier Gonzalez Rives
 */
public class ControlInformes implements ActionListener{
    private VentanaPrincipal ven;
    private InformesDialog informe;
    private JasperPrint printer;
    private JasperViewer viewer;
    private Conexion conexion;
    /**
     * creacion del objeto para los informes
     * @param ven
     * @param printer
     * @param viewer 
     */
    public ControlInformes(InformesDialog inf, Conexion con) {
        this.ven = ven;
        this.informe = inf;
        this.printer = null;
        this.viewer = null;
        this.conexion = con;
        // listener
        informe.getBtInforme1().addActionListener(this);
        informe.getBtInforme2().addActionListener(this);
        informe.getBtInforme3().addActionListener(this);
        informe.getBtInforme4().addActionListener(this);
        
        /*
        ven.getMiInforme1().addActionListener(this);
        ven.getMiInforme2().addActionListener(this);
        ven.getMiInforme3().addActionListener(this);
        ven.getMiInforme4().addActionListener(this);
        */
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            Connection con = conexion.getConexion();
            // informe 1
            if(e.getSource() == informe.getBtInforme1()){
                String informe = "src/reportes/informe1.jasper";
                // creacion del printer
                printer = JasperFillManager.fillReport(informe,null,con);
               if(printer.getPages().size() > 0){
                    viewer = new JasperViewer(printer);
                    exportar(printer);
                    crearDialogo(viewer);
                }else{
                    JOptionPane.showMessageDialog(ven, "no hay registros");
                }
            }
            // informe 2
            if(e.getSource() == informe.getBtInforme2()){
                String informe = "src/reportes/informe2.jasper";
                // creacion del printer
                printer = JasperFillManager.fillReport(informe,null,con);
                if(printer.getPages().size() > 0){
                    viewer = new JasperViewer(printer);
                    exportar(printer);
                    crearDialogo(viewer);
                }else{
                    JOptionPane.showMessageDialog(ven, "no hay registros");
                }
            }
             // informe 3
            if(e.getSource() == informe.getBtInforme3()){
                String informe = "src/reportes/informe3.jasper";
                // creacion del printer
                printer = JasperFillManager.fillReport(informe,null,con);
                if(printer.getPages().size() > 0){
                    viewer = new JasperViewer(printer);
                    exportar(printer);
                    crearDialogo(viewer);
                }else{
                    JOptionPane.showMessageDialog(ven, "no hay registros");
                }
            }
             // informe 4
            if(e.getSource() == informe.getBtInforme4()){
                String informe = "src/reportes/informe4.jasper";
                // creacion del printer
                int i = 0;
                try{
                    i = Integer.parseInt(JOptionPane.showInputDialog(ven,"introduce un numero de oficina" ));
                }catch(Exception ex){
                    
                }
                Map<String,Object> map = new HashMap();
                map.put("codigo_Oficina", i);
                printer = JasperFillManager.fillReport(informe,map,con);
                if(printer.getPages().size() > 0){
                    viewer = new JasperViewer(printer);
                    exportar(printer);
                    crearDialogo(viewer);
                }else{
                    JOptionPane.showMessageDialog(ven, "no hay registros");
                }
            }
        }catch(JRException jr){
            System.out.println(jr.getMessage());
        }catch(SQLException sql){
            System.out.println(sql.getMessage());
        }
    }
    private void exportar(JasperPrint print){
        try{
            if(JOptionPane.showConfirmDialog(ven, "desea guardar el informe en pdf?", "desea guardar?", JOptionPane.YES_NO_OPTION) == 0){
                JFileChooser selector = new JFileChooser();
                selector.showSaveDialog(ven);
                File seleccion = new File(selector.getSelectedFile()+".pdf");
                JasperExportManager.exportReportToPdfStream(print,new FileOutputStream(seleccion));
                Desktop.getDesktop().open(seleccion);
            }
            
        }catch(Exception ex){
        
        }
    
    }
    /**
     * metodo que crea un cuadro de dialogo
     */
    private void crearDialogo(JasperViewer view){
        // control de nulidad
        if(view != null){
            JDialog dia = new JDialog(ven,true);
            dia.add(viewer.getContentPane());
            dia.setSize(viewer.getSize());
            dia.setLocationRelativeTo(null);
            dia.setVisible(true);
        }
    
    }
}
