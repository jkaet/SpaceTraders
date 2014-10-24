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

    /**
     *
     */
    public int credits;

    /**
     *
     */
    public Ship myShip;
    private String difficultyLevel;
    
    /**
     * Creates the character with properties chosen.
     * @param name
     * @param pilotPoints
     * @param fighterPoints
     * @param traderPoints
     * @param engineerPoints
     * @param difficultyLevel
     */
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
     *
     * @return the character name
     */
        
    public String getName(){
        return name;
    }
    
    /**
     *
     * @return number of pilot points
     */
    public int getPilotPoints(){
        return pilotPoints;
    }
    
    /**
     *
     * @return number of fighter points
     */
    public int getFighterPoints(){
        return fighterPoints;
    }
    
    /**
     *
     * @return number of trader points
     */
    public int getTraderPoints(){
        return traderPoints;
    }
    
    /**
     *
     * @return number of engineer points
     */
    public int getEngineerPoints(){
        return engineerPoints;
    }
    
    /**
     *
     * @return difficultyLevel
     */
    public String getDifficultyLevel(){
        return difficultyLevel;
    }
    
    // SETTERS

    /**
     *Sets the name
     * @param name
     */
        public void setName(String name){
        this.name = name; 
    }
    
    /**
     *sets fighter Points
     * @param fighterPoints
     */
    public void setFighterPoints(int fighterPoints){
        this.fighterPoints = fighterPoints;
    }
    
    /**
     *sets trader points
     * @param traderPoints
     */
    public void setTraderPoints(int traderPoints){
        this.traderPoints = traderPoints;
    }
    
    /**
     *sets engineer points
     * @param engineerPoints
     */
    public void setEngineerPoints(int engineerPoints){
        this.engineerPoints = engineerPoints;
    }
    
    /**
     * Sets pilot points
     * @param pilotPoints
     */
    public void setPilotPoints (int pilotPoints){
        this.pilotPoints = pilotPoints;
    }
    /**
     * @returns string representation of the player
     */
    public String toString()
    {
        return "Name: " + name + "; Pilot Points: " + pilotPoints + "; Fighter Points: " + fighterPoints + "; Trader Points: " 
                + traderPoints + "; Engineer Points: " + engineerPoints + "; Difficulty Level: " + difficultyLevel;
    }

    
   
    
    
    
    
}
