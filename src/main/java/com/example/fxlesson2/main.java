package com.example.fxlesson2;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.Group;


public class main extends Application {
    public static void main(String[] args) {
        launch();
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        HBox hBox = new HBox();
        hBox.getChildren().addAll(new Button("one"), new Button("two"));
        hBox.setSpacing(5); //это растояние между первыми и вторыми кнопками
        hBox.setPadding(new Insets(150)); //оң жақ пен үстінен кнопкаларға дейінгі арақашықтық

        Group root = new Group();
        root.getChildren().addAll(hBox);
        primaryStage.setScene(new Scene(root, 400, 300));
        primaryStage.show();
    }
}

