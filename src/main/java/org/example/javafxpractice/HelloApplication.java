package org.example.javafxpractice;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.scene.image.Image;

import java.io.IOException;
import java.util.Objects;

public class HelloApplication extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        //Stage stage = new Stage();
        //Group is an obj for grouping objects together
//        Group root = new Group();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("movement.fxml"));
        Parent root = loader.load();
        MovementController controller = loader.getController();
        Scene scene = new Scene(root);
        stage.setResizable(false);

        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent keyEvent) {
                switch(keyEvent.getCode()) {
                    case W:
                        controller.moveUpward();
                        break;
                    case A:
                        controller.moveLeft();
                        break;
                    case S:
                        controller.moveDownward();
                        break;
                    case D:
                        controller.moveRight();
                        break;
                    default:
                        break;
                }
            }
        });


        //Application Icon and Title
        Image icon = new Image("itsuseless.png");
        stage.getIcons().add(icon);
        stage.setTitle("Gallo Coraje Shirt");

        //Text
//        Text someText = new Text("Who is this guy?");
//        someText.setX(60);
//        someText.setY(60);
//        someText.setFont(Font.font("Times New Roman", 60));
//
//        root.getChildren().add(someText);

        stage.setScene(scene);
        stage.show();
    }
}

//    @Override
//    public void start(Stage stage) throws IOException {
//        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
//        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
//        stage.setTitle("Hello!");
//        stage.setScene(scene);
//        stage.show();
//    }


//    public static void main(String[] args) {
//        launch();
//    }