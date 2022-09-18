package com.example.fxlesson2;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.geometry.Orientation;

public class flowpane extends Application{

    public static void main(String[] args) {

        Application.launch(args);
    }

    @Override
    public void start(Stage stage) {

        Label label1 = new Label("L1");
        Label label2 = new Label("L2");
        Label label3 = new Label("L3");
        Label label4 = new Label("L4");
        Label label5 = new Label("L5");
        Label label6 = new Label("L6");
        Label label7 = new Label("L7");
        Label label8 = new Label("L8");
        Label label9 = new Label("L9");

        FlowPane root = new FlowPane();
        root.setVgap(8);
        root.setHgap(15);
        root.setOrientation(Orientation.VERTICAL);
        root.getChildren().addAll(label1, label2, label3, label4, label5, label6, label7, label8, label9);
        Scene scene = new Scene(root, 300, 150);
        stage.setScene(scene);

        stage.setTitle("FlowPane in JavaFX");

        stage.show();
    }
}