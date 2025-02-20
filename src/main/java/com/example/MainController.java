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
    private TextField lengthField;

    @FXML
    private TextField startField;

    @FXML
    void onClickSaveButton(ActionEvent event) {
        writeToFile();
        addToDatabase();
    }

    @FXML
    void onClickExitButton(ActionEvent event) {
        System.exit(0);
    }

    private void writeToFile()
    {
        Write write = new Write();
        write.writeToFile(
            lengthField.getText(), 
            difficultyField.getText(), 
            startField.getText(), 
            destinationField.getText());
    }

    private void addToDatabase()
    {
        DataSource.tryCreateUtvonal(new Utvonal(
            Double.parseDouble(lengthField.getText()), 
            Integer.parseInt(difficultyField.getText()), 
            startField.getText(), 
            destinationField.getText()));
    }

}
