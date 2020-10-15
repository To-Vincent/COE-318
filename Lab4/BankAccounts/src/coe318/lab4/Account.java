/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe318.lab4;

/**
 *
 * @author Vincent To
 */
public class Account {
    //instance variables
    String clientName;
    double balance;
    int acntNum;
   
    //constructor
    public Account (String name, int number, double intialBalance)
    {
        clientName = name;
        balance = intialBalance;
        acntNum = number;
    }
    
    //getters
    public int getNumber()
    {
        return acntNum;
    }
    
    public double getBalance ()
    {
        return balance;
    }
    
    public String getName()
    {
        return clientName;
    }
    
    //deposit methood
    boolean deposit (double amount)
    {
        if (amount <= 0)
        {
            return false;
        }
        else 
        {
            balance = balance + amount;
            return true;
        }
    }
    
    //withdraw methood
    boolean withdraw(double amount)
    {
        if (balance < amount || amount <= 0)
        {
            return false;
        }
        else
        {
            balance = balance - amount;
            return true;
        }
    }
    
    //toString() code
    @Override
    public String toString() {//DO NOT MODIFY
        return "(" + getName() + ", " + getNumber() + ", " +
                String.format("$%.2f", getBalance()) + ")";}
    
}
