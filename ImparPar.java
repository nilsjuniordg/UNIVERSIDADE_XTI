package exercicios;


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
public class ImparPar {
    
    
    
    public static void main(String[] args) {
        
        
        int num;
        
        Scanner input = new Scanner (System.in);
        
        System.out.println("digite o numero");
        num = input.nextInt();
     
        
        if ((num %2)==0)
        {
            System.out.println("este número é par " +num );   
            
        }
        
        
       
        else  {
            
            System.out.println("este número é impar " + num);
        
    }
        
    }
    
    
    
}
