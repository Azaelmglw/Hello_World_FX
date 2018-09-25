package models;

import java.util.ArrayList;
import java.util.List;
import javafx.scene.Parent;
import javafx.stage.Stage;

/**
 *
 * @author Azaelmglw
 */

public class ModelMain {
    /*  Parents array list position:
    [0] -> main    |
    */
    
    private final Stage primaryStage;
    
    private String display_message;
    
    private List<Parent> parents = new ArrayList<>(5);
    
    public ModelMain(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }
    
    public Stage getPrimaryStage() {
        return primaryStage;
    }
    
    public String getDisplayMessage() {
        return display_message;
    }
    
    public void setDisplayMessage(String display_message) {
        this.display_message = display_message;
    }

    public Parent getParent(int parent_position) {
        return parents.get(parent_position);
    }

    public void setParent(int parent_position, Parent parent) {
        this.parents.add(parent_position, parent);
    }        
}