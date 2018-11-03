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

//import javafx.application.Application;
public class _01MyJavaFx extends Application {
    @Override
    //import javafx.stage.Stage;
    public void start(Stage PrimaryStage){
        //import javafx.scene.control.Button;
        Button button = new Button("Ok");
        //import javafx.scene.Scene;
        Scene scene = new Scene(button,200,250);
        PrimaryStage.setTitle("MyJavaFx");
        PrimaryStage.setScene(scene);
        PrimaryStage.show();
    }

    public static void main(String[] args){
        Application.launch();
    }
}
