/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Accordion;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Reznov
 */
public class HomeController extends Accordion {
    
    public HomeController(Stage stage) {
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource(this.getClass().getSimpleName().replace("Controller", "") + ".fxml"));

        loader.setController(this);
        loader.setRoot(this);
        loader.setClassLoader(getClass().getClassLoader());

        try {
            Parent root = (Parent) loader.load();
            stage.setTitle("Merge circuits");
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException ex) {
            System.err.println("Failed to load Home fxml file.");
            ex.printStackTrace();
        }
    }
    
}
