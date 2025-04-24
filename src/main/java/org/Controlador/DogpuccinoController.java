package org.Controlador;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import javafx.scene.image.ImageView;
import org.Modelo.Perro;

import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.Period;
import java.util.List;

public class DogpuccinoController {
    @FXML private Button btnBuscar, btnSesion, btnMenu;
    @FXML private Button btnInfo1, btnInfo2, btnInfo3;
    @FXML private Button btnAnterior, btnSiguiente;

    @FXML private TextField txtBuscar;

    @FXML private ImageView imagenPrincipal;

    @FXML private Pane footer, header, carrusel;

    @FXML private AnchorPane img1, img2, img3;

    @FXML private Label img1LabelNombre;
    @FXML private Label img1LabelEdadSexo;

    @FXML private Label img2LabelNombre;
    @FXML private Label img2LabelEdadSexo;

    @FXML private Label img3LabelNombre;
    @FXML private Label img3LabelEdadSexo;

    public void abrirMasInfo(AnchorPane animal) throws IOException {
        Integer id = 123;
        //select pendiente
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(DogpuccinoApplication.class.getResource("/org/Vista/masInfo.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 300, 400);
        stage.setTitle("DOGPUCCINO - INFO");
        stage.setScene(scene);
        stage.show();
    }
    public void cargarPerros(List<Perro> seleccionados) {
        if (seleccionados == null || seleccionados.size() < 3) {
            System.err.println("La lista de perros no contiene 3 elementos.");
            return;
        }

        // Perro 1
        Perro p1 = seleccionados.get(0);
        img1LabelNombre.setText(p1.getNombre());
        img1LabelEdadSexo.setText(calcularEdad(p1.getFecha_nacimiento()) + " años, " + p1.getSexo());

        // Perro 2
        Perro p2 = seleccionados.get(1);
        img2LabelNombre.setText(p2.getNombre());
        img2LabelEdadSexo.setText(calcularEdad(p2.getFecha_nacimiento()) + " años, " + p2.getSexo());

        // Perro 3
        Perro p3 = seleccionados.get(2);
        img3LabelNombre.setText(p3.getNombre());
        img3LabelEdadSexo.setText(calcularEdad(p3.getFecha_nacimiento()) + " años, " + p3.getSexo());
    }
    private int calcularEdad(LocalDate fechaNacimiento) {
        return Period.between(fechaNacimiento, LocalDate.now()).getYears();
    }

    public void BotonBuscar() {
        try {
            abrirMasInfo((AnchorPane) btnInfo1.getParent());
        } catch (IOException e) {
            e.printStackTrace();
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