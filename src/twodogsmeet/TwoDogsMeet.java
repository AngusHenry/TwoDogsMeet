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
        String fin ="";
        int dog1agg, dog2agg;
        String dog1Name = JOptionPane.showInputDialog(
      "What is the name of your dog?");
        
        String dog1Breed = JOptionPane.showInputDialog(
      "What is the breed of your dog?");
        
       Dog dog1 = new Dog (dog1Name, dog1Breed);
       
       dog1agg = dog1. getDagAgg();
       
       while (fin != "done"){
       String choice = JOptionPane.showInputDialog(
               dog1agg + " is the aggrresion\n"
              + "Is the aggression ok? \n"
              + "1: No recalculate\n"
              + "2: Yes, it is good"); 
       if (choice == "1"){
           dog1.setAggression();
       }
       else if (choice == "2"){
           fin = "done";
       }
       }
    }
    
}
