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
public class Node {
//instance variables    
private int node;
private static int numNode = 0;

public Node(){
//assigning instance to local
    this.node = numNode;
    numNode++;
}

//implementing toString methood
@Override
public String toString(){
    return("" + this.node);
}
}
