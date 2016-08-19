/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.web.WebView;


/*This files handles the mouse and keyboard input.
 */
public class PrimaryController {

    /**
     * We'll need our appId, client, and target each time we call Wolfram Alpha To call Wolfram Alpha the URL needs to
     * be extended to include the input and appid. This can bed done using .queryParam("name of parameter", value).
     
    //Here are the GUI elements we want to interact with in various methods:*/
   @FXML private Label mathMLLabel;
    @FXML private Label rawWolframLabel;
    @FXML private TextArea textEntered;
    @FXML private WebView dicks;
    /*
     * The sendText method sends entered text to Wolfram Alpha when the "Submit" button is pressed and then displays the
     * output. (So far it can print out the XML but eventually it will print something nicer).
     * @param args
     */
    @FXML protected void sendText( ActionEvent event ) {

        //If no text is entered, nothing happens - we do not send WA the empty text
      
        if ( textEntered.getText() != null ) {
            WolframAlphaHandler wah = new WolframAlphaHandler();
            String responseFromWolfram = wah.getRawResponesFromWolfram(textEntered.getText());
            rawWolframLabel.setText(responseFromWolfram);
            MathMLParser mathParser = new MathMLParser();
            String mathPortion = mathParser.getMathMLFromXMLString(responseFromWolfram);
           
             
          dicks.getEngine().loadContent(
      mathPortion
    );
 
        
            
            
            //mathMLLabel.setText(mathPortion);

        } else {
            rawWolframLabel.setText("You have to enter some text first!");
            mathMLLabel.setText("You have to enter some text first!");
        }
    }
}
    

  