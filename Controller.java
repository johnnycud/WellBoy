package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private TextField firstName;

    public void handleSayWellBoy(ActionEvent actionEvent) {
        System.out.printf("Well Boy %s! %n", firstName.getText());
    }
}
