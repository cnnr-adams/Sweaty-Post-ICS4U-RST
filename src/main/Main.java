/*
 * Main.java
 * client code that runs the entire application
 * Connor Adams || Matthew Edwards || Grayden Hibbert || Marcus Kubilius
 * ICS4U
 * June 2018
 */
package main;

import PresentationClasses.Villain;
import PresentationClasses.WesternTown;
import dialog.DialogCreator;
import gui.DrawImageOnCanvas;
import wildWest.WildWest;

//update
public class Main {
	public static Villain Slimy,Sneaky,Shifty,Snitchy,Marshall_Virgil,Wyatt,Morgan,Doc_Holliday,tutorial,Burrito_Boi,Bepsi_Boi,Surfer_Boi,Beach_Girl;
	public static boolean paused = false;
	public static int i = 0;

	public static DrawImageOnCanvas game;

	public static void main(String[] args) {
		villianSetup();

		game = new DrawImageOnCanvas();
		new WildWest(tutorial);
		DialogCreator.createDialog("Totorial", intro(), 0);
	}

	/**
	 * pre: none
	 * post: all villains are instantiated
	 */
	public static void villianSetup() {
		// The Dalton Brothers (Slimy, Sneaky, Shifty and Snitchy)
		// the Earps (Marshall Virgil, Wyatt, Morgan, and Doc Holliday)

		WesternTown sweatyPost = new WesternTown(); sweatyPost.saloons = 2; sweatyPost.sheriffs = 1; sweatyPost.setTroublemakers(7);
		tutorial = new Villain("Bank Robber", true);
	/* Dalton Bros */ 
		Slimy = new Villain("Slimy", true);
		Sneaky = new Villain("Sneaky", true);
		Shifty = new Villain("Shifty", true);
		Snitchy = new Villain("Snitchy", true);
	/* The Earps */ 
		Marshall_Virgil = new Villain("Marshall Virgil", true);
		Wyatt = new Villain("Wyatt", true);
		Morgan = new Villain("Morgan", true);
		Doc_Holliday = new Villain("Doc Holliday", true);
	/* Bonus Bois */ 
		Burrito_Boi = new Villain("Burrito Boi", true);
		Bepsi_Boi = new Villain("Bepsi Boi", true);
		Surfer_Boi = new Villain("Surfer Boi", true);
		Beach_Girl = new Villain("Beach Girl", false);

		tutorial.villainSetup       ("Bank Robber",     "Yellow", "None",  "Blue",   "Male",   "Beer Gut",       "Jack Daniels");
		Slimy.villainSetup          ("Slimy",           "Yellow", "None",  "Blue",   "Male",   "Beer Gut",       "Jack Daniels");
		Sneaky.villainSetup         ("Sneaky",          "Silver", "Red",   "Navy",   "Male",   "Shadow",         "Beer");
		Shifty.villainSetup         ("Shifty",          "Grey",   "None",  "Yellow", "Male",   "Bookie",         "Whiskey");
		Snitchy.villainSetup        ("Snitchy",         "Grey",   "Brown", "Green",  "Male",   "buki",           "Tequila");
		Marshall_Virgil.villainSetup("Marshall Virgil", "Gold",   "Red",   "Blue",   "Male",   "ja",             "Wine");
		Wyatt.villainSetup          ("Wyatt",           "Gold",   "None",  "Navy",   "Male",   "Death Mere",     "Water");
		Morgan.villainSetup         ("Morgan",          "Yellow", "Brown", "Yellow", "Male",   "Horsearino",     "Mixed Drinks");
		Doc_Holliday.villainSetup   ("Doc Holliday",    "Silver", "None",  "Green",  "Male",   "Beer Hater",     "Jello Shots");
		Burrito_Boi.villainSetup    ("Burrito Boi",     "Burr",   "ito",   "Boi",    "Male",   "Condament King", "Tomato Juice");
		Bepsi_Boi.villainSetup      ("Bepsi Boi",       "Bep",    "si",    "Boi",    "Male",   "Bottle Truck",   "Diet Coke");
		Surfer_Boi.villainSetup     ("Surfer Boi",      "Surf",   "er",    "Boi",    "Male",   "Surf Board",     "Salt Water");
		Beach_Girl.villainSetup     ("Beach Girl",      "Bea",    "ch",    "Boi",    "Female", "Surfer Boi",     "Beach Cocktail");
	}
	
	public static String intro() {
		return("Welcome to our game of Wild West! The goal of the game is to defeat the 8 main villians and collect as many damsels "
				+ "as possible \nbefore you do so. Damsels are your score, everytime you defeat a villian you get damsels. You can "
				+ "check your damsels in the Hotel. \nIf you die, you lose all of your damsels and you respawn at the hotel. Movement "
				+ "is the wasd keys and interact is \"e\". You can interact \non any tile that has a red box. Test this newfound "
				+ "knowledge with the Station Master of the train Station. He will reward you with \ndamsels! \n\nWhen you fight an "
				+ "enemy it starts a game of wild west. The rules of tha game are simple: shoot your opponent and don't get shot. "
				+ "\nYou have three choices each turn (Shoot, Reload, or Dodge) \nShoot - if you have bullets, you shoot the enemy ("
				+ "if he blocks or also shoots nothing hallens) \nReload - you add one bullet to your revolver \nDodge - you block "
				+ "any bollets shot at you");
		
	}
}