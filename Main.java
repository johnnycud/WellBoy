package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        //Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Group root = new Group();
        Text txt = new Text("Well Boy!");
        TextField nameFld = new TextField();
        Button btn = new Button();
        btn.setText("Say Well Boy!");
        btn.setOnAction(evt -> System.out.printf("Well Boy %s %n",
                nameFld. getText()));
        primaryStage.setTitle("WellBoy");
        txt.setY(10);
        VBox box = new VBox();
        box.getChildren().addAll(txt,nameFld, btn);
        root.getChildren().add(box);
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
