package practice;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import static javafx.scene.paint.Color.BLACK;
import static javafx.scene.paint.Color.RED;

/**
 * Created by bobsang89@gmail.com on 2018-11-03
 * Project: JAC444
 * Github : http://github.com/SangJun-GitHub
 */
public class _04Circle extends Application {
    @Override
    public void start(Stage PrimaryStage){
        Pane pane = new Pane();
        Circle circle = new Circle(50);
        pane.getChildren().add(circle);
        Scene scene = new Scene(pane, 300,350);
        circle.setCenterY(scene.getHeight()/2);
        circle.setCenterX(scene.getWidth()/2);
        circle.setStroke(RED);
        circle.setFill(BLACK);
        PrimaryStage.setTitle("Circle");
        PrimaryStage.setScene(scene);
        PrimaryStage.show();
    }
}
