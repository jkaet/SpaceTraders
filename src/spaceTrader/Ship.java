/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package spaceTrader;

import java.util.Random;

/**
 *
 * @author Brandens
 */
public class Ship {

    /**
     *Number of waters on the shit
     */
    public int water = 0;

    /**
     *Number of furs on the ship
     */
    public int fur = 0;

    /**
     *Number of food on the ship
     */
    public int food = 0;

    /**
     *Amount of ore on the ship
     */
    public int ore = 0;

    /**
     *Amount of games on the ship
     */
    public int games = 0;

    /**
     *Amount of firearms on the ship
     */
    public int firearms = 0;

    /**
     *Amount of medicine on the ship
     */
    public int medicine = 0;
    
    public shipType type = Ship.shipType.SMALL;

    /**
     *Amount of machines on the ship
     */
    public int machines = 0;

    /**
     *Amount of narcotics on the ship
     */
    public int narcotics = 0;

    /**
     *amount of robots on the ship
     */
    public int robots = 0;

    /**
     *The maximum size of the cargo storage
     */
    public int maxItems = 50;

    /**
     *
     */
    public String name;

    /**
     *
     */
    public int count = 0;
    int[] currentLoc = new int[2];
    int lightYearsLeft;

    /**
     *
     * @param ship
     */
    public Ship(String ship) {
        Random rand = new Random();
        name = ship;
        changeType(1);
        lightYearsLeft = rand.nextInt(150) +350;
    }

    /**
     *Checks to see if we can afford and store the items we are attempting to buy
     * @param amount
     * @param cost
     * @param credits
     * @return True if we can, False is we cannot
     */
    public boolean validBuy(int amount,int cost, int credits) {
         return (amount <= (maxItems - count))&&cost<=credits;
     }

    /**
     *Checks to see if a sale can be done or not. Based on credits/cargo space/etc.
     * @param w
     * @param fu
     * @param fo
     * @param o
     * @param g
     * @param fi
     * @param med
     * @param mac
     * @param narc
     * @param rob
     * @return True if we can, False is we cannot
     */
    public boolean validSale(int w, int fu, int fo, int o, int g, int fi, int med, int mac, int narc, int rob)
    {
        System.out.println((w<=water)&&(fu<=fur)
                &&(fo<=food)&&(o<=ore)
                &&(med<=medicine)&&(mac<=machines)
                &&(rob <= robots) && (narc<=narcotics)
                &&(g<=games));
        return(w<=water)&&(fu<=fur)
                &&(fo<=food)&&(o<=ore)
                &&(med<=medicine)&&(mac<=machines)
                &&(rob <= robots) && (narc<=narcotics)
                &&(g<=games);
    }

    /**
     *
     * @param check
     */
    public void addCount(int check) {
         count = count + check;
     }

    /**
     *Verifies that we can actually travel to a location based on the fuel we have left.
     * @param x
     * @param y
     * @return True if we have enough fuel left
     */
    public boolean travelPossible(int x, int y)
     {
         return( Math.pow(Math.pow(x-currentLoc[0], 2) + Math.pow(y - currentLoc[1],2),.5) < lightYearsLeft);
     }
    
    public enum shipType {
         SMALL, MEDIUM, LARGE
     }
    
    // type is an int (1 to 3) rep. the 3 different sizes .
    public void changeType(int type1) {
        shipType temp = null;
        int price = 0;
        switch (type1) {
            case 1:
                temp = type;
                price = 1000;
                type = Ship.shipType.SMALL;
                this.maxItems = 50;
                if (count > maxItems) {
                    // Set a label that says cannot downsize 
                    //because the item amount is too high
                    type = temp;
                } if (temp == Ship.shipType.LARGE) {
                    lightYearsLeft = lightYearsLeft - 200;
                } else if (temp == Ship.shipType.MEDIUM) {
                    lightYearsLeft = lightYearsLeft - 100;
                }
                if (temp != type && price <= FXMLDocumentController.playerInfo.credits ) {
                    FXMLDocumentController.playerInfo.credits = FXMLDocumentController.playerInfo.credits - price;
                }
                break;
            case 2:
                temp = type;
                price = 1800;
                type = Ship.shipType.MEDIUM;
                this.maxItems = 150;
                if (count > maxItems) {
                    // Set a label that says cannot downsize 
                    //because the item amount is too high
                    type = temp;
                }
                if (temp == Ship.shipType.LARGE) {
                    lightYearsLeft = lightYearsLeft - 100;
                } else if (temp == Ship.shipType.SMALL) {
                    lightYearsLeft = lightYearsLeft + 100;
                }
                if (temp != type && price <= FXMLDocumentController.playerInfo.credits ) {
                    FXMLDocumentController.playerInfo.credits = FXMLDocumentController.playerInfo.credits - price;
                }
                break;
            case 3:
                temp = type;
                price = 2400;
                type = Ship.shipType.LARGE;
                this.maxItems = 250;
                if (count > maxItems) {
                    // Set a label that says cannot downsize 
                    //because the item amount is too high
                    type = temp;
                }
                if (temp == Ship.shipType.MEDIUM) {
                    lightYearsLeft = lightYearsLeft + 100;
                } else if (temp == Ship.shipType.SMALL) {
                    lightYearsLeft = lightYearsLeft + 200;
                }
                if (temp != type && price <= FXMLDocumentController.playerInfo.credits ) {
                    FXMLDocumentController.playerInfo.credits = FXMLDocumentController.playerInfo.credits - price;
                }
                break;
                
        }
    }
}  