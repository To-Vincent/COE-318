/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe318.lab6;

/**
 *
 * @author Vincent To
 */
public class Resistor {
//instance variables
public Node node1,node2;
public int resistorID;
public double resistance;
private static int resistorCount = 1;

public Resistor (double resistance, Node node1, Node node2){
//assigning instance to local
    this.node1 = node1;
    this.node2 = node2;
    this.resistance = resistance;
    this.resistorID = resistorCount;
    resistorCount++;

//implementing illegal argument exceptions
if ( resistance < 0 ) 
    {
        throw new IllegalArgumentException ("Resistor values can't be negative");
    }

if (node1 == null || node2 == null)
    {
        throw new IllegalArgumentException("Null Error: Nodes connecting to resistor must exist.");
    }
}

//accessing node methood and creating a 2D array
public Node[] getNode(){
        Node[] Nodes = {node1, node2};
return Nodes;
}

//implementing toString methood
@Override
public String toString(){
    return ("R" + resistorID + " " + node1 + " " + node2 + " " + resistance);
}

}
