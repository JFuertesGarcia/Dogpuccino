package org.Controlador;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.control.*;
import org.Enums.Adoptado;
import org.Enums.Sexo;
import org.Modelo.Perro;

import java.io.IOException;
import java.sql.*;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
    public ResultSet ejecutarConsulta(String sql) {
        ResultSet rs = null;
        try (Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","C##DOGPUCCINO","123456");
             Statement stmt = conn.createStatement()) {

            rs = stmt.executeQuery(sql);

        } catch (SQLException e) {
            System.err.println("Error al ejecutar SQL: " + e.getMessage());
        }
        return rs;
    }
    public List<Perro> obtenerPerros() throws SQLException {
        List<Perro> perros = new ArrayList<>();
        ResultSet rs = ejecutarConsulta("SELECT * FROM Perro");
        while (rs.next()) {
            Perro perro = new Perro();
            perro.setId(rs.getInt("id"));
            perro.setNombre(rs.getString("nombre"));
            perro.setSexo(Sexo.valueOf(rs.getString("sexo")));
            perro.setFoto(rs.getString("foto"));
            perro.setAdoptado(Adoptado.valueOf(rs.getString("adoptado")));
            perro.setFecha_nacimiento(rs.getDate("fecha_nacimiento").toLocalDate());
            perro.setFechaAlta(rs.getDate("fecha_alta").toLocalDate());
            perro.setFechaModificacion(rs.getDate("fecha_modificacion").toLocalDate());

            perros.add(perro);
        }
        return perros;
    }
    public List<Perro> elegirPerros(List<Perro> lista){
        if (lista.size() < 3) {
            throw new IllegalArgumentException("La lista debe contener al menos 3 elementos.");
        }
        List<Perro> copia = new ArrayList<Perro>(lista);
        Collections.shuffle(copia);
        List<Perro> seleccionados = new ArrayList<Perro>(copia.subList(0, 3));
        return seleccionados;
    }



}
