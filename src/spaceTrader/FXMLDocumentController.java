/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package spaceTrader;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
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
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javax.swing.JButton;
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
    private Universe copyU;
    private Planet planet;
    private Planet planett;
    @FXML
    private Button plan1;
    @FXML
    private Button plan2;
    @FXML
    private Button plan3; 
    @FXML
    private Circle planet1;
    @FXML
    private Circle planet2;
    @FXML
    private Circle planet3;
    @FXML
    private Circle planet4;
    @FXML
    private Circle planet5;
    @FXML
    private Circle planet6;
    @FXML
    private Circle planet7;
    @FXML
    private Circle planet8;
    @FXML 
    private Button travelButton;
    @FXML
    private Label numCredits;
    @FXML
    private Label fursPriceID;
    @FXML
    private Label waterPriceID;
    @FXML
    private Label robotsPriceID;
    @FXML
    private Label orePriceID;
    @FXML
    private Label gamesPriceID;
    @FXML
    private Label firearmsPriceID;
    @FXML
    private Label machinesPriceID;
    @FXML
    private Label medicinePriceID;
    @FXML
    private Label narcoticsPriceID;
    @FXML
    private Label foodPriceID;
       @FXML
    private Label fursQuantityID;
    @FXML
    private Label waterQuantityID;
    @FXML
    private Label robotsQuantityID;
    @FXML
    private Label oreQuantityID;
    @FXML
    private Label gamesQuantityID;
    @FXML
    private Label firearmsQuantityID;
    @FXML
    private Label machinesQuantityID;
    @FXML
    private Label medicineQuantityID;
    @FXML
    private Label narcoticsQuantityID;
    @FXML
    private Label foodQuantityID;
    @FXML
    private Button exitGame;
    public static Character playerInfo;
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
    private TextField waterNum;
    
    @FXML 
    private TextField fursNum;
    
    @FXML 
    private TextField foodNum;
    
    @FXML 
    private TextField oreNum;
    
    @FXML 
    private TextField gamesNum;
 
    @FXML 
    private TextField firearmsNum;
    
    @FXML 
    private TextField medicineNum;
    
    @FXML 
    private TextField machinesNum;
    @FXML
    private Label cargoSpace;
    @FXML 
    private TextField narcoticsNum;
    @FXML
    private TextField planetSwitch;
    @FXML 
    private TextField robotsNum;    
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
    
    @FXML
    private Button marketPlaceButton;
    
    private String difficultyLevel;
    
    Map<String, Integer> dictionaryPoints;
    Map<String, TextArea> dictionaryLabel;
    public static Universe newU;
    @FXML
    private void closeWindow(ActionEvent event) {
       // get a handle to the stage
    Stage stage = (Stage) exitGame.getScene().getWindow();
    // do what you have to do
    stage.hide();
}
    @FXML
    private void destination() throws Exception{
        try{

        }catch(Exception e){
            
        }
        
        
    }
    @FXML
    private void newGame(ActionEvent event) throws Exception{
      try {
            spaceTrader.SpaceTraderMain.replaceSceneContent("NewUser.fxml",this);
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
    
    @FXML
    private void closeNewGame(ActionEvent event) throws Exception{
      try {
            spaceTrader.SpaceTraderMain.replaceSceneContent("FXMLDocument.fxml",this);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    @FXML
    private void enterMarket(ActionEvent event) throws Exception{
      try {
            Random rand = new Random();
            if (rand.nextInt(10) > 1) {
                spaceTrader.SpaceTraderMain.replaceSceneContent("Police.fxml",PoliceController.class);
            }
            spaceTrader.SpaceTraderMain.replaceSceneContent("Marketplace.fxml",this);
            System.out.println(newU.universe);
            updateMarket();
            copyU = new Universe();
            copyU.universe =newU.getCopy();
            Color y = Color.BLUE;
            plan1.setStyle("-fx-base: #b6e7c9;");
            plan2.setStyle("-fx-base: #FFFFFF ;");
            plan3.setStyle("-fx-base: #FFFFFF ;");
        } catch (Exception ex) {
            System.out.println(ex);
        }
      
    }
    @FXML
    private void enterU(ActionEvent event) throws Exception{
          try{
            spaceTrader.SpaceTraderMain.replaceSceneContent("destination.fxml",this);
        }     
        catch(Exception e){ 
           
            System.out.println(e);
        }   
    }
    @FXML 
    private void curPlanet(ActionEvent event) throws Exception
    {
        try{
       planet1.setStroke(Color.BLACK);
            planet2.setOnMouseClicked(new EventHandler<MouseEvent>() {
            //@Override
            public void handle(MouseEvent event) {
            System.out.println("mouse click detected! "+event.getSource());
            Circle x = (Circle)event.getSource();
            x.setStroke(Color.BLACK);
            System.out.println(x);
            planet2 = x;
    }});
            }catch(Exception e){
                    
                    }
    }
    @FXML 
    //Allows you to switch planets
    private void switchPlanet(ActionEvent event) throws Exception
    {
        Button pressed = (Button)event.getSource();
        String y = pressed.getId();
        System.out.println(y);
        if(y.equals("plan1")){
            plan1.setStyle("-fx-base: #b6e7c9;");
            plan2.setStyle("-fx-base: #FFFFFF ;");
            plan3.setStyle("-fx-base: #FFFFFF ;");}
        if(y.equals("plan2")){
            plan2.setStyle("-fx-base: #b6e7c9;");
            plan1.setStyle("-fx-base: #FFFFFF ;");
            plan3.setStyle("-fx-base: #FFFFFF ;");}
        if(y.equals("plan3")){
            plan3.setStyle("-fx-base: #b6e7c9;");
            plan2.setStyle("-fx-base: #FFFFFF ;");
            plan1.setStyle("-fx-base: #FFFFFF ;");}
        String buttonText = pressed.getText();
        int index=0;
        for(Planet p: copyU.universe)
            if(p.name.equals(buttonText))
                index = copyU.universe.indexOf(p);
        Planet p = copyU.universe.get(index);
        newU.universe.set(0,p);
        updateMarket();
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
    private void minusSkill(ActionEvent event) throws Exception
    {
      Button button = (Button)event.getSource();
      String buttonId = button.getId();
      try {
          System.out.println(buttonId);
          System.out.println(dictionaryLabel.toString());
          
          if(dictionaryPoints.get(buttonId)!=1)
          {
            dictionaryPoints.put(buttonId, dictionaryPoints.get(buttonId)-1);
            totalSkillPoints.setText(""+(Integer.parseInt(""+totalSkillPoints.getText())+1));
            dictionaryLabel.get(buttonId).setText(""+dictionaryPoints.get(buttonId));
            System.out.println("ZXSACC"+dictionaryLabel.toString());
          }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }    

 @FXML
    private void max(ActionEvent event) throws Exception
    {
      Button button = (Button)event.getSource();
      String buttonId = button.getId();
      System.out.println(newU.universe.toString()+"-----------------------------------------");
      try {
          if(buttonId.equals("waterMax"))
          {
              waterNum.setText(""+(newU.universe.get(0).market.waterQuant/2));
          }
          if(buttonId.equals("fursMax"))
          {
              fursNum.setText(""+(newU.universe.get(0).market.fursQuant/2));
          }
          if(buttonId.equals("foodMax"))
          {
              foodNum.setText(""+(newU.universe.get(0).market.foodQuant/2));
          }
          if(buttonId.equals("oreMax"))
          {
              oreNum.setText(""+(newU.universe.get(0).market.oresQuant/2));    
          }
          if(buttonId.equals("gamesMax"))
          {
              gamesNum.setText(""+(newU.universe.get(0).market.gamesQuant/2));
          }
          if(buttonId.equals("firearmsMax"))
          {
              firearmsNum.setText(""+(newU.universe.get(0).market.firearmsQuant/2));
          }
          if(buttonId.equals("medicineMax"))
          {
              medicineNum.setText(""+(newU.universe.get(0).market.medicineQuant/2));
          }
          if(buttonId.equals("machinesMax"))
          {
              machinesNum.setText(""+(newU.universe.get(0).market.machinesQuant/2));
          }
          if(buttonId.equals("narcoticsMax"))
          {
              narcoticsNum.setText(""+(newU.universe.get(0).market.narcoticsQuant/2));
          }
          if(buttonId .equals("robotsMax"))
          {
              robotsNum.setText(""+(newU.universe.get(0).market.robotsQuant/2));
          }
         
      } catch (Exception ex) {
            System.out.println(ex);
        }
    }
    @FXML
    private void sell(ActionEvent event) throws Exception
    {
      int water = 0;
      int furs = 0;
      int ores = 0;
      int games = 0;
      int medicine = 0;
      int machines = 0;
      int firearms = 0;
      int narcotics = 0;
      int robots = 0;
      int food = 0;
      int total;
      int cost;
      try {
          if(!waterNum.getText().equals(""))
          {
              try
              {
                  water = Integer.parseInt(waterNum.getText());
              }catch(Exception e)
              {
                  water = 0;
              }
          }
          if(!fursNum.getText().equals(""))
          {
              try
              {
                  furs = Integer.parseInt(fursNum.getText());
              }catch(Exception e)
              {
                  furs = 0;
              }
          }
          if(!oreNum.getText().equals(""))
          {
              try
              {
                  ores = Integer.parseInt(oreNum.getText());
              }catch(Exception e)
              {
                  ores = 0;
              }
          }
          if(!medicineNum.getText().equals(""))
          {
              try
              {
                  medicine = Integer.parseInt(medicineNum.getText());
              }catch(Exception e)
              {
                  medicine = 0;
              }
          }
          if(!machinesNum.getText().equals(""))
          {
              try
              {
                  machines = Integer.parseInt(machinesNum.getText());
              }catch(Exception e)
              {
                  machines = 0;
              }
          }
          if(!narcoticsNum.getText().equals(""))
          {
              try
              {
                  narcotics = Integer.parseInt(narcoticsNum.getText());
              }catch(Exception e)
              {
                  narcotics = 0;
              }
          }
          if(!robotsNum.getText().equals(""))
          {
              try
              {
                  robots = Integer.parseInt(robotsNum.getText());
              }catch(Exception e)
              {
                  robots = 0;
              }
          }
          if(!gamesNum.getText().equals(""))
          {
              try
              {
                  games = Integer.parseInt(gamesNum.getText());
              }catch(Exception e)
              {
                  games = 0;
              }
          }
          if(!firearmsNum.getText().equals(""))
          {
              try
              {
                  firearms = Integer.parseInt(firearmsNum.getText());
              }catch(Exception e)
              {
                  firearms = 0;
              }
          }
          if(!foodNum.getText().equals(""))
          {
              try
              {
                  food = Integer.parseInt(foodNum.getText());
              }catch(Exception e)
              {
                  food = 0;
              }
          }
          total = firearms + furs + games + food + medicine + robots + narcotics + ores + machines + water;
          cost = firearms*newU.universe.get(0).market.firearmsPrice + furs*newU.universe.get(0).market.fursPrice 
                  + games*newU.universe.get(0).market.gamesPrice + food*newU.universe.get(0).market.foodPrice 
                  + medicine*newU.universe.get(0).market.machinesPrice + robots*newU.universe.get(0).market.robotsPrice 
                  + narcotics*newU.universe.get(0).market.narcoticsPrice + ores*newU.universe.get(0).market.oresPrice 
                  + machines*newU.universe.get(0).market.machinesPrice + water*newU.universe.get(0).market.waterPrice;
          if(playerInfo.myShip.validSale(water,furs,food,ores,games,firearms,medicine,machines,narcotics,robots))
          {
              playerInfo.myShip.count -= total;
              playerInfo.credits += cost;
              newU.universe.get(0).market.firearmsQuant += firearms;
              newU.universe.get(0).market.waterQuant += water;
              newU.universe.get(0).market.oresQuant += ores;
              newU.universe.get(0).market.foodQuant += food;
              newU.universe.get(0).market.fursQuant += furs;
              newU.universe.get(0).market.robotsQuant += robots;
              newU.universe.get(0).market.machinesQuant += machines;
              newU.universe.get(0).market.medicineQuant += medicine;
              newU.universe.get(0).market.narcoticsQuant += narcotics;
              newU.universe.get(0).market.gamesQuant += games;
              playerInfo.myShip.firearms -= firearms;
              playerInfo.myShip.water -= water;
              playerInfo.myShip.ore -= ores;
              playerInfo.myShip.food -= food;
              playerInfo.myShip.fur -= furs;
              playerInfo.myShip.medicine -= medicine;
              playerInfo.myShip.games -= games;
              playerInfo.myShip.machines -= machines;
              playerInfo.myShip.narcotics -= narcotics;
              playerInfo.myShip.robots -= robots;
          }
           if(!planetSwitch.getText().equals(""))
          {
              if(Integer.parseInt(planetSwitch.getText())>=0 && Integer.parseInt(planetSwitch.getText())<=8 )
              {
                  planet =  newU.universe.get(Integer.parseInt(planetSwitch.getText())-1);
                  if(!planet.equals(planett)){
                    Collections.swap(newU.universe, 0, Integer.parseInt(planetSwitch.getText())-1);
                    planett = newU.universe.get(0);
                    planetSwitch.setText("");
                    System.out.println("Current Planet:" +planet.name +" Choose 1-8 to move planets");
                  }
              }
          }
          updateMarket();
      } catch (Exception ex) {
            System.out.println(ex);
        }
    }  
    @FXML
    private void buy(ActionEvent event) throws Exception
    {
      int water = 0;
      int furs = 0;
      int ores = 0;
      int games = 0;
      int medicine = 0;
      int machines = 0;
      int firearms = 0;
      int narcotics = 0;
      int robots = 0;
      int food = 0;
      int total;
      int cost;
      try {
          if(!waterNum.getText().equals(""))
          {
              try
              {
                  water = Integer.parseInt(waterNum.getText());
              }catch(Exception e)
              {
                  water = 0;
              }
          }
          if(!fursNum.getText().equals(""))
          {
              try
              {
                  furs = Integer.parseInt(fursNum.getText());
              }catch(Exception e)
              {
                  furs = 0;
              }
          }
          if(!oreNum.getText().equals(""))
          {
              try
              {
                  ores = Integer.parseInt(oreNum.getText());
              }catch(Exception e)
              {
                  ores = 0;
              }
          }
          if(!medicineNum.getText().equals(""))
          {
              try
              {
                  medicine = Integer.parseInt(medicineNum.getText());
              }catch(Exception e)
              {
                  medicine = 0;
              }
          }
          if(!machinesNum.getText().equals(""))
          {
              try
              {
                  machines = Integer.parseInt(machinesNum.getText());
              }catch(Exception e)
              {
                  machines = 0;
              }
          }
          if(!narcoticsNum.getText().equals(""))
          {
              try
              {
                  narcotics = Integer.parseInt(narcoticsNum.getText());
              }catch(Exception e)
              {
                  narcotics = 0;
              }
          }
          if(!robotsNum.getText().equals(""))
          {
              try
              {
                  robots = Integer.parseInt(robotsNum.getText());
              }catch(Exception e)
              {
                  robots = 0;
              }
          }
          if(!gamesNum.getText().equals(""))
          {
              try
              {
                  games = Integer.parseInt(gamesNum.getText());
              }catch(Exception e)
              {
                  games = 0;
              }
          }
          if(!firearmsNum.getText().equals(""))
          {
              try
              {
                  firearms = Integer.parseInt(firearmsNum.getText());
              }catch(Exception e)
              {
                  firearms = 0;
              }
          }
          if(!foodNum.getText().equals(""))
          {
              try
              {
                  food = Integer.parseInt(foodNum.getText());
              }catch(Exception e)
              {
                  food = 0;
              }
          }
          total = firearms + furs + games + food + medicine + robots + narcotics + ores + machines + water;
          cost = firearms*newU.universe.get(0).market.firearmsPrice + furs*newU.universe.get(0).market.fursPrice 
                  + games*newU.universe.get(0).market.gamesPrice + food*newU.universe.get(0).market.foodPrice 
                  + medicine*newU.universe.get(0).market.machinesPrice + robots*newU.universe.get(0).market.robotsPrice 
                  + narcotics*newU.universe.get(0).market.narcoticsPrice + ores*newU.universe.get(0).market.oresPrice 
                  + machines*newU.universe.get(0).market.machinesPrice + water*newU.universe.get(0).market.waterPrice;
          if(playerInfo.myShip.validBuy(total, cost, playerInfo.credits)&&newU.universe.get(0).market.isValid(water,furs,food,ores,games,firearms,medicine,machines,narcotics,robots))
          {
              playerInfo.myShip.count += total;
              playerInfo.credits -= cost;
              newU.universe.get(0).market.firearmsQuant -= firearms;
              newU.universe.get(0).market.waterQuant -= water;
              newU.universe.get(0).market.oresQuant -= ores;
              newU.universe.get(0).market.foodQuant -= food;
              newU.universe.get(0).market.fursQuant -= furs;
              newU.universe.get(0).market.robotsQuant -= robots;
              newU.universe.get(0).market.machinesQuant -= machines;
              newU.universe.get(0).market.medicineQuant -= medicine;
              newU.universe.get(0).market.narcoticsQuant -= narcotics;
              newU.universe.get(0).market.gamesQuant -= games;
              playerInfo.myShip.firearms += firearms;
              playerInfo.myShip.water += water;
              playerInfo.myShip.ore += ores;
              playerInfo.myShip.food += food;
              playerInfo.myShip.fur += furs;
              playerInfo.myShip.medicine += medicine;
              playerInfo.myShip.games += games;
              playerInfo.myShip.machines += machines;
              playerInfo.myShip.narcotics += narcotics;
              playerInfo.myShip.robots += robots;


          }
          updateMarket();
      } catch (Exception ex) {
            System.out.println(ex);
        }
    }       
    private void updateMarket(){
            cargoSpace.setText(playerInfo.myShip.count+"/"+playerInfo.myShip.maxItems);
            numCredits.setText(""+playerInfo.credits);
            fursPriceID.setText("$"+newU.universe.get(0).market.fursPrice);
            waterPriceID.setText("$"+newU.universe.get(0).market.waterPrice);
            robotsPriceID.setText("$"+newU.universe.get(0).market.robotsPrice);
            orePriceID.setText("$"+newU.universe.get(0).market.oresPrice);
            gamesPriceID.setText("$"+newU.universe.get(0).market.gamesPrice);
            firearmsPriceID.setText("$"+newU.universe.get(0).market.firearmsPrice);
            narcoticsPriceID.setText("$"+newU.universe.get(0).market.narcoticsPrice);
            medicinePriceID.setText("$"+newU.universe.get(0).market.medicinePrice);
            foodPriceID.setText("$"+newU.universe.get(0).market.foodPrice);
            machinesPriceID.setText("$"+newU.universe.get(0).market.machinesPrice);
            fursQuantityID.setText(""+newU.universe.get(0).market.fursQuant);
            waterQuantityID.setText(""+newU.universe.get(0).market.waterQuant);
            robotsQuantityID.setText(""+newU.universe.get(0).market.robotsQuant);
            oreQuantityID.setText(""+newU.universe.get(0).market.oresQuant);
            gamesQuantityID.setText(""+newU.universe.get(0).market.gamesQuant);
            firearmsQuantityID.setText(""+newU.universe.get(0).market.firearmsQuant);
            narcoticsQuantityID.setText(""+newU.universe.get(0).market.narcoticsQuant);
            medicineQuantityID.setText(""+newU.universe.get(0).market.medicineQuant);
            foodQuantityID.setText(""+newU.universe.get(0).market.foodQuant);
            machinesQuantityID.setText(""+newU.universe.get(0).market.machinesQuant);
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
          playerInfo = new Character(userName,skill1Points,skill2Points,skill3Points,skill4Points,difficultyLevel);
          //System.out.println(playerInfo);
          spaceTrader.SpaceTraderMain.players.add(playerInfo);
          System.out.println(spaceTrader.SpaceTraderMain.players.toString());
          spaceTrader.SpaceTraderMain.replaceSceneContent("newScreen.fxml",this);
          newU = new Universe();
          newU.generateUniverse();

        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
      /**
    *A method that checks if the player has any more skill points to allocate..
    *@param none 
    *@return True if more skill point left False if not
    *
    */
    private boolean skillPointsExist()
    {
        int total = Integer.parseInt(totalSkillPoints.getText());
        return total != 0;
    }
     /**
    *A name method that grabs the text from the playerName field.
    *@param none 
    *@return none
    *
    */
   
    private void getName()
    {
        if(!playerName.getText().isEmpty())
            userName = playerName.getText();
        else
            userName = "Unknown";
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        dictionaryPoints = new HashMap<String, Integer>();
        dictionaryLabel = new HashMap<String, TextArea>();
        dictionaryPoints.put("skill1Minus",1);
        dictionaryPoints.put("skill2Minus",1);
        dictionaryPoints.put("skill3Minus",1);
        dictionaryPoints.put("skill4Minus",1);
        dictionaryLabel.put("skill1Minus",skill1Num);
        dictionaryLabel.put("skill2Minus",skill2Num);
        dictionaryLabel.put("skill3Minus",skill3Num);
        dictionaryLabel.put("skill4Minus",skill4Num);
        if(easyButton!=null)
        {
        easyButton.setToggleGroup(myRadioButtons);
        normalButton.setToggleGroup(myRadioButtons);
        hardButton.setToggleGroup(myRadioButtons);
        normalButton.setSelected(true);
        }
        
    }
    
}
