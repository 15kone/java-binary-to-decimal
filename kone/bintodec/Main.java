/*
  This program will take a string of 8 binary characters, and convert them
   into a decimal number.
   
   Made By 15kone
 */

package kone.bintodec;

import java.util.Scanner;

public class Main {
  
  public static void main(String[] args) {
    
    //    Create scanner
    Scanner in = new Scanner(System.in);
    
    //    Prompt the user for input
    System.out.print("Enter at most 8 0's and 1's in a random combination, " +
                     "and have it converted into a decimal number or type " +
                     "'exit' to quit the program: ");
    
    //    Infinite loop, so that the program only enters when prompted to.
    while (true) {
      
      //      Take user input
      String binary = in.nextLine();
      /*
            Check if the input length is less than 8, and if it's greater,
            throw error and prompt input again
      */
      if (binary.length() > 8) {
        System.out.println("Enter at most 8 characters, please: ");
        //        Check if input equals "exit", if it does, exit the program
      } else if (binary.equals("exit")) {
        System.out.println("You chose to exit the program.");
        break;
        /*
                Check if the string contains only 0's and 1's, if it does, do the
                conversion and print it out
        */
      } else if (binary.matches("[01]+")) {
        int decimal = Integer.parseInt(binary, 2);
        System.out.println("The decimal value of " + binary + " is: " + decimal);
        System.out.println("Try another number, or type 'exit' to quit. ");
      } else {
        /*
                If the user enters something else than 0's and 1's, throw this
                error, and prompt input again.
        */
        System.out.println("Enter only 0's and 1's, please: ");
      }
    }
    
  }
  
  
}