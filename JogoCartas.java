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
public class JogoCartas {

    public static void main(String[] args) {

        String[] faces = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "VALETE", "DAMAS", "REIS",};
        String[] nipes = {"ESPADAS", "PAUS", "COPAS", "OUROS",};
        
        
        Random r = new Random();
        
        int indiceFaces = r.nextInt(faces.length);
        String face = faces[indiceFaces];
        
        
        int indiceNipes = r.nextInt(nipes.length);
        String nipe = nipes[indiceNipes];
        
        

        System.out.println(face + " " + nipe);
        

        
        
        
    }

}
