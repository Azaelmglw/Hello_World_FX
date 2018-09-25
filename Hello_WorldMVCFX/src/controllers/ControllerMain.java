package controllers;

import models.ModelMain;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.scene.control.Label;

/**
 *
 * @author Azaelmglw
 */

public class ControllerMain implements Initializable {
    
    private final ModelMain model_main;
    
    public ControllerMain(ModelMain model_main){
        this.model_main = model_main;
    }
         
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
    }
    
    @FXML
    private Label welcome_screen_lbl;
    
    @FXML
    private void DisplayHelloMessage(ActionEvent event) {
        model_main.setDisplayMessage("Hello MVC");
        welcome_screen_lbl.setText(model_main.getDisplayMessage());
    }
    
    @FXML
    private void DisplayByeMessage(ActionEvent event) {
        model_main.setDisplayMessage("Bye MVC");
        welcome_screen_lbl.setText(model_main.getDisplayMessage());
    }
}