package spaceTrader; 

import java.util.Random;



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
	public RandomEvents(Character player){
		this.player = player;
	}

	public void findMoney(){
	
            Random rand = new Random();
            int cash = rand.nextInt(601);

            player.credits += cash;

            System.out.println("Congratulations! You found "+cash+" credits! TURN UP!");

	}

	public void getRobbed(){

            Random rand = new Random();
            int stolenMoney = rand.nextInt(5100);

            if(player.credits < stolenMoney){
                    player.credits = 0;
            }
            else{
                    player.credits -= stolenMoney;
            }

            System.out.println("You've been robbed! They took "+stolenMoney+" credits! Sucks to suck!");

	}

	public void runAway(){

            int fine = 2500;

            player.credits -= fine;
            player.myShip.narcotics = 0;

            System.out.println("You got caught speeding and got pulled over. The fine is " + fine +" credits.");

	}
        
        public void stay(){
            player.myShip.narcotics = 0;
        }

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
