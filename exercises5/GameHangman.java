package exercises5;

//exercise 14.17

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.*;
import javafx.stage.Stage; 


public class GameHangman extends Application{
	@Override //override start
	public void start(Stage primaryStage) {       
	    Pane pane = new Pane();
	    
	    
	    //Create Lines
	    Line line1 = new Line(15,12,175,12);
	    line1.setStrokeWidth(2);
	    line1.setStroke(Color.GREY);
	    pane.getChildren().add(line1); 
	    
	    Line line2 = new Line(15,15,15,275);
	    line2.setStrokeWidth(2);
	    line2.setStroke(Color.GREY);
	    pane.getChildren().add(line2); 
	    
	    Line line3 = new Line(175,15,175,115);
	    line3.setStrokeWidth(2);
	    line3.setStroke(Color.GREY);
	    pane.getChildren().add(line3); 
	    
	    Line line5 = new Line(130,65,175,55); 
	    line5.setStrokeWidth(2);
	    line5.setStroke(Color.GREY);
	    pane.getChildren().add(line5); 
	    
	    Line line6 = new Line(175,55,222,65);
	    line6.setStrokeWidth(2);
	    line6.setStroke(Color.GREY);
	    pane.getChildren().add(line6); 
	    
	    Line line7 = new Line(175,110,130,125);
	    line7.setStrokeWidth(2);
	    line7.setStroke(Color.GREY);
	    pane.getChildren().add(line7);
	    
	    Line line8 = new Line(175,110,215,125);
	    line8.setStrokeWidth(2);
	    line8.setStroke(Color.GREY);
	    pane.getChildren().add(line8);
	    
	    Circle circle1 = new Circle(175,45,20);
	    circle1.setFill(Color.GRAY);
	    pane.getChildren().add(circle1);
	    
	    
	 // Create a scene and place it in the stage
	    Scene scene = new Scene(pane, 500, 280);
	    primaryStage.setTitle("Hangman"); // Set the stage title
	    primaryStage.setScene(scene); // Place the scene in the stage
	    primaryStage.show(); // Display the stage
	}

	public static void main(String[] args) {
		
		launch (args);

	}

}
