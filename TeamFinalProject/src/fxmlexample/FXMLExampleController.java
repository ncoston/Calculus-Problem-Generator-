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

public class FXMLExampleController {
    /**We'll need our appId, client, and target each time we call Wolfram Alpha
     * To call Wolfram Alpha the URL needs to be extended to include the input 
     * and appid. This can be done using .queryParam("name of parameter", value).
     */
    String appId = "GLHTK4-96L2PVQT4T";
    Client client = ClientBuilder.newClient();
    WebTarget wolframTarget = client.target("http://api.wolframalpha.com/v2/query");
    
    //Here are the GUI elements we want to interact with in various methods:
    @FXML private Label actiontarget;
    @FXML private TextArea textEntered;
    
    
    /** The sendText method sends entered text to Wolfram Alpha when the "Submit"
    * button is pressed and then displays the output. (So far it can print out 
    * the XML but eventually it will print something nicer).
    */
    @FXML protected void sendText(ActionEvent event) {
        
        //If no text is entered, nothing happens - we do not send WA the empty text
        if (textEntered.getText() != null) {
            
            //First we get the text that has been entered in the text area so far
            String input = textEntered.getText();
            
            /**This adds ?input=<modified value of input>&appid=<value of appId>
             * to the URL so that WA can be called correctly. queryParam
             * modifies the string in input into appropriate syntax for the 
             * query URL.
             */
            WebTarget queryTarget = wolframTarget.queryParam("input", input).queryParam("appid", appId);
            
            //Here we call WA and read their response
            Response response = queryTarget.request().get();
            String responseText = response.readEntity(String.class);
          
            //For now, we'll display the xml in the GUI and print it to the program output
            actiontarget.setText(responseText);
            System.out.println(responseText);
        }
    }   
}

