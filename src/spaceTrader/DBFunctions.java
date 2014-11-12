/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package spaceTrader;

import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.GenericTypeIndicator;
import com.firebase.client.ValueEventListener;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Quan
 */
public class DBFunctions 
{

    /**
     *Saves the game state to our firebase server
     * @param x
     * @param y
     * @throws Exception
     */
    public void saveGame(Universe x,Character y) throws Exception
    {
        try
        {
//            ParseObject gameScore = new ParseObject("GameScore");
//            System.out.println("1");
//            gameScore.put("score", 1337);
//            gameScore.put("playerName", "Sean Plott");
//            gameScore.put("cheatMode", false);
//            gameScore.saveInBackground();
            String xSerialize = toString(x);
            String ySerialize = toString(y);
            //Universe xs =(Universe) fromString(ys);
            Firebase ref = new Firebase("https://resplendent-inferno-3338.firebaseio.com/");
            Firebase usersRef = ref.child("users");
            Map<String, List<Object>> users = new HashMap<>();
            List<Object> info = new ArrayList<>();
            info.add(xSerialize);
            info.add(ySerialize);
            info.add(x);
            info.add(y);


            
            users.put(y.getName(),info);
            usersRef.setValue(users);
        }catch(Exception e)
        {
            System.out.println(e);
        }
        
    }

    /**
     *Loads the gamestate from our firebase
     * @throws Exception
     */
    public void loadGame() throws Exception
    {
        try
        {
            Firebase postsRef = new Firebase("https://resplendent-inferno-3338.firebaseio.com/");
            // Attach an listener to read the data at our posts reference
            postsRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot snapshot) {
                try {
                    Map<String, List<Object>> newPost = (Map<String, List<Object>>) snapshot.getValue();
                    Map<String, List<Object>> newPost2 = (Map<String, List<Object>>) newPost.get("users");
                    List<Object> newPost3 = newPost2.get("Unknown");
                    
                   
                    spaceTrader.FXMLDocumentController x = new FXMLDocumentController();
                     spaceTrader.FXMLDocumentController.playerInfo = (Character) fromString((String)newPost3.get(1));
                    spaceTrader.FXMLDocumentController.newU = (Universe) fromString((String)newPost3.get(0));
//                try
//                {
//                spaceTrader.SpaceTraderMain.replaceSceneContent("newScreen.fxml",x);
//                }catch(Exception e)
//                {
//                    System.out.println("ASDASDA"+e);
//                }
                } catch (IOException ex) {
                    Logger.getLogger(DBFunctions.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(DBFunctions.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            @Override
            public void onCancelled(FirebaseError firebaseError) {
                System.out.println("The read failed: " + firebaseError.getMessage());
            }
        });
        }catch(Exception e)
        {
            System.out.println("fail"+e);
        }
        
    }
    /** Read the object from Base64 string. */
   private static Object fromString( String s ) throws IOException ,
                                                       ClassNotFoundException {
        byte [] data = spaceTrader.Base64Coder.decode( s );
        ObjectInputStream ois = new ObjectInputStream( 
                                        new ByteArrayInputStream(  data ) );
        Object o  = ois.readObject();
        ois.close();
        return o;
   }

    /** Write the object to a Base64 string. */
    private static String toString( Serializable o ) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream( baos );
        oos.writeObject( o );
        oos.close();
        return new String( Base64Coder.encode( baos.toByteArray() ) );
    }
}
