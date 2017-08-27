/**
 *
 * @date Jun 20, 2017
 * 
 * @author Reznov
 * @website http://www.reznov.be/
 */

package main;
import ability.AbilityScoreIncrease;
import gui.HomeController;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import races.Dwarf;
import races.Hill_Dwarf;
import races.Mountain_Dwarf;

public class StartUp extends Application {

    @Override
    public void start(Stage primaryStage) {
        new HomeController(primaryStage);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
        
        Dwarf dwarf = new Mountain_Dwarf();
        for (AbilityScoreIncrease asi : dwarf.abilityScoreIncrease()) {
            System.out.println(asi.toString());
        }
    }

}
