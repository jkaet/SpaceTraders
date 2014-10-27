/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package spaceTrader;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Brandens
 */
public class Universe implements Serializable{
    private static String[] planet = {
    "Acamar",
    "Adahn",		// The alternate personality for The Nameless One in "Planescape: Torment"
    "Aldea",
    "Andevian",
    "Antedi",
    "Balosnee",
    "Baratas",
    "Brax",			// One of the heroes in Master of Magic
    "Bretel",		// This is a Dutch device for keeping your pants up.
    "Calondia",
    "Campor",
    "Capelle",		// The city I lived in while programming this game
    "Carzon",
    "Castor",		// A Greek demi-god
    "Cestus",
    "Cheron",		
    "Courteney",	// After Courteney Cox…
    "Daled",
    "Damast",
    "Davlos",
    "Deneb",
    "Deneva",
    "Devidia",
    "Draylon",
    "Drema",
    "Endor",
    "Esmee",		// One of the witches in Pratchett's Discworld
    "Exo",
    "Ferris",		// Iron
    "Festen",		// A great Scandinavian movie
    "Fourmi",		// An ant, in French
    "Frolix",		// A solar system in one of Philip K. Dick's novels
    "Gemulon",
    "Guinifer",		// One way of writing the name of king Arthur's wife
    "Hades",		// The underworld
    "Hamlet",		// From Shakespeare
    "Helena",		// Of Troy
    "Hulst",		// A Dutch plant
    "Iodine",		// An element
    "Iralius",
    "Janus",		// A seldom encountered Dutch boy's name
    "Japori",
    "Jarada",
    "Jason",		// A Greek hero
    "Kaylon",
    "Khefka",
    "Kira",			// My dog's name
    "Klaatu",		// From a classic SF movie
    "Klaestron",
    "Korma",		// An Indian sauce
    "Kravat",		// Interesting spelling of the French word for "tie"
    "Krios",
    "Laertes",		// A king in a Greek tragedy
    "Largo",
    "Lave",			// The starting system in Elite
    "Ligon",
    "Lowry",		// The name of the "hero" in Terry Gilliam's "Brazil"
    "Magrat",		// The second of the witches in Pratchett's Discworld
    "Malcoria",
    "Melina",
    "Mentar",		// The Psilon home system in Master of Orion
    "Merik",
    "Mintaka",
    "Montor",		// A city in Ultima III and Ultima VII part 2
    "Mordan",
    "Myrthe",		// The name of my daughter
    "Nelvana",
    "Nix",			// An interesting spelling of a word meaning "nothing" in Dutch
    "Nyle",			// An interesting spelling of the great river
    "Odet",
    "Og",			// The last of the witches in Pratchett's Discworld
    "Omega",		// The end of it all
    "Omphalos",		// Greek for navel
    "Orias",
    "Othello",		// From Shakespeare
    "Parade",		// This word means the same in Dutch and in English
    "Penthara",
    "Picard",		// The enigmatic captain from ST:TNG
    "Pollux",		// Brother of Castor
    "Quator",
    "Rakhar",
    "Ran",			// A film by Akira Kurosawa
    "Regulas",
    "Relva",
    "Rhymus",
    "Rochani",
    "Rubicum",		// The river Ceasar crossed to get into Rome
    "Rutia",
    "Sarpeidon",
    "Sefalla",
    "Seltrice",
    "Sigma",
    "Sol",			// That's our own solar system
    "Somari",
    "Stakoron",
    "Styris",
    "Talani",
    "Tamus",
    "Tantalos",		// A king from a Greek tragedy
    "Tanuga",
    "Tarchannen",
    "Terosa",
    "Thera",		// A seldom encountered Dutch girl's name
    "Titan",		// The largest moon of Jupiter
    "Torin",		// A hero from Master of Magic
    "Triacus",
    "Turkana",
    "Tyrus",
    "Umberlee",		// A god from AD&D, which has a prominent role in Baldur's Gate
    "Utopia",		// The ultimate goal
    "Vadera",
    "Vagra",
    "Vandor",
    "Ventax",
    "Xenon",
    "Xerxes",		// A Greek hero
    "Yew",			// A city which is in almost all of the Ultima games
    "Yojimbo",		// A film by Akira Kurosawa
    "Zalkon",
    "Zuul"			// From the first Ghostbusters movie
};
    
    /**
     *
     */
    public ArrayList<Planet> universe = new ArrayList<>();
    
    /**
     *
     */
    public Universe(){
        
    }
    
    /**
     *Generates each planet for the Universe
     */
    public void generateUniverse(){
        Random rand = new Random();
        int xLoc;
        int yLoc;
        int techLevel;
        int recLevel;
        for(int i = 0; i < planet.length; i++){
            xLoc = rand.nextInt(601);
            yLoc = rand.nextInt(401);
            techLevel = rand.nextInt(8);
            recLevel = rand.nextInt(12);
            Planet newPlanet = new Planet(planet[i], techLevel, recLevel, xLoc, yLoc);
            System.out.println(newPlanet.toString());
            newPlanet.generateMarket();
            universe.add(newPlanet);
        }
    }

    /**
     *
     * @return
     */
    public ArrayList<Planet> getCopy()
    {
        ArrayList<Planet> x = new ArrayList<>(universe.size());
        for(Planet item: universe) x.add(item);

        return x;
    }
    public String toString()
    {
        String x = new String();
        for(Planet p: universe)
            x += p.toString();
        return x;
    }

}
