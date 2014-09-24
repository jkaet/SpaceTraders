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

    /**
    *A getter method that retrieves the name of the character.
    *@param none
    *@return name as a string
    *
    */
    public String getName(){
        return name;
    }
    
    /**
    *A getter method that returns the pilot skill points. 
    *@param none
    *@return number of points as an int
    *
    */

    public int getPilotPoints(){
        return pilotPoints;
    }

    /**
    *A getter method that returns the fighter skill points.
    *@param none
    *@return the number of points as an int
    *
    */
    
    public int getFighterPoints(){
        return fighterPoints;
    }
    
    /**
    *A getter method that returns the trader skill points.
    *@param none
    *@return the number of points as an int
    *
    */

    public int getTraderPoints(){
        return traderPoints;
    }
    
    /**
    *A getter method that returns the enginner skill points.
    *@param none
    *@return the number of points as an int
    *
    */

    public int getEngineerPoints(){
        return engineerPoints;
    }
    
    /**
    *A getter method that returns the difficulty level.
    *@param none
    *@return the difficulty level as a string
    *
    */

    public String getDifficultyLevel(){
        return difficultyLevel;
    }
    
    // SETTERS

    /**
    *A setter method to set the name of the character.
    *@param A string with the desired name for the character.
    *@return none
    *
    */
    
    public void setName(String name){
        this.name = name; 
    }
    
    /**
    *A setter method to set the fighter skill points.
    *@param fighter skill points as an int. 
    *@return none
    *
    */

    public void setFighterPoints(int fighterPoints){
        this.fighterPoints = fighterPoints;
    }
    
    /**
    *A setter method to set the trader skill points.
    *@param trader skill points as an int. 
    *@return none
    *
    */

    public void setTraderPoints(int traderPoints){
        this.traderPoints = traderPoints;
    }
    
    /**
    *A setter method to set the engineer skill points.
    *@param engineer skill points as an int. 
    *@return none
    *
    */

    public void setEngineerPoints(int engineerPoints){
        this.engineerPoints = engineerPoints;
    }
    
    /**
    *A setter method to set the pilot skill points.
    *@param pilot skill points as an int. 
    *@return none
    *
    */
    public void setPilotPoints (int pilotPoints){
        this.pilotPoints = pilotPoints;
    }
    
    /**
    *A toString method that returns a string containing 
    *information about the character including name, skill points, and difficulty level.
    *@param none
    *@return A string with character information.
    *
    */
    public String toString()
    {
        return "Name: " + name + "; Pilot Points: " + pilotPoints + "; Fighter Points: " + fighterPoints + "; Trader Points: " 
                + traderPoints + "; Engineer Points: " + engineerPoints + "; Difficulty Level: " + difficultyLevel;
    }

    
   
    
    
    
    
}
