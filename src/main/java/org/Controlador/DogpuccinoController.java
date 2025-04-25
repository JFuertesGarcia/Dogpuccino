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
import java.time.LocalDate;
import java.time.Period;
import java.util.List;

public class DogpuccinoController {

    private DogpuccinoUtils utils; // Remove initialization here

    public void setUtils(DogpuccinoUtils utils) {
        this.utils = utils;
    }

    @FXML private Button btnBuscar, btnSesion, btnMenu;
    @FXML private Button btnInfo1, btnInfo2, btnInfo3;
    @FXML private Button btnAnterior, btnSiguiente;

    @FXML private TextField txtBuscar;

    @FXML private ImageView imagenPrincipal;

    @FXML private Pane footer, header, carrusel;

    @FXML private AnchorPane img1, img2, img3;

    @FXML private Label nombre_perro;
    @FXML private Label edad_sexo;

    @FXML private Label nombre_perro2;
    @FXML private Label edad_sexo2;

    @FXML private Label nombre_perro3;
    @FXML private Label edad_sexo3;

    @FXML private Label Edad, Sexo, Raza, Patologia, Nombre;

    public void abrirMasInfo(AnchorPane animal, Integer index) throws IOException {
        //select pendiente
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/org/Vista/masinfo.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        DogpuccinoController controller = fxmlLoader.getController();
        controller.setUtils(utils);

        Stage stage = new Stage();
        stage.setTitle("Más Información");
        stage.setScene(scene);
        stage.show();
        String ed = String.valueOf(calcularEdad(utils.getActualPerros().get(index).getFecha_nacimiento()));
        String se = String.valueOf(utils.getActualPerros().get(index).getSexo());
        String ra = String.valueOf(utils.getActualPerros().get(index).getRaza());
        String pa = String.valueOf(utils.getActualPerros().get(index).getPatologias());
        String no = String.valueOf(utils.getActualPerros().get(index).getNombre());

        controller.Edad.setText(     "Edad:        "+ed);
        controller.Sexo.setText(     "Sexo:        "+se);
        controller.Raza.setText(     "Raza:        "+ra);
        controller.Patologia.setText("Patologías: "+ pa);
        controller.Nombre.setText(no);

    }
    public void cargarPerros(List<Perro> seleccionados) {
        if (seleccionados == null || seleccionados.size() < 3) {
            System.err.println("La lista de perros no contiene 3 elementos.");
            return;
        }

        // Perro 1
        Perro p1 = seleccionados.get(0);
        nombre_perro.setText(p1.getNombre());
        edad_sexo.setText(calcularEdad(p1.getFecha_nacimiento()) + " años, " + p1.getSexo());

        // Perro 2
        Perro p2 = seleccionados.get(1);
        nombre_perro2.setText(p2.getNombre());
        edad_sexo2.setText(calcularEdad(p2.getFecha_nacimiento()) + " años, " + p2.getSexo());

        // Perro 3
        Perro p3 = seleccionados.get(2);
        nombre_perro3.setText(p3.getNombre());
        edad_sexo3.setText(calcularEdad(p3.getFecha_nacimiento()) + " años, " + p3.getSexo());
    }
    private int calcularEdad(LocalDate fechaNacimiento) {
        return Period.between(fechaNacimiento, LocalDate.now()).getYears();
    }
    public void Info1() throws IOException {
        try {
            abrirMasInfo((AnchorPane) btnInfo1.getParent(), 0);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void Info2() throws IOException {
        try {
            abrirMasInfo((AnchorPane) btnInfo2.getParent(), 1);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void Info3() throws IOException {
        try {
            abrirMasInfo((AnchorPane) btnInfo3.getParent(), 2);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void BotonBuscar() {
        System.out.println("Buscando");
    }
    public void BotonSesion() {

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