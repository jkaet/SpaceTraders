/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package spaceTrader;

/**
 *Ship class checks for valid buys and sales 
 *
 * @author Brandens
 */
public class Ship {
    public int water = 0;
    public int fur = 0;
    public int food = 0;
    public int ore = 0;
    public int games = 0;
    public int firearms = 0;
    public int medicine = 0;
    public int machines = 0;
    public int narcotics = 0;
    public int robots = 0;
    public int maxItems = 50;
    public String name;
    public int count = 0;
    
    /**
    *Constructor that sets name of ship
    *@param String ship's name
    */
    public Ship(String ship) {
        name = ship;
    }

    /**
    *Checks if buy is valid
    *@param amount, cost, credits 
    *@return boolean 
    */

     public boolean validBuy(int amount,int cost, int credits) {
         return (amount <= (maxItems - count))&&cost<=credits;
     }
    
    /**
    *Checks if sale is valid
    *@param quantities of player's items
    *@return boolean 
    */ 
    
       public boolean validSale(int w, int fu, int fo, int o, int g, int fi, int med, int mac, int narc, int rob)
    {
        System.out.println((w<=water)&&(fu<=fur)
                &&(fo<=food)&&(o<=ore)
                &&(med<=medicine)&&(mac<=machines)
                &&(rob <= robots) && (narc<=narcotics)
                &&(g<=games));
        System.out.println(rob+"   "+robots);
        return(w<=water)&&(fu<=fur)
                &&(fo<=food)&&(o<=ore)
                &&(med<=medicine)&&(mac<=machines)
                &&(rob <= robots) && (narc<=narcotics)
                &&(g<=games);
    }

    /**
    *adds to the amount of total goods
    *@param check
    *@return void
    */

     public void addCount(int check) {
         count = count + check;
     }
}  