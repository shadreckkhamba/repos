package com.roomlight.roomlight;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class RoomLight extends Application {
    @Override
    public void start(Stage primaryStage) {
        Rectangle room1 = new Rectangle();
        Rectangle room2 = new Rectangle();
        Rectangle room3 = new Rectangle();
        Rectangle room4 = new Rectangle();
        Rectangle room5 = new Rectangle();
        Rectangle room6 = new Rectangle();
        Rectangle room7 = new Rectangle();


        FlowPane flowpane = new FlowPane();


        Scene scene = new Scene(pane, 500, 300);
        primaryStage.setTitle("MyHouse");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}