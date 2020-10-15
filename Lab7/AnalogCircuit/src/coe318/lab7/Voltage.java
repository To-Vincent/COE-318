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
public class Voltage extends Circuit{
    //variables
    private double voltageV;
    public int voltageID;
    private Node first;
    private Node second;
    public static int count = 1; //start counter at 1
    
    //creating node objects
    public Voltage (Node one, Node two, double value){
        //error checking
        if(one.IDNode < 0 || two.IDNode < 0) 
        {
            throw new IllegalArgumentException("Node ID values must be positive"); //warning   
        } 
        else if(one == null || two == null || one == two) 
        {
            throw new IllegalArgumentException("All nodes must be connected for the circuit to exist"); //some warnings
        } 
         
        //passed error check, assign values
        else 
        {
            voltageV = value;
            voltageID = count;
            first = one;
            second = two; 
            count++; 
        }         
    }
    
    //negaitve voltage input check
    public boolean checkNegative(){
        if(this.voltageV<0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    //obtain voltage ID
    public int getV_ID(){
        return this.voltageID;
    }
    
    //obtain voltage value
    public double getV(){
        return this.voltageV;
    }
    
    //toString methood for voltage
    @Override
    public String toString(){
        //when voltage is negative
        if(this.checkNegative() == true)
        {
            return("V" + this.voltageID + " " + this.second + " " + this.first + " DC " + (-(this.voltageV)));
        }
        //when voltage is positive
        else
        {
            return ("V" + this.voltageID + " " + this.first + " " + this.second + " DC " + this.voltageV);
        }
    }   
}