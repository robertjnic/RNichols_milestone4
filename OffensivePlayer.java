/** 
 * Program: NFL Player Program
 * File: OffensivePlayer.java 
 * Summary: The OffensivePlayer program displays a player and 10 player attributes including offensive specific attributes.
 * Author: Robert J Nichols
 * Date: 11/04/2017
 **/ 
public class OffensivePlayer extends Player //Inherits from Player Class
{
    private String position;
    private String statName;
    private int statNum; 
    
    public OffensivePlayer(){}
    
    public OffensivePlayer(String firstNameIn, String lastNameIn, int ageIn , int numIn, 
            String collegeIn, String experienceIn, String teamIn, String positionIn,
            String statNameIn, int statNumIn, boolean isAvailableIn)
    {
        super(firstNameIn, lastNameIn, ageIn , numIn, collegeIn, experienceIn, teamIn, isAvailableIn);
        this.position = positionIn;
        this.statName = statNameIn;
        this.statNum = statNumIn;
    }
    
    public void setPosition(String positionIn)
    {
        this.position = positionIn;
    }
    
    public String getPosition()
    {
        return position;
    }
    
    public void setStatName(String statNameIn)
    {
        this.statName = statNameIn;
    }
    
    public String getStatName()
    {
        return statName;
    }
    
    public void setStatNum(int statNumIn)
    {
        this.statNum = statNumIn;
    }
    
    public int getStatNum()
    {
        return statNum;
    }

    @Override
    public void displayPlayerInfo(){ //override player class display info
    //Displays Player info to the console.
    System.out.println("First Name: " + getFirstName());
    System.out.println("Last Name: " + getLastName());
    System.out.println("Age: " + String.valueOf(getAge()));
    System.out.println("Jersey number: " + String.valueOf(getNumber()));
    System.out.println("College: " + getCollege());
    System.out.println("Experience: " + getExp());
    System.out.println("Team: " + getTeam());
    System.out.println("Position: " + getPosition());
    System.out.print(getStatName()+": ");
    System.out.println(getStatNum());
    System.out.println("Available? " + getAvailable());
    } // end displayPlayerInfo method.
    
}
