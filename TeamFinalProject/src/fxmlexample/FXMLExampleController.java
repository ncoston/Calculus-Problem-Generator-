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
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

/**
 *
 * @author Natalie
 */


/*This files handles the mouse and keyboard input.

*/
public class FXMLExampleController {
    
    
    
    @FXML private Label actiontarget;
    
    @FXML private TextArea textEntered;
    
    
    @FXML protected void sendText(ActionEvent event) {
        String string = "Nothing entered";
        String path = "http://api.wolframalpha.com";
        Client client = ClientBuilder.newClient();
        //When the Client instance is uncommented the code will run, but produce an exception if this line is called.
        WebTarget resourceWebTarget = client.target(path);
        //Something about how WebTaget.path is non-static and can't be referenced from a static context?
        if (textEntered.getText() != null) {
            string = textEntered.getText();
        }
            actiontarget.setText(string);
            System.out.println(string);
        }
        
        
        
    }

