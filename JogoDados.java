package exercicios;


import java.util.Random;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nilson junior
 */
public class JogoDados {
    
    
    
    
    public static void main(String[] args) {
        
        
       
        
        
        Scanner input = new Scanner (System.in);
        
        System.out.println("qual é o seu palpite? ");
        int palpite = input.nextInt();
        
        System.out.println("palpite : " + palpite);
        
        
        Random r = new Random();
        int dado = r.nextInt(6)+1;
        
        System.out.println("dado : " + dado);
        
        
        if (palpite == dado)
        {
            System.out.println("VOCÊ ACERTOU!");    
        }
        
        else
        {
            System.out.println("VOCÊ ERROU! ");    
        }
    }
    
    
}
