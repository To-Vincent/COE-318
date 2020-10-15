/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe318.lab5;

/**
 *
 * @author Vincent To
 */
import java.util.Scanner;

public class SimpleUI implements UserInterface {
    private Scanner user = new Scanner(System.in);
    private BlackjackGame inst;

  @Override
    public void setGame(BlackjackGame game) {
        inst = game;
    }

 @Override
 //general display structure
    public void display() {
      //FIX THIS
      System.out.println("House Cards:");
      System.out.println("" + inst.getHouseCards());
      System.out.println("");
      System.out.println("Your Cards:");
      System.out.println("" + inst.getYourCards());
      System.out.println("______________________________");

    }

  @Override
  //option input
    public boolean hitMe() {
        String answer = ("nothing");
        
        System.out.println("Your current value is " + inst.score(inst.getYourCards()));
        System.out.println("Would you like to hit? (yes/no)");
        if (inst.score(inst.getYourCards()) >= 21)
        {
            return false;
        }
        answer = user.nextLine();
        
        if(!answer.equals("no") && inst.score(inst.getYourCards()) <= 21)
        {
            return true;
        }
        return false;
    }

  @Override
  //result pane
    public void gameOver() {
        System.out.println("______________________________");
        System.out.println("FINAL RESULTS");
        display();
        System.out.println("Your final value is " + inst.score(inst.getYourCards()));
        System.out.println("House final value is " + inst.score(inst.getHouseCards()));
        System.out.println();
        
        //win conditions
        if (inst.score(inst.getYourCards()) > 21)
        {
            System.out.println("BUST! You lose");
        } 
        
        else if(inst.score(inst.getYourCards())== inst.score(inst.getHouseCards()))
        {
            System.out.println("Tied, The House wins");
        }
        
        if (inst.score(inst.getYourCards()) < 21 && inst.score(inst.getHouseCards()) > 21)
        {
            System.out.println("House Bust, You win!");
        } 
        
        else if(inst.score(inst.getYourCards())<=21 && inst.score(inst.getHouseCards())<=21)
        {
            if (inst.score(inst.getYourCards())>= inst.score(inst.getHouseCards()))
            {
                System.out.println("You win!");
            } 
        
            else 
            {
                System.out.println("The House wins");
            } 
        }
}
}
