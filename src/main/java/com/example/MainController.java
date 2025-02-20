package com.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
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

    private void addToDatabase() {
        try {
            double length = Double.parseDouble(lengthField.getText());
            int difficulty = Integer.parseInt(difficultyField.getText());
    
            if (difficulty < 1 || difficulty > 10) {
                showAlert("Error", "Difficulty must be a number between 1-10");
                return;
            }
    
            DataSource.tryCreateUtvonal(new Utvonal(
                length, 
                difficulty, 
                startField.getText(), 
                destinationField.getText()));
        } catch (NumberFormatException e) {
            showAlert("Error", "Length and Difficulty must be a valid number");
        } catch (Exception e) {
            showAlert("Error", "Failed to add data to the database: " + e.getMessage());
        }
    }
    
    private void showAlert(String title, String message) {
        Alert alert = new Alert(AlertType.ERROR);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
