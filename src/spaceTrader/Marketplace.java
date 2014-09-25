/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.   
 */
package spaceTrader;

import java.util.Random;

/**
 *
 * @author Thomas
 */
public class Marketplace {
    protected int water;
    protected int fur;
    protected int food;
    protected int ore;
    protected int games;
    protected int firearms;
    protected int medicine;
    protected int machines;
    protected int narcotics;
    protected int robots;
    
    public Marketplace(Planet p) {
        Random rand = new Random();
        water = 30 + (3 * p.techLevel) + (30 * (rand.nextInt(5)) / 10);
        fur = 250 + (10 * p.techLevel) + (250 * (rand.nextInt(11)) / 10);
        food = 100 +(5 * p.techLevel) + (100* (rand.nextInt(6)) / 10);
        ore = 350 + (20 *p.techLevel) + (350 * (rand.nextInt(10))/ 10);
        games = 250 + (-10 * p.techLevel) + (250 * rand.nextInt(6)/ 10);
        firearms = 1250 + (-75 * p.techLevel) + (1250 * rand.nextInt(101)/ 10);
        medicine = 650 + (-20 * p.techLevel) + (650 * rand.nextInt(11)/ 10);
        machines = 900 + (-30 * p.techLevel) + (900 * rand.nextInt(6)/10);
        narcotics = 3500 + (-125 * p.techLevel) + (3500 * rand.nextInt(151)/10);
        robots = 5000 + (-150 * p.techLevel) + (5000 * rand.nextInt(101)/10);
    }
}
