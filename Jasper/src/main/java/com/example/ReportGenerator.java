package com.example;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.util.JRSaver;

import java.sql.Connection;
import java.util.HashMap;

public class ReportGenerator {
    public static void generateReport(String reportFile, String outputPDF, Connection connection) {
        try {
            JasperReport jasperReport = JasperCompileManager.compileReport("src/main/resources/" + reportFile);

            HashMap<String, Object> parameters = new HashMap<>();


            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, connection);

            JasperExportManager.exportReportToPdfFile(jasperPrint, outputPDF);

            System.out.println("Reporte generado: " + outputPDF);
        } catch (JRException e) {
            e.printStackTrace();
        }
    }
}
