/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.assignment4;
import java.util.LinkedList;
import java.util.Queue;


/**
 *
 * @author Alice
 */
public class QueueMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 
        Queue<String> line = new LinkedList <String>();
        
        line.add("ALice");
        line.add("Oppong");
        line.add("Geovanni");
        line.add("Afram");
        line.add("Yvette");
        line.add("Dominic");
        
        //line.poll();
       // line.peek();
        //line.size();
        
        //System.out.println(line.toArray()[1]);
        System.out.println(line.toArray()[5]);
    }
    
}
