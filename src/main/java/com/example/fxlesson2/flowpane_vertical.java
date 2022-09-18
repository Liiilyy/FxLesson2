package com.example.fxlesson2;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;

public class flowpane_vertical extends Application{

    public static void main(String[] args) {

        Application.launch(args);
    }

    @Override
    public void start(Stage stage) {

        Label label1 = new Label("Label1");
        Label label2 = new Label("Label2");
        Label label3 = new Label("Label3");
        Label label4 = new Label("Label4");
        Label label5 = new Label("Label5");
        Label label6 = new Label("Label6");
        Label label7 = new Label("Label7");
        Label label8 = new Label("Label8");
        Label label9 = new Label("Label9");
        Label label10 = new Label("Label10");
        Label label11 = new Label("Label11");
        Label label12 = new Label("Label12");

        FlowPane root = new FlowPane(10, 10, label1, label2, label3, label4, label5, label6, label7, label8, label9, label10, label11, label12);

        Scene scene = new Scene(root);
        stage.setScene(scene);

        stage.setTitle("FlowPane in JavaFX");
        stage.setWidth(300);
        stage.setHeight(200);

        stage.show();
    }
}