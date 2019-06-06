/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package malvaradosoftapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.HashMap;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import pe.edu.pucp.inf.malvaradosoft.config.DBManager;

/**
 *
 * @author alulab14
 */
public class MAlvaradoSoftApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws JRException {
        // TODO code application logic here
        
        try{
        HashMap hm = new HashMap();
        hm.put("ms_seccion", 1);
        hm.put("ms_idAlumno", 18);
        
         DBManager dbManager= DBManager.getDbManager();
         Connection con = DriverManager.getConnection(dbManager.getUrl(), dbManager.getUser(), dbManager.getPassword());
        
        JasperReport reporte = (JasperReport) JRLoader.loadObjectFromFile(MAlvaradoSoftApp.class.getResource("pe/edu/pucp/inf/malvaradosoft/reports/studentReport.jasper").getFile());

        
        JasperPrint impresion = JasperFillManager.fillReport(reporte, hm, con);
        
        JasperViewer visor = new JasperViewer(impresion);
        
        visor.setVisible(true);
        System.out.println("Hola");
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
    
}
