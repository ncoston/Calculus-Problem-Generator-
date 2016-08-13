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
import javax.ws.rs.core.Response;

/**
 *
 * @author Natalie
 */


/*This files handles the mouse and keyboard input.

*/

//Our AppID is: GLHTK4-96L2PVQT4T
public class FXMLExampleController {
    
    
    
    @FXML private Label actiontarget;
    
    @FXML private TextArea textEntered;
    
    
    @FXML protected void sendText(ActionEvent event) {
        String appId = "GLHTK4-96L2PVQT4T";
        String input = "Nothing entered";
        Client client = ClientBuilder.newClient();
        WebTarget wolframTarget = client.target("http://api.wolframalpha.com/v2/query");
        //When the Client instance is uncommented the code will run, but produce an exception if this line is called.
        //WebTarget resourceWebTarget = client.target(path);
        //Something about how WebTaget.path is non-static and can't be referenced from a static context?
        if (textEntered.getText() != null) {
            input = textEntered.getText();
            WebTarget queryTarget = wolframTarget.queryParam("input", input).queryParam("appid", appId);
            Response response = queryTarget.request().get();
            actiontarget.setText(response.toString());
            System.out.println(response);
        }
            
            
        }
        
        
        
    }

