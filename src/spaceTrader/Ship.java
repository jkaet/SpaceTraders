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
    
    public Ship(String ship) {
        name = ship;
    }
     public boolean checkCount(int check) {
         return (check <= (maxItems - count));
     }
     
     public void addCount(int check) {
         count = count + check;
     }
}  
