package practice;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * Created by bobsang89@gmail.com on 2018-11-03
 * Project: JAC444
 * Github : http://github.com/SangJun-GitHub
 */
public class _02MultipleStage extends Application {
    @Override
    public void start(Stage PrimaryStage){
        Scene scene = new Scene(new Button("Ok"),300,350);
        PrimaryStage.setTitle("MyJavaFx");
        PrimaryStage.setScene(scene);
        PrimaryStage.show();

        Stage stage = new Stage();
        stage.setTitle("Second Stage");
        stage.setScene(new Scene(new Button("new stage"),200,250));
        stage.setResizable(false);
        stage.show();
    }
}
