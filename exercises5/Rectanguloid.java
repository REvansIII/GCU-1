package exercises5;
// exercise 14.14

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Rectanguloid extends Application {
	@Override
	public void start(Stage primaryStage) {
		Pane pane1 = new Pane();

		double paneWidth = 200;
		double paneHeight = 200;
		double width = paneWidth * 0.90 - 30;
		double height = paneWidth * 0.90 - 60;
		double diff = Math.min(width, height) * 0.4;

		// front rectangle
		Rectangle r1 = new Rectangle(10, 60, width, height);
		r1.setFill(new Color(1, 1, 1, 0));
		r1.setStroke(Color.GRAY);

		// rearward rectangle
		Rectangle r2 = new Rectangle(30, 60 - diff, width, height);
		r2.setFill(new Color(1, 1, 1, 0));
		r2.setStroke(Color.GRAY);

		// corner lines
		Line line1 = new Line(10, 60, 30, 60 - diff);
		Line line2 = new Line(10, 60 + height, 30, 60 - diff + height);
		Line line3 = new Line(10 + width, 60, 30 + width, 60 - diff);
		Line line4 = new Line(10 + width, 60 + height, 30 + width, 60 - diff + height);

		pane1.getChildren().addAll(r1, r2, line1, line2, line3, line4); //add shapes to pane1 
		
		
		Scene scene = new Scene(pane1, paneWidth, paneHeight);
		primaryStage.setTitle("Rectanguloid"); // Title
		primaryStage.setScene(scene); // Scene
		primaryStage.show(); // Display Stage

	}

	public static void main(String[] args) {

		launch(args);
	}

}
