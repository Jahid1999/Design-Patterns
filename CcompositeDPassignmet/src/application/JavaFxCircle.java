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
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class JavaFxCircle implements EventHandler<ActionEvent> {

    Stage circle;

    public JavaFxCircle(Stage circle) {
        this.circle = circle;
    }

    @Override
    public void handle(ActionEvent e) {
        
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
        pane.setHgap(5.5);
        pane.setVgap(5.5);

        pane.add(new Label("Radius: "), 0, 0);
        TextField rad = new TextField();
        pane.add(rad, 1, 0);
        pane.add(new Label("X: "), 0, 1);
        TextField x = new TextField();
        pane.add(x, 1, 1);
        pane.add(new Label("Y: "), 0, 2);
        TextField y = new TextField();
        pane.add(y, 1, 2);

        Button draw = new Button("Done");
        Button exit = new Button("EXIT");
        Button back = new Button("Back");
        
        draw.setOnAction(event -> {

            DrawCircle myCircle = new DrawCircle(Double.parseDouble(rad.getText()),Double.parseDouble(x.getText()),Double.parseDouble(y.getText()));
            Pane cpane = new Pane();
            myCircle.draw(cpane);
            Scene scene = new Scene(cpane,400,400);
            circle.setTitle("Circle"); 
            circle.setScene(scene); 
            circle.show();
        });
        
        //back.setOnAction(new Menu(pane));
        
        exit.setOnAction(event -> System.exit(0));
        
        pane.add(draw, 1, 3);
        pane.add(exit,2, 4);
        pane.add(back, 1, 4);
        GridPane.setHalignment(draw, HPos.CENTER);
        GridPane.setHalignment(back, HPos.RIGHT);
        GridPane.setHalignment(exit, HPos.RIGHT);

        Scene scene = new Scene(pane,400,400);
        circle.setTitle("CircleCredentials"); 
        circle.setScene(scene); 
        circle.show();
    }
}