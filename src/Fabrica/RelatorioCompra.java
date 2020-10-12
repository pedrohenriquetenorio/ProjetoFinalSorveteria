/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fabrica;

import java.io.InputStream;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.query.JRJpaQueryExecuterFactory;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author pedro
 */
public class RelatorioCompra {
    
    public void gerar (EntityManager em, String relatorio){
        
        try {
            HashMap<String, Object> parameters = new HashMap<>();
            parameters.put(JRJpaQueryExecuterFactory.PARAMETER_JPA_ENTITY_MANAGER, em);
            parameters.put("compra", "a");
            //busca o arquivo que sera executado
            InputStream jasperReport = getClass().getResourceAsStream(relatorio);
            JasperFillManager.fillReport(jasperReport, parameters);
            
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters);
            JasperViewer viewer = new JasperViewer(jasperPrint,true);
        } catch (JRException ex) {
            Logger.getLogger(RelatorioCompra.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
