/*
 * Angus Henry
 * 26/03/2019
 * This program will creating a meeting between two dogs.
 */

package twodogsmeet;

import javax.swing.JOptionPane;

/**
 *
 * @author anhen3335
 */
public class TwoDogsMeet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dog1agg, dog2agg, dog1hun, dog2hun;
        String dog1Name = JOptionPane.showInputDialog(
      "What is the name of your dog?");
        
        String dog1Breed = JOptionPane.showInputDialog(
      "What is the breed of your dog?");
        
       Dog dog1 = new Dog (dog1Name, dog1Breed);
       
       dog1agg = dog1. getDogAgg();
       
       dog1hun = dog1. getDogHun();
       
       for (int fin = 0; fin < 1;){
       String choice = JOptionPane.showInputDialog(
              dog1agg + " is the aggrresion of " + dog1Name + " the " + dog1Breed +"\n"
              + "Is the aggression ok? \n"
              + "1: No recalculate\n"
              + "2: Yes, it is good"); 
       if (choice.equals("1")){
          dog1agg =  dog1.getDogAgg();
       }
       else if (choice.equals("2")){
           fin = 1;
       }
       }
       
       for (int fin = 0; fin < 1;){
       String choice = JOptionPane.showInputDialog(
              dog1hun + " is the hunger of " + dog1Name + " the " + dog1Breed +"\n"
              + "Is the hunger ok? \n"
              + "1: No recalculate\n"
              + "2: Yes, it is good"); 
       if (choice.equals("1")){
          dog1hun =  dog1.getDogHun();
       }
       else if (choice.equals("2")){
           fin = 1;
       }
       }
      String dog2Name = JOptionPane.showInputDialog(
      "What is the name of your second dog?"); 
      
      String dog2Breed = JOptionPane.showInputDialog(
      "What is the breed of your second dog?");
      
      Dog dog2 = new Dog (dog2Name, dog2Breed);
      
      dog2agg = dog2. getDogAgg();
      
      dog2hun = dog1. getDogHun();
      
      for (int fin = 0; fin < 1;){
       String choice = JOptionPane.showInputDialog(
              dog2agg + " is the aggrresion of " + dog2Name + " the " + dog2Breed +"\n"
              + "Is the aggression ok? \n"
              + "1: No recalculate\n"
              + "2: Yes, it is good"); 
       if (choice.equals("1")){
          dog2agg =  dog2.getDogAgg();
       }
       else if (choice.equals("2")){
           fin = 1;
       }
       }
      
      for (int fin = 0; fin < 1;){
       String choice = JOptionPane.showInputDialog(
              dog2hun + " is the Hunger of " + dog2Name + " the " + dog2Breed +"\n"
              + "Is the hunger ok? \n"
              + "1: No recalculate\n"
              + "2: Yes, it is good"); 
       if (choice.equals("1")){
          dog2hun =  dog2.getDogHun();
       }
       else if (choice.equals("2")){
           fin = 1;
       }
       }
      
     System.out.println (dog1.toString());
     System.out.println (dog2.toString());
     System.out.println (dog1Name + " and " + dog2Name + " are meeting");
     int fin = 0;
     for ( ;fin < 1;){  
     if (dog1agg > 5){
         dog1.barkAngry();
     }
     else if (dog1agg <=5){
         dog1.barkFriendly();
     }
     if (dog2agg > 5){
        dog2.barkAngry();
     }
     else if (dog2agg <=5){
         dog2.barkFriendly();
     }
     
     if (dog1agg > dog2agg && dog1agg > 5){
         System.out.println (dog2Name + " has run away");
         fin = 1;
     }
     else if (dog2agg > dog1agg && dog2agg > 5){
         System.out.println (dog1Name + " has run away");
         fin =1;
     }
     else if(dog2agg == dog1agg && dog1agg > 5 && dog2agg > 5){
        System.out.println ("The dogs figth and die"); 
        fin =1; 
     }
     if (fin != 1){
     if (dog1hun > 5){
         dog1.dogGrumble();
     }
     else {
         dog1.dogsatisfied();
     }
     if (dog2hun > 5){
         dog2.dogGrumble();
     }
     else {
         dog2.dogsatisfied();
     }
       if (dog1hun > dog2hun && dog1hun > 5){
         System.out.println (dog2Name + "  has a greater desire for the food and has eaten the food");
         fin =1;
     }
     else if (dog2hun > dog1hun && dog2hun > 5){
         System.out.println (dog1Name + "has a greater desire for the food and has eaten the food");
         fin =1;
     }
     else if (dog2hun == dog1hun && dog2hun > 5 && dog1hun > 5){
        System.out.println ("they share the food"); 
        fin =1;
     }
       System.out.println (dog1Name + " and " + dog2Name + " are friends");    
     }
    
     
    }
    }
    
}
