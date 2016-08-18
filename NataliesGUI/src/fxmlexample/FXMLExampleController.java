/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fxmlexample;
 
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.text.Text;

/**
 *
 * @author Natalie
 */


/*This files handles the mouse and keyboard input.

*/
public class FXMLExampleController {
    @FXML private Label actiontarget;
    @FXML private Label integrationAction;
    
    @FXML protected void handleSubmitButtonAction(ActionEvent event) {
        actiontarget.setText("You got an incorrect answer because you're stupid.");
    }
    
    @FXML protected void getWolfram(ActionEvent event1){
        integrationAction.setText("Getting Wolfram");
    }

}