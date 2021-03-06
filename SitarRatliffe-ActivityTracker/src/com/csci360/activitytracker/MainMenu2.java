package com.csci360.activitytracker;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;

public class MainMenu2{	
	public static void MainMenu2() {
		try {
			// create a window for the MainMenu2 scene
			// set up text and buttons and translate to correct location 
			Stage window = new Stage();
			window.setTitle("MainMenu2");
			StackPane sp = new StackPane();
			Scene scene = new Scene(sp,Controller.width,Controller.height);
			Button info = new Button("Personal \nInformation"); 
			Button settings = new Button("Settings"); 
			Button back = new Button("Back"); 

			// buttons to each take you to own specific scene
			info.setTranslateY((-Controller.height/16)*5);
			info.setMaxSize(Controller.width, (Controller.height/8)*3);
			sp.getChildren().add(info);
			info.setOnAction(e -> PersonalInfoMenu.PersonalInfoMenu());
			
			settings.setTranslateY(Controller.height/16);
			settings.setMaxSize(Controller.width, (Controller.height/8)*3);
			sp.getChildren().add(settings);
			settings.setOnAction(e -> SettingsMenu.SettingsMenu());
			
			// back button takes you back to previous scene
			back.setTranslateY((Controller.height/8)*3);
			back.setMaxSize(Controller.width, Controller.height/4);
			sp.getChildren().add(back);	
			back.setOnAction(e -> window.close());

			window.setScene(scene);
			window.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
