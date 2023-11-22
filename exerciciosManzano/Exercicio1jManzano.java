package exerciciosManzano;

import java.util.Scanner;

public class Exercicio1jManzano {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        int inicioFaixa = 50;
        int fimFaixa = 70;
        int soma = 0;
        int contador = 0;

        System.out.println("Valores pares na faixa de " + inicioFaixa + " a " + fimFaixa + ":");

        
        int numeroAtual = inicioFaixa;
        while (numeroAtual <= fimFaixa) {
            
            if (numeroAtual % 2 == 0) {
                System.out.print(numeroAtual + " ");
                soma += numeroAtual;
                contador++;
            }

           
            numeroAtual++;
        }

        
        double mediaAritmetica = contador > 0 ? (double) soma / contador : 0;

      
        System.out.println("\nSoma dos valores pares: " + soma);
        System.out.println("Média aritmética dos valores pares: " + mediaAritmetica);

        sc.close();

	}

}
