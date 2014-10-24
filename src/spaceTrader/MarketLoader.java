/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package spaceTrader;

import java.net.URL;
import java.util.Collections;
import java.util.ResourceBundle;
import javafx.application.Preloader;
import javafx.application.Preloader.ProgressNotification;
import javafx.application.Preloader.StateChangeNotification;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import static spaceTrader.FXMLDocumentController.newU;
import static spaceTrader.FXMLDocumentController.playerInfo;

/**
 * Simple Preloader Using the ProgressBar Control
 *
 * @author Quan
 */
public class MarketLoader implements Initializable {
    
    ProgressBar bar;
    Stage stage;
    private Planet planet;
    private Universe copyU;
    private Planet planett;
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
 
    private Scene createPreloaderScene() {
        bar = new ProgressBar();
        BorderPane p = new BorderPane();
        p.setCenter(bar);
        return new Scene(p, 300, 150);        
    }
    
 
       @FXML
    private void enterMarket(ActionEvent event) throws Exception{
      try {
            spaceTrader.SpaceTraderMain.replaceSceneContent("Marketplace.fxml",this);
            updateMarket();
            copyU = newU;
        
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
          DBFunctions x = new DBFunctions();
          x.saveGame(newU,playerInfo);
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

    /**
     *
     */
    public MarketLoader()
    {
              
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
              updateMarket();

    }
    
}
