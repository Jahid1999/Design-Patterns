package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;



public class MainClass extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			 	GridPane pane = new GridPane();
		        pane.setAlignment(Pos.CENTER);
		        pane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
		        pane.setHgap(5.5);
		        pane.setVgap(5.5);

		        Button start = new Button("Start");
		       
		        Button exit = new Button("EXIT");
		       
		        start.setOnAction(new Menu(primaryStage));
		        
		        exit.setOnAction(e -> System.exit(0));
		      
		        pane.add(start, 0, 0);
		        pane.add(exit, 0, 1);
		        
		
		        Scene scene = new Scene(pane,400,400);
		        primaryStage.setTitle("Welcome To ShapeDrawer"); 
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
