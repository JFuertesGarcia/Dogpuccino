package org.Controlador;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.*;

public class DogpuccinoUtils {

    public void ejecutarCRUD(String sql) {
        try (Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","C##DOGPUCCINO","123456");
             Statement stmt = conn.createStatement()) {

            int filas = stmt.executeUpdate(sql);
            System.out.println("Filas afectadas: " + filas);

        } catch (SQLException e) {
            System.err.println("Error al ejecutar SQL: " + e.getMessage());
        }
    }

}
