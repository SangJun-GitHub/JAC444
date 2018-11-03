package practice;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * Created by bobsang89@gmail.com on 2018-11-03
 * Project: JAC444
 * Github : http://github.com/SangJun-GitHub
 */
public class _03ButtonInPane extends Application {
    @Override
    public void start(Stage PrimaryStage){
        Pane pane = new Pane();
        pane.getChildren().add(new Button("Ok"));
        Scene scene = new Scene(pane,300,350);
        PrimaryStage.setTitle("Button in pane");
        PrimaryStage.setScene(scene);
        PrimaryStage.show();

        Stage secondStage = new Stage();
        StackPane pane1 = new StackPane();
        pane1.getChildren().add(new Button("Good"));
        Scene scene1 = new Scene(pane1,200,250);
        secondStage.setTitle("Button in pane");
        secondStage.setScene(scene1);
        secondStage.show();

    }
}
