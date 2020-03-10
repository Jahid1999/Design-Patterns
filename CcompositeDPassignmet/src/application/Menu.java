package application;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Menu implements EventHandler<ActionEvent> {

    Stage menu;

    public Menu(Stage menu) {
        this.menu = menu;
    }

    
@Override
	public void handle(ActionEvent event) {
		// TODO Auto-generated method stub
		try {
		 	GridPane pane = new GridPane();
	        pane.setAlignment(Pos.TOP_CENTER);
	        pane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
	        pane.setHgap(5.5);
	        pane.setVgap(5.5);
	
	        Button line = new Button("DrawLine");
	        Button circle= new Button("DrawCircle");
	        Button rectangle = new Button("DrawRectangle");
	        Button flag = new Button("DrawFlag");
	        Button exit = new Button("EXIT");
	       
	        line.setOnAction(new JavaFxLine(menu));
	        circle.setOnAction(new JavaFxCircle(menu));
	        rectangle.setOnAction(new JavaFxRec(menu));
	        flag.setOnAction(new JavaFxFlag(menu));
	        
	        exit.setOnAction(e -> System.exit(0));
	      
	        pane.add(line, 0, 0);
	        pane.add(circle, 0, 1);
	        pane.add(rectangle, 0, 2);
	        pane.add(flag, 0, 3);
	        pane.add(exit, 0, 4);
	
	        Scene scene = new Scene(pane,300,300);
	        menu.setTitle("ShapeDrawer"); 
	        menu.setScene(scene); 
	        menu.show(); 
		} catch(Exception e) {
		e.printStackTrace();
		}
		
	}
    

}
