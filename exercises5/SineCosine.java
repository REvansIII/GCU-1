package exercises5;

//exercise 14.19

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polyline;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class SineCosine extends Application {
	@Override
	
	public void start(Stage primaryStage){
		Pane pane = new Pane();

		Polyline p1 = new Polyline();
		ObservableList<Double> list = p1.getPoints();
	    p1.setStroke(Color.BLUE);
	    
	    
	    double scaleFactor = 50;
	    for (int x = -170; x <= 170; x++) {
	    	list.add( x + 200.0);
	    	 list.add(100.0 - scaleFactor * Math.sin(x/100.0)* 2.0 * Math.PI);
	    	}
	    	 
	   //add axis
	    Line line1 = new Line(10, 200, 390, 200);
	    Line line2 = new Line(200, 30, 200, 390);
	    

	    Text t1 = new Text(380, 170, "X");
	    Text t2 = new Text(220, 40, "Y");
	    Text t3 = new Text(10, 210, "-2\u03c0"  );
	    Text t4 = new Text(370, 210,"2\u03c0" );
	    	 
	    	 pane.getChildren().addAll(p1, line1, line2, t1, t2, t3, t4); 

	    	 Scene scene = new Scene(pane);
	    	 	primaryStage.setTitle("SineCosine"); // Title
	    	    primaryStage.setScene(scene); // set Scene on stage
	    	    primaryStage.show(); // Display stage
	    	  }

	    
	    
		
		
	

	public static void main(String[] args) {
		
		launch(args);

	}

}
