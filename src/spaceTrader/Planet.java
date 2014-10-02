/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package spaceTrader;

/**
 *
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
    public void generateMarket()
    {
        market = new Market();
        market.generatePricesAndQuanities(this);
    }
    
    public String toString(){
        String pInfo = new String();
        pInfo = "";
        pInfo = name + ",  Tech Level: " + techLevel + ", Resource Level: " + resourceLevel + 
                ", X Location: " + xLocation + ", Y Location: " + yLocation;
        return pInfo;
    }
}
