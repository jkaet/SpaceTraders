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
import javafx.scene.shape.Ellipse;
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
    ArrayList<Button> planetButtons = new ArrayList();
    @FXML
    private Button plan1;
    @FXML
    private Button plan2;
    @FXML
    private Button plan3;
    @FXML
    private Button plan4;
    @FXML
    private Button plan5;
    @FXML
    private Button plan6; 
    @FXML
    private Button plan7;
    @FXML
    private Button plan8;
    @FXML
    private Button plan9;
    @FXML
    private Button plan10;
    @FXML
    private Button plan11;
    @FXML
    private Button plan12; 
    @FXML
    private Button plan13;
    @FXML
    private Button plan14;
    @FXML
    private Button plan15;
    @FXML
    private Ellipse playerLoc;
    @FXML
    private Button cancel;
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
    private Label fuelPriceID;
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
    private Label fuelQuantityID;
    @FXML
    private TextField fuelNum;
     @FXML
    private Label fuelLabel;
    @FXML
    private Button exitGame;

    /**
     *
     */
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
    private Label sysMessage;
     @FXML 
    private TextField shipTypeText;
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

    /**
     *
     */
    public static Universe newU;
    @FXML
    private void closeWindow(ActionEvent event) {
       // get a handle to the stage
    Stage stage = (Stage) exitGame.getScene().getWindow();
    // do what you have to do
    stage.hide();
}
      @FXML
    private void enterShipYard(ActionEvent event) throws Exception{
      try {
            spaceTrader.SpaceTraderMain.replaceSceneContent("ShipYard.fxml",this);

        } catch (Exception ex) {
            System.out.println("ooo"+ex);
        }
      
    }
    @FXML
    private void shipOk(ActionEvent event) throws Exception{
        try{
            if(shipTypeText.getText() != "")
            {
                int type = Integer.parseInt(shipTypeText.getText());
                if(type > 0 && type < 4)
                {
                    if((((type*2)) < newU.universe.get(0).techLevel))
                    {
                    playerInfo.myShip.changeType(type);
                    sysMessage.setText("You successfully bought a ship of type: "+type);

                    }else{
                    sysMessage.setText("Planet Resource Level Too low");
                }
                }else{
                    sysMessage.setText("Invalid Ship Type");
                }
            }
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
            MarketLoader controller = new MarketLoader();
            spaceTrader.SpaceTraderMain.replaceSceneContent("Marketplace.fxml",this);
            updateMarket();
            copyU = new Universe();
            copyU.universe =newU.getCopy();
            Color y = Color.BLUE;
        } catch (Exception ex) {
            System.out.println("ooo"+ex);
        }
      
    }
      @FXML
    private void returnToInterface(ActionEvent event) throws Exception{
        try {
            spaceTrader.SpaceTraderMain.replaceSceneContent("newScreen.fxml",this);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    @FXML
    private void enterU(ActionEvent event) throws Exception{
          try{
            copyU = new Universe();
            copyU.universe =newU.getCopy();
            Circle circle = new Circle();
            circle.setRadius(100);
            spaceTrader.SpaceTraderMain.replaceSceneContent("destination.fxml",this);
            fuelLabel.setText("Light Years Left: "+ playerInfo.myShip.lightYearsLeft);
            for(Planet p: copyU.universe){
                if(p.xLocation==playerInfo.myShip.currentLoc[0] && p.yLocation==playerInfo.myShip.currentLoc[1])
                {
                    playerLoc.setVisible(false);
                    break;
                }
                else
                    playerLoc.relocate(playerInfo.myShip.currentLoc[0],playerInfo.myShip.currentLoc[1]);
            }
            planetButtons.add(plan1);
            planetButtons.add(plan2);
            planetButtons.add(plan3);
            planetButtons.add(plan4);
            planetButtons.add(plan5);
            planetButtons.add(plan6);
             planetButtons.add(plan7);
            planetButtons.add(plan8);
            planetButtons.add(plan9);
            planetButtons.add(plan10);
            planetButtons.add(plan11);
            planetButtons.add(plan12);
             planetButtons.add(plan13);
            planetButtons.add(plan14);
            planetButtons.add(plan15);
            for(Button x: planetButtons)
            {
                x.setShape(circle);
                for(Planet p: copyU.universe)
                    if(p.name.equals(x.getText()))
                    {
                        x.relocate(p.xLocation,p.yLocation);
                        if(x.getLayoutX() == playerInfo.myShip.currentLoc[0] && x.getLayoutY() == playerInfo.myShip.currentLoc[1])
                            x.setStyle("-fx-base: #b6e7c9;");
                    }   
            }
           

        }     
        catch(Exception e){ 
           
            System.out.println(e);
        }   
    }

    @FXML 
    //Allows you to switch planets
    private void switchPlanet(ActionEvent event) throws Exception
    {
        Button pressed = (Button)event.getSource();
        String y = pressed.getId();
        String buttonText = pressed.getText();
        int index=0;
        for(Planet p: copyU.universe)
            if(p.name.equals(buttonText))
                index = copyU.universe.indexOf(p);
        Planet p = copyU.universe.get(index);
        
        if(playerInfo.myShip.travelPossible(p.xLocation,p.yLocation))
        {
              playerLoc.setVisible(false);
              for(Button x: planetButtons)
              {

                  if((x.getId()).equals(y))
                  {
                     x.setStyle("-fx-base: #b6e7c9;");
                  }else
                  {
                      x.setStyle("-fx-base: #FFFFFF ;");
                  }
              }
              Random rand = new Random();
              playerInfo.myShip.lightYearsLeft -= rand.nextInt(80);//Math.pow(Math.pow(p.xLocation-playerInfo.myShip.currentLoc[0], 1) + Math.pow(p.yLocation - playerInfo.myShip.currentLoc[1],1),.5);
              playerInfo.myShip.currentLoc[0] = p.xLocation;
              playerInfo.myShip.currentLoc[1] = p.yLocation;
              fuelLabel.setText("Light Years Left: "+ playerInfo.myShip.lightYearsLeft);
              int testerr = rand.nextInt(10);
              if (testerr > 5) {
                    int num = rand.nextInt(5)+1;
                    RandomEvents randE = new RandomEvents(playerInfo);

                    switch(num){
                          case 1:
                                  randE.loseCargo();
                                  break;
                          case 2:
                                  randE.findMoney();
                                  break;
                          case 3:
                                  randE.getRobbed();
                                  break;
                          case 4:
                                  randE.runAway();
                                  break;
                          case 5:
                                  randE.findFuel();
                                  break;
                    }
              }
        }
        newU.universe.set(0,p);
        fuelLabel.setText("Light Years Left: "+ playerInfo.myShip.lightYearsLeft);
        //updateMarket();
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
          
          if(dictionaryPoints.get(buttonId)!=1)
          {
            dictionaryPoints.put(buttonId, dictionaryPoints.get(buttonId)-1);
            totalSkillPoints.setText(""+(Integer.parseInt(""+totalSkillPoints.getText())+1));
            dictionaryLabel.get(buttonId).setText(""+dictionaryPoints.get(buttonId));
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
          updateMarket();
      } catch (Exception ex) {
            System.out.println("broke"+ex);
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
      int fuel = 0;
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
          if (!fuelNum.getText().equals("")) { 
              try {
                  fuel = Integer.parseInt(fuelNum.getText());
              } catch (Exception e) {
                  fuel = 0;
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
                  + machines*newU.universe.get(0).market.machinesPrice + water*newU.universe.get(0).market.waterPrice
                  + fuel * newU.universe.get(0).market.fuelPrice;
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
              playerInfo.myShip.lightYearsLeft += fuel;


          }
          updateMarket();
      } catch (Exception ex) {
            System.out.println(ex);
        }
    }   
    @FXML
    private void saveGame() throws Exception
    {
        try
        {
        DBFunctions x = new DBFunctions();
        x.saveGame(newU,playerInfo);
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }
    @FXML
    private void loadGame() throws Exception
    {
        try
        {
        DBFunctions x = new DBFunctions();
        x.loadGame();
        try {
            spaceTrader.SpaceTraderMain.replaceSceneContent("newScreen.fxml",this);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        }catch(Exception e)
        {
            System.out.println(e);
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
            fuelQuantityID.setText("Unlimited");
            fuelPriceID.setText("" + newU.universe.get(0).market.fuelPrice);
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
      
          if(easyButton.isSelected())
            difficultyLevel = "Easy";
          if(normalButton.isSelected())
            difficultyLevel = "Normal";
          if(hardButton.isSelected())
            difficultyLevel = "Hard";
          getName();
          playerInfo = new Character(userName,skill1Points,skill2Points,skill3Points,skill4Points,difficultyLevel);
                    try {  

          //System.out.println(playerInfo);
          spaceTrader.SpaceTraderMain.players.add(playerInfo);
          spaceTrader.SpaceTraderMain.replaceSceneContent("newScreen.fxml",this);
          newU = new Universe();
          newU.generateUniverse();
          Random rand = new Random();
          playerInfo.myShip.currentLoc[0] = rand.nextInt(600) ;
          playerInfo.myShip.currentLoc[0] = rand.nextInt(400) ;


        } catch (Exception ex) {
            System.out.println("sadsa"+ex);
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
