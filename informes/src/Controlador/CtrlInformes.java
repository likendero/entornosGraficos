/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import modelo.Modelo;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
import vista.Informes;

/**
 *
 * @author windiurno
 */
public class CtrlInformes implements ActionListener{
    Informes informe;
    private JasperPrint printer;
    private JasperViewer viewer;
    private JDialog jasperDialog;
    /**
     * metodo constructor
     */
    public CtrlInformes(Informes informe){
        
        this.informe = informe;
        this.informe.getBtInforme2().addActionListener(this);
        this.informe.getjButton1().addActionListener(this);
        this.informe.getBtImprimir().addActionListener(this);
        this.informe.getBtinforme3().addActionListener(this);
        this.informe.getBtInforme4().addActionListener(this);
    }
    /**
     * metodo que inicaliza los elemetos
     */
    public void iniciar(){
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == informe.getBtImprimir()){
            try{
                 Modelo mod = new Modelo();
            Connection con = mod.getConnection();// JAJAJAJAJAJA ESTO NO VA A FUNCIONAR NUUNCANANANANANANAN
                                                                       // puesfunciono lol
            // cadena con ruta del informe
            String informe1 = "src/informes/primereporte.jasper";
                printer =   JasperFillManager.fillReport(informe1,null,con);
                String directorio = "src/pdf/informe1.pdf";
                JasperExportManager.exportReportToPdfFile(printer, directorio);
                // abrir el documento pdf
                File archivoGuardado = new File(directorio);
                Desktop.getDesktop().open(archivoGuardado);
            }catch(Exception ex){
                ex.printStackTrace();
            }
        }
        if(e.getSource() == informe.getjButton1())
        {
            Modelo mod = new Modelo();
            Connection con = mod.getConnection();// JAJAJAJAJAJA ESTO NO VA A FUNCIONAR NUUNCANANANANANANAN
                                                                       // puesfunciono lol
            // cadena con ruta del informe
            String informe1 = "src/informes/primereporte.jasper";
            // generacion en memoria
            try{
                printer =   JasperFillManager.fillReport(informe1,null,con);
                viewer = new JasperViewer(printer);
                //viewer.setVisible(true);
                jasperDialog = new JDialog();
                jasperDialog.setContentPane(viewer.getContentPane());
                jasperDialog.setSize(viewer.getSize());
                jasperDialog.setModal(true);
                jasperDialog.setLocationRelativeTo(null);
                jasperDialog.setVisible(true);
            }catch(Exception ex){
                ex.printStackTrace();
            }
            
        }
        
        if(e.getSource() == informe.getBtinforme3()){
            Modelo mod = new Modelo();
            Connection con = mod.getConnection();// JAJAJAJAJAJA ESTO NO VA A FUNCIONAR NUUNCANANANANANANAN
                                                                       // puesfunciono lol
            // cadena con ruta del informe
            String informe1 = "src/informes/informe3.jasper";
            // generacion en memoria
            try{
                Map parametro = new HashMap();
                // nombre del departamento valor
                parametro.put("Departamento", JOptionPane.showInputDialog("introduce departamento"));
                printer =   JasperFillManager.fillReport(informe1,parametro,con);
                viewer = new JasperViewer(printer);
                //viewer.setVisible(true);
                jasperDialog = new JDialog();
                jasperDialog.setContentPane(viewer.getContentPane());
                jasperDialog.setSize(viewer.getSize());
                jasperDialog.setModal(true);
                jasperDialog.setLocationRelativeTo(null);
                jasperDialog.setVisible(true);
            }catch(Exception ex){
                ex.printStackTrace();
            }
        }
        
        if(e.getSource() == informe.getBtInforme4()){
            Modelo mod = new Modelo();
            Connection con = mod.getConnection();// JAJAJAJAJAJA ESTO NO VA A FUNCIONAR NUUNCANANANANANANAN
                                                                       // puesfunciono lol
            // cadena con ruta del informe
            String informe1 = "src/informes/informe4.jasper";
            // generacion en memoria
            try{
                printer =   JasperFillManager.fillReport(informe1,null,con);
                viewer = new JasperViewer(printer);
                //viewer.setVisible(true);
                jasperDialog = new JDialog();
                jasperDialog.setContentPane(viewer.getContentPane());
                jasperDialog.setSize(viewer.getSize());
                jasperDialog.setModal(true);
                jasperDialog.setLocationRelativeTo(null);
                jasperDialog.setVisible(true);
            }catch(Exception ex){
                ex.printStackTrace();
            }
        
        }
    }
    
}
