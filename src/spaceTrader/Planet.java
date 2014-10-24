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

    /**
     *Planet name
     */
    public String name;

    /**
     *Planet techLevel;
     */
    public int techLevel;

    /**
     *Planet resourceLevel;
     */
    public int resourceLevel;

    /**
     *Planet xLocation;
     */
    public int xLocation;

    /**
     *planet yLocation
     */
    public int yLocation;

    /**
     *
     */
    public Market market;

    /**
     *Generates a planet and its properties
     * @param name
     * @param tec
     * @param res
     * @param x
     * @param y
     */
    public Planet(String name, int tec, int res, int x, int y) {
        this.name = name;
        techLevel = tec;
        resourceLevel = res;
        xLocation = x;
        yLocation = y;
        
    }

    /**
     *Creates the planets market
     */
    public void generateMarket()
    {
        market = new Market();
        market.generatePricesAndQuanities(this);
    }
    /**
     *Provides string representation of Planet
     */
    public String toString(){
        String pInfo = new String();
        pInfo = "";
        pInfo = name + ",  Tech Level: " + techLevel + ", Resource Level: " + resourceLevel + 
                ", X Location: " + xLocation + ", Y Location: " + yLocation;
        return pInfo;
    }
}
