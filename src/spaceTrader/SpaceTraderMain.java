/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package spaceTrader;

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
    public static ArrayList<Character> players = new ArrayList();
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
 public static Parent replaceSceneContent(String fxml, Object obj) throws Exception {
        FXMLLoader loader = new FXMLLoader(SpaceTraderMain.class.getResource(fxml));
        loader.setController(obj);
        Parent page = (Parent)loader.load();

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
        return page;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        launch(args);
    }
    
}
