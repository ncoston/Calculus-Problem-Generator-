/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Katharine
 */
public class TeamFinalProjectMainClass extends Application {

    @Override
    public void start( Stage stage ) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("PrimaryView.fxml"));

        Scene scene = new Scene(root, 600, 500);

        stage.setTitle("Team final project. (yay)");
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main( String[] args ) {
        launch(args);
    }

}
