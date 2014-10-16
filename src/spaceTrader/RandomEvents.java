package spaceTrader; 

import java.util.Random;

/**
 *
 * @author Thomas
 */
public class RandomEvents {


	/*
	*	1. Find Money 
	*	2. Get Robbed
	*	3. Get Pulled Over
	*		3a. runAway
	*		3b. stay
	*	4. Lose Cargo
	*
	*/
        Character player;

    /**
     * Constructor that allows the class to act against the user
     * 
     * 
     * @param player
     */
    public RandomEvents(Character player){
		this.player = player;
	}

    /**
     * Doesn't return anything. Just a random event to happen to
     * a player on any given turn. Player's money will increase by some 
     * number of credits between 0 and 6000.
     * 
     */
    public void findMoney(){
	
            Random rand = new Random();
            int cash = rand.nextInt(6001);

            player.credits += cash;

            System.out.println("Congratulations! You found "+cash+" credits! TURN UP!");

	}

    /**
     * Doesn't return anything. Just a random event to happen to 
     * a player on any given turn. Player's money will decrease by some
     * number of credits between 0 and 5100
     * 
     */
    public void getRobbed(){

            Random rand = new Random();
            int stolenMoney = rand.nextInt(5101);

            if(player.credits < stolenMoney){
                    player.credits = 0;
            }
            else{
                    player.credits -= stolenMoney;
            }

            System.out.println("You've been robbed! They took "+stolenMoney+" credits! Sucks to suck!");

	}

    /**
     * Doesn't return anything. This is an event that can happen to a 
     * player in the event that he/she gets pulled over. This option allows the user
     * a 50% chance to attempt get out of having their narcotics confiscated.
     * However, if he/she get caught they lose their narcotics and their money.
     * 
     * 
     */
    public void runAway(){
        Random rand = new Random();
        int temp = rand.nextInt(51);
        
        if(temp > 26){
            player.credits = 0;
            player.myShip.narcotics = 0;  
         }


	}
        
    /**
     * Doesn't return anything. This is an event that can happen to a player
     * in the event that he/she gets pulled over. This option allows the user to
     * simply lose his/her narcotics with no further consequences. 
     * 
     * 
     */
    public void stay(){
            player.myShip.narcotics = 0;
        }

    /**
     * Doesn't return anything. Just a random event to happen a player on any
     * given turn. Player loses all of one item on the ship. 
     * 
     */
    public void loseCargo(){

            Random rand = new Random();
            int item = rand.nextInt(11);
            //int numLost = rand.nextInt(6);

            switch(item){
                    case 1:
                            player.myShip.water -= 0;
                            break;
                    case 2:
                            player.myShip.fur = 0;
                            break;
                    case 3:
                            player.myShip.food = 0;
                            break;
                    case 4:
                            player.myShip.ore = 0;
                            break;
                    case 5:
                            player.myShip.games = 0;
                            break;
                    case 6:
                            player.myShip.firearms = 0;
                            break;
                    case 7:
                            player.myShip.medicine = 0;
                            break;
                    case 8:
                            player.myShip.machines = 0;
                            break;
                    case 9:
                            player.myShip.narcotics = 0;
                            break;
                    case 10:
                            player.myShip.robots = 0;
                            break;
                    default:
                            break;
            }

    }

}
