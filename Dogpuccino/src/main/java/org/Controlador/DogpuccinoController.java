package org.Controlador;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import javafx.scene.image.ImageView;
import java.io.IOException;

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
        FXMLLoader fxmlLoader = new FXMLLoader(DogpuccinoApplication.class.getResource("/org/Vista/inicio.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 900, 600);
        stage.setTitle("DOGPUCCINO - INFO");
        stage.setScene(scene);
        stage.show();
    }
    private void handleInfoButton1() throws IOException {
        abrirMasInfo((AnchorPane) btnInfo1.getParent());
    }
    private void handleInfoButton2 () throws IOException {
        abrirMasInfo((AnchorPane) btnInfo2.getParent());
    }
    private void handleInfoButton3() throws IOException {
        abrirMasInfo((AnchorPane) btnInfo2.getParent());
    }
    public void BotonBuscar() {
        try {
            abrirMasInfo((AnchorPane) btnInfo1.getParent());
        } catch (IOException e) {
            e.printStackTrace();
            // Aquí podrías también mostrar una alerta si quieres avisar al usuario
        }
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