package org.Controlador;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.Modelo.Perro;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class DogpuccinoApplication extends Application {

    @Override
    public void start(Stage stage) throws IOException, SQLException {

        FXMLLoader fxmlLoader = new FXMLLoader(DogpuccinoApplication.class.getResource("/org/Vista/inicio.fxml"));

        Scene scene = new Scene(fxmlLoader.load(), 840, 550);
        DogpuccinoController controller = fxmlLoader.getController();

        DogpuccinoUtils utils = new DogpuccinoUtils();
        List<Perro> perros = utils.elegirPerros();

        controller.setUtils(utils);
        controller.cargarPerros(perros);

        stage.setTitle("DOGPUCCINO - INICIO");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}