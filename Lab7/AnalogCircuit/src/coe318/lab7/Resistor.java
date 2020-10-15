/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe318.lab7;

/**
 *
 * @author Vincent To
 */
public class Resistor extends Circuit {
    //variables
    private Node n1;
    private Node n2;
    private double value;
    public int ResistorID;
    public static int n = 1;
    
    public Resistor ( Node nA, Node nB, double v){ 
        //error checking cases
        if(v < 0) 
        {
            throw new IllegalArgumentException("Resistance must be positive values." );
        } 
        
        else if(nA.IDNode < 0 || nB.IDNode < 0) 
        { 
            throw new IllegalArgumentException("Node ID value does not exist, must be a positive value.");
        }
        
        else if(nA == null || nB == null || nA == nB) 
        {
            throw new IllegalArgumentException("Node inputs are incorrect, please try again."); 
        } 

        //error checking passes, assign values
        else 
        {
        n1 = nA; 
        n2 = nB;
        value = v;
        ResistorID = n;
        n++;
        }
    }
       
    //obtains resistor ID
    public int getResID(){
        return this.ResistorID;
    }
    
    //obtains resistance value
    public double getResistance(){
        return value;   
    }
    
    //creating node array
    public Node [] getNode(){ 
        Node[] n = new Node[2];
        n[0] = n1;
        n[1] = n2;
        return n; 
    }
    
    //toString methood for Resistor
    @Override
    public String toString(){
        return ("R" + this.ResistorID + " " + this.n1 + " " + this.n2 + " " + this.value);
    } 
}

