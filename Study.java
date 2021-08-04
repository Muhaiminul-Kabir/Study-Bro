/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package study;

import java.io.File;
import java.io.IOException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author ASUS
 */
public class Study extends Application {
    
    @Override
    public void start(Stage stage) throws IOException {
                        makeDirMAIN();
			Parent root = FXMLLoader.load(getClass().getResource("/study/loginPage.fxml"));
			Scene scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
			
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    public  void makeDirMAIN() {
        File f1 = new File("C:/AppDataBase");
        //Creating a folder using mkdir() method  
        boolean bool = f1.mkdir();        
        if (bool) {            
            System.out.println("Folder is created successfully");            
        } else {            
            System.out.println("exists");            
        }        
    }
    
}
