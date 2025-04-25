package org.Controlador;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.Controlador.DogpuccinoUtils;
import java.io.IOException;
import java.sql.SQLException;

public class DogpuccinoApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException, SQLException {
        DogpuccinoUtils utils = new DogpuccinoUtils();
        DogpuccinoController controller = new DogpuccinoController();
        FXMLLoader fxmlLoader = new FXMLLoader(DogpuccinoApplication.class.getResource("/org/Vista/inicio.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 700, 450);
        stage.setTitle("DOGPUCCINO - INICIO");
        stage.setScene(scene);
        controller.cargarPerros(utils.elegirPerros(utils.obtenerPerros()));
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}