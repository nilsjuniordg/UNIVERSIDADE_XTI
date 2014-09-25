package exercicios;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.util.Scanner;

/**
 *
 * @author nilson junior
 */
public class Imc {
    
    
    public static void main(String[] args) {
        
        
        
        
        Scanner input = new Scanner (System.in);
        String nome;
        double imc,peso,altura;
        
        
        
        System.out.println("qual é o seu nome?");
        nome= input.nextLine();
        
        System.out.println("bem vindo "+ nome);
        
        System.out.println("Qual é o seu peso?");
        peso = input.nextDouble();
        
        System.out.println("Qual é a sua altura?");
        altura = input.nextDouble();
        
        imc = peso / (altura* altura);
        
        System.out.println("imc = "+ imc);
        
        if (imc >= 18.5 && imc<= 24.9){
            
            System.out.println("peso ideal");
        } 
        
        else if (imc < 16){
            
            System.out.println("baixo peso severo ");
        } 
     
        else if (imc >= 16 && imc<= 16.9){
            
            System.out.println("baixo peso moderado");
        } 
    
        else if (imc >= 17 && imc<= 18.49){
            
            System.out.println("baixo peso leve");
           
        } 
        
        
        
        else if (imc > 25){
            
            System.out.println("sobrepeso");
        } 
        
        else if (imc >= 25 && imc <= 29.9){
            
            System.out.println("pré-obesidade");
        } 
        
        else  if (imc >= 30 && imc<= 34.9){
            
            System.out.println("obesidade moderada");
        } 
        
        
        else if (imc >= 35 && imc<= 39.9){
            
            System.out.println("obesidade alta");
        } 
        
         if (imc >= 40){
            
            System.out.println("obesidade muito alta");
        } 
        
        
    }
    
    
    
    
    
    
    
}
