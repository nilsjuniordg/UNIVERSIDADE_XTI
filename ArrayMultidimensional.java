package exercicios;


import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nilson junior
 */
public class ArrayMultidimensional {
    
    
    public static void main(String[] args) {
        
        String [] uma = {"Ricardo", "Alexandre"};
        System.out.println(uma[1]);
        
        
        String [][]duas = 
        {
        
            {"Ricardo", "masculino", "33 anos"},
            {"Alexandre", "masculino", "44anos"}
        
        };
        
        duas [0][2] = "alterado";
        System.out.println(duas[1][2]);
        
        
}

}
        
        
