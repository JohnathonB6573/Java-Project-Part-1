package com.example.libarysystem;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

import java.io.IOException;

public class HelloController {

    public void exitStage(ActionEvent actionEvent) {
        Platform.exit();
    }

    public void newMember(ActionEvent actionEvent)throws IOException {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("newMember.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 300, 400); // Update the scene size here
        stage.setTitle("New Member Collection:");
        stage.setScene(scene);
        stage.show();
    }
}