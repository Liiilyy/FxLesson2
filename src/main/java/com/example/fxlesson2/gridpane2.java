package com.example.fxlesson2;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.geometry.Insets;
import javafx.scene.layout.Priority;
import javafx.geometry.HPos;
import javafx.geometry.VPos;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.RowConstraints;

public class gridpane2 extends Application{

    public static void main(String[] args) {

        Application.launch(args);
    }

    @Override
    public void start(Stage stage) {

        Button first = new Button("Btn1");
        GridPane.setHalignment(first, HPos.RIGHT);
        GridPane.setValignment(first, VPos.BOTTOM);

        Button second = new Button("Btn2");


        second.setMaxWidth(Double.MAX_VALUE);
        GridPane.setHgrow(second, Priority.ALWAYS);

        Button third = new Button("Btn3");
        third.setMaxWidth(Double.MAX_VALUE);
        third.setMaxHeight(Double.MAX_VALUE);
        GridPane.setHgrow(third, Priority.ALWAYS);
        GridPane.setVgrow(third, Priority.ALWAYS);

        Button fourth = new Button("Btn4");
        // кнопка заполняет все пространство ячейки
        fourth.setMaxWidth(Double.MAX_VALUE);
        fourth.setMaxHeight(Double.MAX_VALUE);
        GridPane.setHgrow(fourth, Priority.ALWAYS);
        GridPane.setVgrow(fourth, Priority.ALWAYS);
        // 10 отступ
        GridPane.setMargin(fourth, new Insets(10));


        GridPane root = new GridPane();

        ColumnConstraints column1 = new ColumnConstraints();
        column1.setPercentWidth(50);
        root.getColumnConstraints().add(column1);

        ColumnConstraints column2 = new ColumnConstraints();
        column2.setPercentWidth(50);
        root.getColumnConstraints().add(column2);

        RowConstraints row1 = new RowConstraints();
        row1.setPercentHeight(50);
        root.getRowConstraints().add(row1);

        RowConstraints row2 = new RowConstraints();
        row2.setPercentHeight(50);
        root.getRowConstraints().add(row2);

        root.setGridLinesVisible(true);
        root.add(first, 0, 0);
        root.add(second, 0, 1);
        root.add(third, 1, 0);
        root.add(fourth, 1, 1);


        Scene scene = new Scene(root, 300, 200);
        stage.setScene(scene);

        stage.setTitle("GridPane in JavaFX");

        stage.show();
    }
}