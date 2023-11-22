/*Elaborar um programa que efetue a leitura de 10 valores numéricos e apresente no final o total do 
somatório e a média aritmética dos valores lidos.*/


package exerciciosManzano;

import java.util.Scanner;

public class Exercicio1iManzano {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int totalSomatorio = 0;
        int quantidadeValores = 10;
        int i = 1;

        System.out.println("Digite 10 valores numéricos:");

        
        while (i <= quantidadeValores) {
            System.out.print("Digite o valor #" + i + ": ");
            int valor = sc.nextInt();
            
            
            totalSomatorio += valor;

            i++;
        }
        double mediaAritmetica = (double) totalSomatorio / quantidadeValores;

        
        System.out.println("Total do somatório: " + totalSomatorio);
        System.out.println("Média aritmética: " + mediaAritmetica);

        sc.close();
	}

}
