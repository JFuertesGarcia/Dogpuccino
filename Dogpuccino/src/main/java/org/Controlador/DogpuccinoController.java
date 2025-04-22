package org.Controlador;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import javafx.scene.image.ImageView;
import java.io.IOException;
import java.sql.*;

public class DogpuccinoController {
    @FXML
    private Button btnBuscar, btnSesion, btnMenu;
    @FXML
    private Button btnInfo1, btnInfo2, btnInfo3;
    @FXML
    private Button btnAnterior, btnSiguiente;

    @FXML
    private TextField txtBuscar;

    @FXML
    private ImageView imagenPrincipal;

    @FXML
    private Pane footer, header, carrusel;

    @FXML
    private AnchorPane img1, img2, img3;

    public void abrirMasInfo(AnchorPane animal) throws IOException {
        Integer id = 123;
        //select pendiente
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(DogpuccinoApplication.class.getResource("/org/Vista/masinfo.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 300, 400);
        stage.setTitle("DOGPUCCINO - INFO");
        stage.setScene(scene);
        stage.show();
    }
    private void ejecutarSQL(String sql) {
        try {;
            Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "C##DOGPUCCINO", "123456");
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    };

    public void BotonInfo1() {
        try {
            abrirMasInfo((AnchorPane) btnInfo1.getParent());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void BotonInfo2() {
        try {
            abrirMasInfo((AnchorPane) btnInfo2.getParent());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void BotonInfo3() {
        try {
            abrirMasInfo((AnchorPane) btnInfo3.getParent());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void BotonBuscar() {
        System.out.println("Buscando");
    }
    public void BotonSesion() {
        System.out.println("Buscando");
    }
    public void BotonMenu() {
        System.out.println("Buscando");
    }
    public void BotonAnterior() {
        System.out.println("Buscando");
    }
    public void BotonSiguiente() {
        System.out.println("Buscando");
    }
}