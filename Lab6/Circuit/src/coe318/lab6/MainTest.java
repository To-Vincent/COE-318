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
public class MainTest {
    public static void main (String[] args){
        Circuit cct = Circuit.getInstance();
        
        Node A = new Node();
        Node B = new Node();
        Node C = new Node();
        
        System.out.println("Node counter");
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
        
        Resistor R1 = new Resistor (120.0, A, B);
        Resistor R2 = new Resistor (400.0, A, C);
        
        System.out.println("\n" + "Resistor values at node locations");
        System.out.println(R1);
        System.out.println(R2);
        
        System.out.println("\n" + "Showing circuit elements");
        cct.add(R1);
        cct.add(R2);
        System.out.println(cct);
    }
}
