/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package twodogsmeet;

/**
 *
 * @author anhen3335
 */
public class Dog {
  //variables for characteristics

  private String dogName, dogBreed;
  private int aggression, hunger;

  //constructors
  public Dog() {
    dogName = "Rufus Doe";
    dogBreed = "Unknown Breed";
    aggression = 0;
    hunger = 0;
  }
/**
 * 
 * @param dgName
 * @param dgBreed
 * @param agg
 * @param hung 
 */
  public Dog(String dgName, String dgBreed, int agg, int hung) {
    dogName = dgName;
    dogBreed = dgBreed;
    aggression = agg;
    hunger = hung;
  }

  //Alternate constructor
  /**
   * 
   * @param dgName
   * @param dgBreed 
   */
  public Dog(String dgName, String dgBreed) {
    //This constructor only uses the name and breed
    //Set the aggression and hunger to random #s

    dogName = dgName;
    dogBreed = dgBreed;
    aggression = (int) (Math.random() * 10) + 1;
    hunger = (int) (Math.random() * 10) + 1;
  }
  // here be the methods that do the work
  /**
   * sets dogName
   * @param dgName 
   */
  public void setDogName (String dgName){
      dogName = dgName;
  }
  /**
   * sets the aggression level
   * @param agg 
   */
  public void setAggression (){
      aggression = (int) (Math.random() * 10) + 1;;
  }
  /**
   * this will get the dogs name
   * @return dogName 
   */
  public int getDagAgg(){
    return aggression;
}
/**
 * This method prints out the friendly barking
 */
  public void barkFriendly() {
    System.out.println("Arf! Arf!");
  }
/**
 * This method prints out the angry barking
  */
  public void barkAngry() {
    System.out.println("GRR! RRRFFF!");
  }

  //method to display all info of the Dog
  public String toString() {
    String output = "Name: " + dogName + "\n";
    output += "Breed: " + dogBreed + "\n";
    output += "Aggression: " + aggression + "\n";
    output += "Hunger: " + hunger;
    //output string is complete, return it
    return output;
  }  
}
