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
public class Node {
    //variables
    public static int Nnum; 
    public int IDNode; 
    
    //assigning node IDs
    public Node(){
        IDNode = Nnum;
        Nnum++;
    }

    //toString methood for Node
    @Override
    public String toString(){
        return (" " + this.IDNode);
        
    }
}

