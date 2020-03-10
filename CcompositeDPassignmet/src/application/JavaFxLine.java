package application;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class JavaFxLine implements EventHandler<ActionEvent> {

    Stage lineStage;

    public JavaFxLine(Stage lineStage) {
        this.lineStage = lineStage;
    }

    @Override
    public void handle(ActionEvent e) {
      
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
        pane.setHgap(5.5);
        pane.setVgap(5.5);

        pane.add(new Label("x1: "), 0, 0);
        TextField x1 = new TextField();
        pane.add(x1, 1, 0);

        pane.add(new Label("y1: "), 2, 0);
        TextField y1 = new TextField();
        pane.add(y1, 3, 0);

        pane.add(new Label("x2: "), 0, 1);
        TextField x2 = new TextField();
        pane.add(x2, 1, 1);

        pane.add(new Label("y2: "), 2, 1);
        TextField y2 = new TextField();
        pane.add(y2, 3, 1);


        Button draw = new Button("Done");
        Button exit = new Button("EXIT");
        Button back = new Button("Back");
        
        draw.setOnAction(event -> {
            DrawLine line = new DrawLine(Double.parseDouble(x1.getText()),Double.parseDouble(y1.getText()), Double.parseDouble(x2.getText()),Double.parseDouble(y2.getText()));
            Pane cpane = new Pane ();
            line.draw(cpane);
            
            GridPane out = new GridPane();
            Button exit1 = new Button("EXIT");
            out.add(exit1,0,0);
            GridPane.setHalignment(exit1, HPos.CENTER);
            exit1.setOnAction(ev -> System.exit(0));
            
            Scene scene = new Scene(cpane,600,600);
            lineStage.setTitle("Line"); 
            lineStage.setScene(scene); 
            lineStage.show();
            
        });
        
        //back.setOnAction(new Menu(pane));
        
        exit.setOnAction(event -> System.exit(0));
        
        pane.add(draw, 1, 4);
        pane.add(exit,2,5);
        pane.add(back, 1, 5);
        GridPane.setHalignment(draw, HPos.CENTER);
        GridPane.setHalignment(back, HPos.RIGHT);
        GridPane.setHalignment(exit, HPos.RIGHT);

        Scene scene = new Scene(pane);
        lineStage.setTitle("LineCredentials"); 
        lineStage.setScene(scene); 
        lineStage.show(); 
    }
    
    
}