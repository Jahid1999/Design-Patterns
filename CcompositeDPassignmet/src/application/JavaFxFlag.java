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
import javafx.stage.Stage;


public class JavaFxFlag implements EventHandler<ActionEvent> {

    Stage flag;

    public JavaFxFlag(Stage flag) {
        this.flag = flag;
    }

    public void handle(ActionEvent e) {
   
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
        pane.setHgap(5.5);
        pane.setVgap(5.5);



        pane.add(new Label("Length"), 0, 0);
        TextField len = new TextField();
        pane.add(len, 1, 0);
        pane.add(new Label("Width"), 0, 1);
        TextField wid = new TextField();
        pane.add(wid, 1, 1);

        Button draw = new Button("Done");
        Button exit = new Button("EXIT");
        Button back = new Button("Back");
        
        draw.setOnAction(event -> {

            Pane cpane = new Pane();

            Flag mflag = new Flag(Double.parseDouble(len.getText()),Double.parseDouble(wid.getText()));

            mflag.draw(cpane);

            Scene scene = new Scene(cpane,400,400);
            flag.setTitle("Flag");
            flag.setScene(scene); 
            flag.show(); 
            
        });
        
        pane.add(draw, 1, 2);
        pane.add(exit,2, 3);
        pane.add(back, 1, 3);
        GridPane.setHalignment(draw, HPos.CENTER);
        GridPane.setHalignment(back, HPos.RIGHT);
        GridPane.setHalignment(exit, HPos.RIGHT);

        Scene scene = new Scene(pane,400,400);
        flag.setTitle("Flag");
        flag.setScene(scene); 
        flag.show(); 
    }

}
