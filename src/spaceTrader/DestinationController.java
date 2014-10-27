/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package spaceTrader;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.SplitMenuButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;
import javax.swing.JButton;
import javafx.scene.control.Button;
import spaceTrader.Universe;
import javafx.scene.shape.*;

/**
 *
 * @author Quan
 */


public class DestinationController implements Initializable {
    
    /**
     *
     * @throws Exception
     */
    public void start() throws Exception
{
   
spaceTrader.SpaceTraderMain.replaceSceneContent("destination",this);
  
}        
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
     try
    {start();  }
    catch(Exception e) {}
    Circle circle = new Circle();
    circle.setCenterX(100.0f);
    circle.setCenterY(100.0f);
    circle.setRadius(50.0f);
               
    }
    
    
    
    
}
