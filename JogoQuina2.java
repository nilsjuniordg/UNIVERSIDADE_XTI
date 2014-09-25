package exercicios;


import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nilson junior
 */
public class JogoQuina2 {
    
    
    public static void main(String[] args) {
        
        
        Random r1 = new Random();
        int seq1 = r1.nextInt(80);
        
        Random r2 = new Random();
        int seq2 = r2.nextInt(80);
        
        Random r3 = new Random();
        int seq3 = r3.nextInt(80);
        
        Random r4 = new Random();
        int seq4 = r4.nextInt(80);
        
        Random r5 = new Random();
        int seq5 = r5.nextInt(80);
        
        
        
        
        
        
        
        System.out.println("sequência quina: " + seq1 + " " + seq2 + " " + seq3 + " " + seq4 + " " + seq5 );
        
        
        
        
        
    }
    
    
}
