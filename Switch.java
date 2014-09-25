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
public class Switch {

    public static void main(String[] args) {
        
        
        
        // O SWITCH É DIFERENTE DO IF POIS NÃO REALIZA TESTES, APENAS COMPARA COM O PARÂMETRO INDICADO.
        // O DEFAULT FUNCIONA COMO O ELSE
        // E O BREAK PARA PARAR QUANDO O VALOR FOR ENCONTRADO
        String tecnologia;

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o nome da tecnologia");
        tecnologia = input.nextLine();

        switch (tecnologia) {
            case "java":
            case "c#":
            case "ruby":

                System.out.println("isto é uma linguagenm de programação");

                break;

            case "postgrid":
            case "sql":
            case "oracle":
                
                System.out.println("banco de dados");

                break;

            case "indesign":
            case "illustrator":
            case "coreldraw":
                
                System.out.println("isto é um programa gráfico");

                break;
                
            default:
                System.out.println("isto não é tecnologia");
                

        }

    }

}
