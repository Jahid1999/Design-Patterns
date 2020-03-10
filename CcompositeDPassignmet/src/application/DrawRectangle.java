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

public class DrawRectangle  extends CompositeShape {
	
	    DrawLine Tline;
	    DrawLine Rline;
	    DrawLine Bline;
	    DrawLine Lline;
	    
	    public DrawRectangle(double length, double width)
	    {
	        this.Tline = new DrawLine(150,150,150+length,150);
	        this.Rline = new DrawLine(150+length,150,150+length,150+width);
	        this.Bline = new DrawLine(150+length,150+width,150,150+width);
	        this.Lline = new DrawLine(150,150+width,150,150);

	        buildShape();
	    }

	    public void buildShape ()
	    {
	        shapes.add(Tline);
	        shapes.add(Rline);
	        shapes.add(Bline);
	        shapes.add(Lline);
	    }

}
