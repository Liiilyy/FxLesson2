package com.example.fxlesson2;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

public class anchorpane extends Application{

    public static void main(String[] args) {

        Application.launch(args);
    }

    @Override
    public void start(Stage stage) {

        Button topBtn = new Button("Btn1");
        AnchorPane.setTopAnchor(topBtn, 10.0);
        AnchorPane.setLeftAnchor(topBtn, 60.0);
        AnchorPane.setRightAnchor(topBtn, 60.0);

        Button bottomBtn = new Button("Btn3");
        AnchorPane.setBottomAnchor(bottomBtn, 10.0);
        AnchorPane.setLeftAnchor(bottomBtn, 60.0);
        AnchorPane.setRightAnchor(bottomBtn, 60.0);

        Button leftBtn = new Button("Btn2");
        AnchorPane.setTopAnchor(leftBtn, 30.0);
        AnchorPane.setLeftAnchor(leftBtn, 15.0);
        AnchorPane.setBottomAnchor(leftBtn, 30.0);

        Button rightBtn = new Button("Btn4");
        AnchorPane.setTopAnchor(rightBtn, 30.0);
        AnchorPane.setRightAnchor(rightBtn, 10.0);
        AnchorPane.setBottomAnchor(rightBtn, 30.0);

        AnchorPane root = new AnchorPane(topBtn, rightBtn, bottomBtn, leftBtn);

        Scene scene = new Scene(root, 300, 200);
        stage.setScene(scene);

        stage.setTitle("AnchorPane in JavaFX");

        stage.show();
    }
}