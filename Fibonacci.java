/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exercicios;

/**
 *
 * @author nilson junior
 */
public class Fibonacci {
    
    
    public static void main(String[] args) {
        
        
        int anterior = 1;
        int proximo = 2;
        
        System.out.println(anterior);
       
        
        while (proximo < 1000){
        
        System.out.println(proximo);
        
        proximo = proximo + anterior;
        anterior = proximo - anterior;
        
        }
        
    }
    
    
    
    
}
