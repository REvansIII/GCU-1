package exercises5;

//exercise 14.12


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;



public class BarChart extends Application {
@Override //override start

public void start(Stage primaryStage) {       
    Pane pane = new Pane();
    
    double height = 350;
    double paneHeight = 175;

    //create rectangle 1
    Rectangle r1 = new Rectangle(10, paneHeight - height * 0.2, 100, height * 0.2);
    r1.setFill(Color.RED);
    Text text1 = new Text(10, paneHeight - height * 0.2 - 10, "Project -- 20%");

    //create rectangle 2
    Rectangle r2 = new Rectangle(10 + 110, paneHeight - height * 0.1, 100, height * 0.1);
    r2.setFill(Color.BLUE);
    Text text2 = new Text(10 + 110, paneHeight - height * 0.1 - 10, "Quiz -- 10%");

    //create rectangle 3
    Rectangle r3 = new Rectangle(10 + 220, paneHeight - height * 0.3, 100, height * 0.3);
    r3.setFill(Color.GREEN);
    Text text3 = new Text(10 + 220, paneHeight - height * 0.3 - 10, "Midterm -- 30%");

    //create rectangle 4
    Rectangle r4 = new Rectangle(10 + 330, paneHeight - height * 0.4, 100, height * 0.4);
    r4.setFill(Color.ORANGE);
    Text text4 = new Text(10 + 330, paneHeight - height * 0.4 - 10, "Final -- 40%");

    pane.getChildren().addAll(r1, text1, r2, text2, r3, text3, r4, text4);

    Scene scene = new Scene(pane, 500, paneHeight);
    primaryStage.setTitle("BarChart");
    primaryStage.setScene(scene);
    primaryStage.show();
  }

	


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		launch (args);
	}

}
