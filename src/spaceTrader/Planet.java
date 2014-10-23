/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package spaceTrader;

/**
 * Planet class holds info about planet and generates
 *new market 
 * @author Brandens
 */
public class Planet {
    public String name;
    public int techLevel;
    public int resourceLevel;
    public int xLocation;
    public int yLocation;
    public Market market;
    public Planet(String name, int tec, int res, int x, int y) {
        this.name = name;
        techLevel = tec;
        resourceLevel = res;
        xLocation = x;
        yLocation = y;
        
    }

/**
*Generates new Market with random prices and quantities
*@return none
*
*/    
    public void generateMarket()
    {
        market = new Market();
        market.generatePricesAndQuanities(this);
    }
    
/**
*Returns string with planet name and attributes
*@return String
*
*/        
    public String toString(){
        String pInfo = new String();
        pInfo = "";
        pInfo = name + ",  Tech Level: " + techLevel + ", Resource Level: " + resourceLevel + 
                ", X Location: " + xLocation + ", Y Location: " + yLocation;
        return pInfo;
    }
}
