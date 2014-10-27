/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package spaceTrader;

import com.parse.Parse;
import java.util.ArrayList;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Quan
 */
public class SpaceTraderMain extends Application {
    private static Stage mystage;

    /**
     *
     */
    public static ArrayList<Character> players = new ArrayList();

    /**
     *
     */
    public static String CLASS_NAME = "spaceTraders";
    private static String APP_ID = "RWjFpDDbwCIXF8Gy9dHEBpR7Fs2PZ0UzcNdxhAvf";
    private static String APP_REST_API_ID = "EWpTGoOFgGr9vXfPLBRYZjhDL0pg4MQ1F7i3wWAq";
     /**
     *Initializes the first view
     * @param stage
     * @throws Exception
     */
    @Override
    public void start(Stage stage) throws Exception {

        Parent root;
        mystage = new Stage();
        System.out.println(""+getClass());
        root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        System.out.println(root == null);
        Scene scene = new Scene(root);
        
        mystage.setScene(scene);
        mystage.show();
        
    }

    /**
     *Switches scenes
     * @param fxml
     * @param obj
     * @throws Exception
     */
    public static void replaceSceneContent(String fxml, Object obj) throws Exception {

     FXMLLoader loader = new FXMLLoader();

     try
       {

           loader = new FXMLLoader(SpaceTraderMain.class.getResource(fxml));
       }catch(Exception e) {
           
       }
        try{
                    loader.setController(obj);

        }catch(Exception e)
        {
            System.out.println(e);
        }
     Parent page;
         page = (Parent)loader.load();
   
        Scene scene;
        scene = mystage.getScene();

        if (scene == null) {
            scene = new Scene(page, 700, 450);
            //scene.getStylesheets().add(SpaceTraderMain.class.getResource("demo.css").toExternalForm());
            mystage.setScene(scene);
        } else {
            mystage.getScene().setRoot(page);
        }
        mystage.sizeToScene();
        
       //return page;
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        launch(args);
    }
    
}
