package com.hellocodeclub.memorygame;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application{

    @Override
    public void start(Stage stage) throws IOException {
        Parent root =FXMLLoader.load(getClass().getResource("main.fxml"));
        stage.setTitle("Memory Game");
        stage.setScene(new Scene(root));

        stage.show(); // IMPORTANT
    }

    public static void main(String[] args) {
    	
        launch();
    }

}
