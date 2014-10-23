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
    public int credits;
    public Ship myShip;
    private String difficultyLevel;
    
    public Character(String name, int pilotPoints, int fighterPoints,
                    int traderPoints, int engineerPoints, String difficultyLevel){
        this.name = name;
        this.pilotPoints = pilotPoints;
        this.fighterPoints = fighterPoints;
        this.traderPoints = traderPoints;
        this.engineerPoints = engineerPoints;
        this.difficultyLevel = difficultyLevel;
        credits = 50000;
        myShip = new Ship("ShipQ");
    }
    
    //GETTERS

    /**
    *Returns name of character
    *@return name as a String
    *
    */    
    public String getName(){
        return name;
    }
    
    /**
    *Returns pilot points of character
    *@return points as an int
    *
    */

    public int getPilotPoints(){
        return pilotPoints;
    }

    /**
    *Returns fighter points of character
    *@return points as an int
    *
    */

    public int getFighterPoints(){
        return fighterPoints;
    }
    
    /**
    *Returns trader points of character
    *@return points as an int
    *
    */

    public int getTraderPoints(){
        return traderPoints;
    }
    
    /**
    *Returns engineer points of character
    *@return points as an int
    *
    */

    public int getEngineerPoints(){
        return engineerPoints;
    }
    
    /**
    *Returns difficulty level of character
    *@return level as a String
    *
    */
    public String getDifficultyLevel(){
        return difficultyLevel;
    }
    
    // SETTERS
    
    /**
    *Sets name of the character
    *@param desired name as a string
    *
    */
    
    public void setName(String name){
        this.name = name; 
    }
    
    /**
    *Sets fighter points of the character
    *@param points as an int
    *
    */

    public void setFighterPoints(int fighterPoints){
        this.fighterPoints = fighterPoints;
    }
    
    /**
    *Sets trader points of the character
    *@param points as an int
    *
    */

    public void setTraderPoints(int traderPoints){
        this.traderPoints = traderPoints;
    }
    
    /**
    *Sets engineer points of the character
    *@param points as an int
    *
    */

    public void setEngineerPoints(int engineerPoints){
        this.engineerPoints = engineerPoints;
    }
    
    /**
    *Sets pilot points of the character
    *@param points as an int
    *
    */

    public void setPilotPoints (int pilotPoints){
        this.pilotPoints = pilotPoints;
    }
    
    /**
    *Returns character name and attributes in a string
    *@return String
    *
    */
    public String toString()
    {
        return "Name: " + name + "; Pilot Points: " + pilotPoints + "; Fighter Points: " + fighterPoints + "; Trader Points: " 
                + traderPoints + "; Engineer Points: " + engineerPoints + "; Difficulty Level: " + difficultyLevel;
    }

    
   
    
    
    
    
}
