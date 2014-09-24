/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package spaceTrader;

import java.net.URL;
import java.util.ArrayList;
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
import spaceTrader.Universe;
/**
 *
 * @author Quan
 */
public class FXMLDocumentController implements Initializable {
    private int skill1Points;
    private int skill2Points;
    private int skill3Points;
    private int skill4Points;
    private String userName;
    @FXML
    private Button exitGame;
    ToggleGroup myRadioButtons = new ToggleGroup();
    @FXML
    private Button newPlayer;
    @FXML
    private RadioButton easyButton;
    @FXML
    private RadioButton hardButton;
    @FXML
    private RadioButton normalButton;
    
    @FXML 
    private TextField playerName;
    
    @FXML 
    private TextArea skill1Num;
    
    @FXML 
    private TextArea skill2Num;
    
    @FXML 
    private TextArea skill3Num;
    
    @FXML 
    private TextArea skill4Num;
    
    @FXML
    private TextArea totalSkillPoints;
    
    private String difficultyLevel;
    
    @FXML
    private void closeWindow(ActionEvent event) {
       // get a handle to the stage
    Stage stage = (Stage) exitGame.getScene().getWindow();
    // do what you have to do
    stage.hide();
}
    @FXML
    private void newGame(ActionEvent event) throws Exception{
      try {
            spaceTrader.SpaceTraderMain.replaceSceneContent("NewUser.fxml");
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
    
    @FXML
    private void closeNewGame(ActionEvent event) throws Exception{
      try {
            spaceTrader.SpaceTraderMain.replaceSceneContent("FXMLDocument.fxml");
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
    
@FXML
    private void addSkill1(ActionEvent event) throws Exception{
      try {
          if(skillPointsExist())
          {
            skill1Points++;
            totalSkillPoints.setText(""+(Integer.parseInt(""+totalSkillPoints.getText())-1));
            skill1Num.setText(""+skill1Points);
          }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }    
   @FXML
    private void addSkill2(ActionEvent event) throws Exception{
      try {
          if(skillPointsExist())
          {
            skill2Points++;
            totalSkillPoints.setText(""+(Integer.parseInt(""+totalSkillPoints.getText())-1));
            skill2Num.setText(""+skill2Points);
          }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
    @FXML
    private void addSkill3(ActionEvent event) throws Exception{
      try {
          if(skillPointsExist())
          {
            skill3Points++;
            totalSkillPoints.setText(""+(Integer.parseInt(""+totalSkillPoints.getText())-1));
            skill3Num.setText(""+skill3Points);
          }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
    @FXML
    private void addSkill4(ActionEvent event) throws Exception{
      try {
          if(skillPointsExist())
          {
            skill4Points++;
            totalSkillPoints.setText(""+(Integer.parseInt(""+totalSkillPoints.getText())-1));
            skill4Num.setText(""+skill4Points);
          }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
    @FXML
    private void minusSkill1(ActionEvent event) throws Exception{
      try {
          if(skill1Points!=1)
          {
            skill1Points--;
            totalSkillPoints.setText(""+(Integer.parseInt(""+totalSkillPoints.getText())+1));
            skill1Num.setText(""+skill1Points);
          }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }    
   @FXML
    private void minusSkill2(ActionEvent event) throws Exception{
      try {
          if(skill2Points!=1)
          {
            skill2Points--;
            totalSkillPoints.setText(""+(Integer.parseInt(""+totalSkillPoints.getText())+1));
            skill2Num.setText(""+skill2Points);
          }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
    @FXML
    private void minusSkill3(ActionEvent event) throws Exception{
      try {
          if(skill3Points!=1)
          {
            skill3Points--;
            totalSkillPoints.setText(""+(Integer.parseInt(""+totalSkillPoints.getText())+1));
            skill3Num.setText(""+skill3Points);
          }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
    @FXML
    private void minusSkill4(ActionEvent event) throws Exception{
      try {
          if(skill4Points!=1)
          {
            skill4Points--;
            totalSkillPoints.setText(""+(Integer.parseInt(""+totalSkillPoints.getText())+1));
            skill4Num.setText(""+skill4Points);
          }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
    @FXML
    private void acceptPlayer(ActionEvent event) throws Exception{
      try {  
          if(easyButton.isSelected())
            difficultyLevel = "Easy";
          if(normalButton.isSelected())
            difficultyLevel = "Normal";
          if(hardButton.isSelected())
            difficultyLevel = "Hard";
          getName();
          Character playerInfo = new Character(userName,skill1Points,skill2Points,skill3Points,skill4Points,difficultyLevel);
          //System.out.println(playerInfo);
          spaceTrader.SpaceTraderMain.players.add(playerInfo);
          System.out.println(spaceTrader.SpaceTraderMain.players.toString());
          spaceTrader.SpaceTraderMain.replaceSceneContent("newScreen.fxml");
          Universe newU = new Universe();
          newU.generateUniverse();
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
    private boolean skillPointsExist()
    {
        int total = Integer.parseInt(totalSkillPoints.getText());
        return total != 0;
    }
    
    
    private void getName()
    {
        if(!playerName.getText().isEmpty())
            userName = playerName.getText();
        else
            userName = "Unknown";
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        skill1Points = 1;
        skill2Points = 1;
        skill3Points = 1;
        skill4Points = 1;
        if(easyButton!=null)
        {
        easyButton.setToggleGroup(myRadioButtons);
        normalButton.setToggleGroup(myRadioButtons);
        hardButton.setToggleGroup(myRadioButtons);
        normalButton.setSelected(true);
        }
    
               
    }    
    
}
