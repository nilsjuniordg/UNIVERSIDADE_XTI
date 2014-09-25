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
public class Array {

    public static void main(String[] args) {

        // DUAS FORMAS DE INICIALIZAR UM ARRAY
        // ARRAY DE TIPOS PRIMITIVOS
        String[] paises = {"brasil", "russia", "india", "china"};

        System.out.println(paises[2]);
        paises[1] = "RUSSIA";
        System.out.println(paises[1]);

        
        // ARRAY DE VARIÁVEIS DE REFERENCIAS
        int[] impares = new int[5];
        impares[0] = 1;
        impares[1] = 2;
        impares[2] = 3;
        impares[3] = 4;
        impares[4] = 5;

        System.out.println(impares[3]); //imprime o conteúdo da posição indicada
        System.out.println(impares.length); // exibe o número de posições no array
        System.out.println(Arrays.toString(paises)); //exibe todo o conteúdo do array

        int posicao = Arrays.binarySearch(impares, 3); //realiza uma pesquisa dentro do array
        System.out.println(posicao);

        Arrays.sort(paises, 0, paises.length);// ordena o conteúdo do array de 0 ao final
        System.out.println(Arrays.toString(paises));

    }

}
