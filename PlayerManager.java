/** 
 * Program: NFL Player Program
 * File: PlayerManager.java 
 * Summary: The PlayerManager program displays 6 characters and their attributes.
 * Author: Robert J Nichols
 * Date: 11/04/2017
 **/ 

class PlayerManager { //Instructor Hebert: I tried but could not figure out the array list so I did it the incorrect way but I wanted to get the program to run.
       
    public static void main(String[] args){
        createPlayers(); //Call createPlayers method
    }
    
    public static void createPlayers(){
        
        final int ARRAY_LENGTH = 3; //Declare constant to set array size.
        OffensivePlayer[] oplayer = new OffensivePlayer[ARRAY_LENGTH];
        DefensivePlayer[] dplayers = new DefensivePlayer[ARRAY_LENGTH];//create an array of Player objects
        
        // Instantiate the Offensive Player class. 
        OffensivePlayer oplayer1 = new OffensivePlayer("Tom", "Brady", 40, 12, "Michigan", "18 Seasons", "Patriots", "Quarterback", "Passing Yards", 2541, true); // Creates an instance of the Player class and initialize class instance variables
        OffensivePlayer oplayer2 = new OffensivePlayer("Bryson", "Albright", 23, 54, "Miami", "1 Season", "Cardinals",  "Running Back", "Touchdowns", 2, true); // Creates an instance of the Player class and initialize class instance variables
        OffensivePlayer oplayer3 = new OffensivePlayer("Kaelin", "Clay", 25, 12, "Utah", "3 Seasons", "Panthers",  "Wide Receiver", "Touchdowns", 2, true); // Creates an instance of the Player class and initialize class instance variables
        // Instantiate the Defensive Player class.     
        DefensivePlayer defensivePlayers = new DefensivePlayer("Matt", "Kalil", 28, 75, "Southern California", "6 Seasons", "Raiders",  "Tackle", "Games Started", 2, true); // Creates an instance of the Player class and initialize class instance variables
        DefensivePlayer defensivePlayers2  = new DefensivePlayer("David", "Mayo", 24, 55, "Texas", "3 Seasons", "Broncos", "Line backer", "Tackles", 24,true); // Creates an instance of the Player class and initialize class instance variables
        DefensivePlayer defensivePlayers3 = new DefensivePlayer("Russel", "Shepard", 27, 5, "Ohio", "5 Seasons", "Cowboys",  "Corner Back", "Tackles", 2, true); // Creates an instance of the Player class and initialize class instance variables

        oplayer[0] = oplayer1; // adding Tom Brady Player to the array of players
        oplayer[1] = oplayer2; // adding Bryson Albright Player to the array of players
        oplayer[2] = oplayer3; // adding Kaelin Clay Player to the array of players
        dplayers[0] = defensivePlayers; // adding Matt Kalil Player to the array of players
        dplayers[1] = defensivePlayers2; // adding David Mayo Player to the array of players
        dplayers[2] = defensivePlayers3; // adding Russel Shepard Player to the array of players
            
        //For loop used to iterate through the array of Players.
        for (int i = 0; i < oplayer.length; i++){
            oplayer[i].displayPlayerInfo(); //Display output to the console using the driver.
            System.out.println(); // readability line
        }
        
        for (int i = 0; i < dplayers.length; i++){
            dplayers[i].displayPlayerInfo(); //Display output to the console using the driver.
            System.out.println(); // readability line
        }     
    }  
}


