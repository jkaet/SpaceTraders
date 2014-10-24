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
import com.parse.Parse;
import com.parse.ParseObject;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

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
            Firebase ref = new Firebase("https://resplendent-inferno-3338.firebaseio.com/");
            Firebase usersRef = ref.child("users");
            Map<String, List<Object>> users = new HashMap<>();
            List<Object> info = new ArrayList<>();
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
                Map<String, List<Object>> newPost = (Map<String, List<Object>>) snapshot.getValue();
                System.out.println(newPost.get("users"));
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
}
