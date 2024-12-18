package com.example;

import java.sql.Connection;

public class MainApp {
    public static void main(String[] args) {
        Connection connection = DatabaseConnection.connect();

        if (connection != null) {

            System.out.println("Generando reportes...");
            ReportGenerator.generateReport("listado_peliculas.jrxml", "listado_peliculas.pdf", connection);
            ReportGenerator.generateReport("mal_estado.jrxml", "peliculas_mal_estado.pdf", connection);
            ReportGenerator.generateReport("mas_copias.jrxml", "peliculas_mas_copias.pdf", connection);
            ReportGenerator.generateReport("detalle_copia.jrxml", "detalle_copia.pdf", connection);
        } else {
            System.out.println("No se pudo conectar a la base de datos.");
        }
    }
}
