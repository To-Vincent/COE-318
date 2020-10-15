/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe318.lab6;
import java.util.ArrayList;

/**
 *
 * @author Vincent To
 */
public class Circuit {
//creating arraylist and setting circuit instance to null
private static Circuit instance = null;
ArrayList <Resistor> resistor;

//creating instance
public static Circuit getInstance(){
    if (instance == null)
    {
        instance = new Circuit();
    }
    return instance;
}

//assigning arraylist instance to local
private Circuit (){
    this.resistor = new ArrayList <Resistor> ();
}

//assigning resistor into arraylist
public void add(Resistor r){
    this.resistor.add(r);
}

//implementing toString methood
@Override
public String toString (){
    String Circuit = new String();
    
    for (int i = 0; i < this.resistor.size(); i++){
        Circuit += this.resistor.get(i).toString() + "\n";
    }
    return (Circuit);
}

}
