/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package spaceTrader;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.SplitMenuButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javax.swing.JButton;
import spaceTrader.Universe;

/**
 * FXML Controller class
 *
 * @author Brandens
 */
public class PoliceController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    @FXML
    private Button runButton;
    @FXML
    private Button saveButton;
    RandomEvents rand = new RandomEvents(FXMLDocumentController.playerInfo);
    
    public void start() throws Exception {
   
        spaceTrader.SpaceTraderMain.replaceSceneContent("Police",this);  
    }        
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            start();  
        }
        catch(Exception e) {}
    }   
    
    private void runAway() throws Exception {
        //rand.runAway();
        try{
            rand.runAway();
            spaceTrader.SpaceTraderMain.replaceSceneContent("Marketplace.fxml",spaceTrader.FXMLDocumentController.class);
        }     
        catch(Exception e){ 
           
            System.out.println(e);
        }   
    }
    
    private void stay()throws Exception {
        //rand.runAway();
        try{
            rand.stay();
            spaceTrader.SpaceTraderMain.replaceSceneContent("Marketplace.fxml",spaceTrader.FXMLDocumentController.class);
        }     
        catch(Exception e){ 
           
            System.out.println(e);
        }   
    }
    
}
