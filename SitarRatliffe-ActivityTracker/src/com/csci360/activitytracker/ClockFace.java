package com.csci360.activitytracker;
	
import java.util.Calendar;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;


public class ClockFace extends Application {
	
	final protected int width = 54;
	final protected int height = 160;
	
	@Override
	public void start(Stage primaryStage) {
		try {
			primaryStage.setTitle("Clock Face");
			StackPane sp = new StackPane();
			Scene scene = new Scene(sp,width,height);
			Button b = new Button("12:45a"); 			//same as b.setText("It's working!!!");
			b.setLayoutX(width/2);
			b.setLayoutY(height/2);
			b.setMaxSize(width, height);
			sp.getChildren().add(b);
			
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}