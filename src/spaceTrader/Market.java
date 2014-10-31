/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spaceTrader;

import java.io.Serializable;
import java.util.Random;

/**
 *
 * @author Quan
 */
public class Market implements Serializable
{

    /**
     *
     */
    public int waterPrice;

    /**
     *
     */
    public int robotsPrice;

    /**
     *
     */
    public int machinesPrice;

    /**
     *
     */
    public int narcoticsPrice;

    /**
     *
     */
    public int fursPrice;

    /**
     *
     */
    public int medicinePrice;

    /**
     *
     */
    public int foodPrice;

    /**
     *
     */
    public int gamesPrice;

    /**
     *
     */
    public int oresPrice;

    /**
     *
     */
    public int firearmsPrice;

    /**
     *
     */
    public int waterQuant;

    /**
     *
     */
    public int robotsQuant;

    /**
     *
     */
    public int machinesQuant;

    /**
     *
     */
    public int narcoticsQuant;

    /**
     *
     */
    public int fursQuant;

    /**
     *
     */
    public int medicineQuant;

    /**
     *
     */
    public int foodQuant;

    /**
     *
     */
    public int gamesQuant;

    /**
     *
     */
    public int oresQuant;

    /**
     *
     */
    public int firearmsQuant;

    /**
     *
     */
    public Market()
    {
        waterPrice = 0;
        robotsPrice = 0;
        machinesPrice = 0;
        fursPrice = 0;
        medicinePrice = 0;
        oresPrice = 0;
        narcoticsPrice = 0;
        gamesPrice = 0;
        foodPrice = 0;
        firearmsPrice = 0;
        waterQuant = 0;
        robotsQuant= 0;
        machinesQuant = 0;
        narcoticsQuant = 0;
        fursQuant = 0;
        medicineQuant = 0;
        foodQuant = 0;
        gamesQuant = 0;
        oresQuant = 0;
        firearmsQuant = 0;
    }

    /**
     *
     * @param p
     */
    public void generatePricesAndQuanities(Planet p)
    {
        Random rand = new Random();
        waterPrice = 30 + (3 * p.resourceLevel) + (30 * (rand.nextInt(5)) / 10);
        fursPrice = 250 + (10 * p.resourceLevel) + (250 * (rand.nextInt(11)) / 10);
        foodPrice = 100 +(5 * p.resourceLevel) + (100* (rand.nextInt(6)) / 10);
        oresPrice = 350 + (20 *p.resourceLevel) + (350 * (rand.nextInt(10))/ 10);
        gamesPrice = 250 + (-10 * p.techLevel) + (250 * rand.nextInt(6)/ 10);
        firearmsPrice = 850 + (-115 * (10-p.techLevel)) + (850 * rand.nextInt(25)/ 10);
        medicinePrice = 650 + (-20 * (10-p.techLevel)) + (650 * rand.nextInt(11)/ 10);
        machinesPrice = 900 + (-30 * (10-p.techLevel)) + (900 * rand.nextInt(6)/10);
        narcoticsPrice = 1500 + (-125 * (10-p.techLevel)) + (1500 * rand.nextInt(25)/10);
        robotsPrice = 3000 + (-150 * (10-p.techLevel)) + (3000 * rand.nextInt(25)/10);
        waterQuant = (3 * p.resourceLevel);
        fursQuant = (10 * p.resourceLevel);
        foodQuant = (5 * p.resourceLevel);
        oresQuant = (20 *p.resourceLevel);
        gamesQuant = (10 * p.techLevel);
        firearmsQuant = (75 * p.techLevel);
        medicineQuant = (20 * p.techLevel) ;
        machinesQuant = (30 * p.techLevel);
        narcoticsQuant = (125 * p.techLevel) ;
        robotsQuant = (8 * p.techLevel);
    }

    /**
     *
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
     * @return
     */
    public boolean isValid(int w, int fu, int fo, int o, int g, int fi, int med, int mac, int narc, int rob)
    {
        return(w<=waterQuant)&&(fu<=fursQuant)
                &&(fo<=foodQuant)&&(o<=oresQuant)
                &&(med<=medicineQuant)&&(mac<=machinesQuant)
                &&(rob <= robotsQuant) && (narc<=narcoticsQuant)
                &&(g<=gamesQuant);
    }
}
