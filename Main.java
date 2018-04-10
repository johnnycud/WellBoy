package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/FXML/sample.fxml"));
        /*Group root = new Group();
        Text txt = new Text("Well Boy!");
        txt.setFont(new Font("Papyrus", 80));
        Label label = new Label("Name:");
        TextField nameFld = new TextField();
        GridPane grid = new GridPane();
        grid.add(label, 0, 0);
        grid.add(nameFld,1,0);
        grid.setHgap(20);
        Button btn = new Button();
        grid.add(btn,1,1);
       // grid.setGridLinesVisible(true);
        btn.setText("Say Well Boy!");
        btn.setOnAction(evt -> System.out.printf("Well Boy %s %n",
                nameFld. getText()));
        txt.setY(10);
        VBox box = new VBox();
        box.getChildren().addAll(txt,grid);
        root.getChildren().add(box);*/
        primaryStage.setTitle("WellBoy");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
