package exercicios;


import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nilson junior
 */
public class ArrayListCollection {
    
    
    
    public static void main(String[] args) {
        
        ArrayList <String> cores = new ArrayList <> ();
        
        
        cores.add("vermelho");
        cores.add("azul");
        cores.add("verde");
        cores.add("amarelo");
        cores.add("laranja");
        
        cores.remove("laranja");
        
        
        System.out.println(cores.toString()); //retorna o conteúdo total do array em forma de string
        System.out.println(cores.size()); //retorna o número de posições (índices) existentes no array 
        System.out.println(cores.get(2)); // retorna o conteúdo do índice indicado
        System.out.println("a cor é "+cores.indexOf("amarelo")); //retorna o índice do conteúdo indicado
        System.out.println(cores.contains("verde")); //faz uma pesquisa na coleção para saber se existe o índice indicado 
                                                     // retorna um valor booleano
        
    }
    
    
    
}
