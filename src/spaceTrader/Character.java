package spaceTrader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Thomas
 */

// pilot, fighter, trader, engineer

//name, 4 skill points, difficulty level, 

public class Character {
     
    private String name = "";
    private int pilotPoints;
    private int fighterPoints;
    private int traderPoints;
    private int engineerPoints;
    private String difficultyLevel;
    
    public Character(String name, int pilotPoints, int fighterPoints,
                    int traderPoints, int engineerPoints, String difficultyLevel){
        this.name = name;
        this.pilotPoints = pilotPoints;
        this.fighterPoints = fighterPoints;
        this.traderPoints = traderPoints;
        this.engineerPoints = engineerPoints;
        this.difficultyLevel = difficultyLevel;
    }
    
    //GETTERS
    
    public String getName(){
        return name;
    }
    
    public int getPilotPoints(){
        return pilotPoints;
    }
    
    public int getFighterPoints(){
        return fighterPoints;
    }
    
    public int getTraderPoints(){
        return traderPoints;
    }
    
    public int getEngineerPoints(){
        return engineerPoints;
    }
    
    public String getDifficultyLevel(){
        return difficultyLevel;
    }
    
    // SETTERS
    public void setName(String name){
        this.name = name; 
    }
    
    public void setFighterPoints(int fighterPoints){
        this.fighterPoints = fighterPoints;
    }
    
    public void setTraderPoints(int traderPoints){
        this.traderPoints = traderPoints;
    }
    
    public void setEngineerPoints(int engineerPoints){
        this.engineerPoints = engineerPoints;
    }
    
    public void setPilotPoints (int pilotPoints){
        this.pilotPoints = pilotPoints;
    }
    
    public String toString()
    {
        return "Name: " + name + "; Pilot Points: " + pilotPoints + "; Fighter Points: " + fighterPoints + "; Trader Points: " 
                + traderPoints + "; Engineer Points: " + engineerPoints + "; Difficulty Level: " + difficultyLevel;
    }

    
   
    
    
    
    
}
