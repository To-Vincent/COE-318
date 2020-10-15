/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe318.lab7;
//importing utilities
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author Vincent To
 */
public class UserMain implements CircuitInterface{
   //array creation
    private ArrayList<Circuit> circuit = new ArrayList<>();
 
   //scanner object created
   Scanner in = new Scanner(System.in);
   
   @Override
    public void s(){
        display();
        cRun();
    }

      @Override
       public void cRun(){
           boolean r = true;
           while(r)
           {
               String userIn = in.nextLine(); 
               //creating end command
                if(userIn.equalsIgnoreCase("end"))
                {
                   end();
                   break;
                }
               
               //creating spice command
                else if(userIn.equalsIgnoreCase("spice"))
                {
                   spice();
                }
               
                //accepting voltage input from user
                else if(userIn.startsWith("v")|| userIn.startsWith("V"))
                { 
                   String delim ="[ ]+";
                   String[] ln = userIn.split(delim);
                   
                   Node n0 = new Node();
                   n0.IDNode = Integer.parseInt(ln[1]);
                   
                   Node nA = new Node();
                   nA.IDNode = Integer.parseInt(ln[2]);
                   
                   Double val = Double.parseDouble(ln[3]);
                   Voltage vv = new Voltage( n0,nA,val);
                   circuit.add(vv);
                }   
                
                //accepting resistance input from user
                else if(userIn.startsWith("r")||userIn.startsWith("R"))
                { 
                   String delim = "[ ]+";
                   String[] ln = userIn.split(delim);
                   
                   Node n1 = new Node();
                   n1.IDNode=Integer.parseInt(ln[1]);
                   
                   Node n2 = new Node();
                   n2.IDNode = Integer.parseInt(ln[2]);
                   
                   Double value = Double.parseDouble(ln[3]);
                   Resistor res = new Resistor( n1,n2,value);
                   circuit.add(res);
                }
               
               //error output if format is incorrect
               else
                {
                   System.out.println("Error: Please make sure your input format is correct.");
                }
           }
       }
       
       //creating instruction display for user
       @Override
       public void display(){
           System.out.println("SIMPLE RESISTIVE CIRCUIT INSTRUCTIONS"); 
           System.out.println("-----------------------------------------------------------------------------------------------"); 
           System.out.println("Enter Resistance and Voltage values seprating each value by spaces (ex. r 3 4 0.5 or v 5 2 2.6)"); 
           System.out.println("There must be 3 arguments made per input."); 
           System.out.println("First two inputs are node locations, thrid input is value of resistance or voltage."); 
           System.out.println("Negative voltage values will yeild nodes to be flipped.");
           System.out.println("Typing 'spice' will run the program, Typing 'end' will end the instance.");
           System.out.println("-----------------------------------------------------------------------------------------------\n"); 
       }
       
       //end input recieved
       @Override 
       public void end(){ 
           System.out.println("All Done.");
       }
       
       //spice input recieved
       @Override
       public void spice(){ 
           for(Circuit c: circuit){
               System.out.println(c);
           }
       }
       
    public static void main(String args[]){
        UserMain circus= new UserMain();
        circus.s();
    }
}
