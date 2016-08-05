/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fxmlexample;
 
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

/**
 *
 * @author Natalie
 */


/*This files handles the mouse and keyboard input.

*/
public class FXMLExampleController {
    @FXML private Label actiontarget;
    @FXML private TextArea actiontarget2;
    
    @FXML protected void handleCheckYourAnswer(ActionEvent event) {
        actiontarget.setText("You got an incorrect answer because you're stupid.");
    }
    
    @FXML protected void handleLimits(ActionEvent event) {
        actiontarget2.setText("Here's a limit you fat fuck.");
    }
    
}