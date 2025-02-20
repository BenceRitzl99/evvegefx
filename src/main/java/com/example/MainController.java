package com.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;


public class MainController {

    @FXML
    private TextField destinationField;

    @FXML
    private TextField difficultyField;

    @FXML
    private TextField lenghtField;

    @FXML
    private TextField startField;

    @FXML
    void onClickSaveButton(ActionEvent event) {
        Write write = new Write();
        write.writeToFile(lenghtField.getText(), difficultyField.getText(), startField.getText(), destinationField.getText());
    }

}
