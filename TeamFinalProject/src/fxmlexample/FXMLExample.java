/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fxmlexample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javax.ws.rs.client.Client;
//import javax.ws.rs.client.AsyncInvoker;
import javax.ws.rs.client.ClientBuilder;
//import javax.ws.rs.client.ClientRequestContext;
//import javax.ws.rs.client.ClientRequestFilter;
//import javax.ws.rs.client.ClientResponseContext;
//import javax.ws.rs.client.ClientResponseFilter;
//import javax.ws.rs.client.Entity;
//import javax.ws.rs.client.Invocation;



/**
 *
 * @author Natalie
 */


/*This file takes care of the standard Java code required for and 
FXML application. It sets stage, scene, buttons, etc. 
*/

public class FXMLExample extends Application {
    Client client = ClientBuilder.newClient();
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXML_example.fxml"));
        
        Scene scene = new Scene(root, 500, 400);
        
        stage.setTitle("FXML Welcome");
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
