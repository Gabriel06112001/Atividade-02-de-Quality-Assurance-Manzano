package exerciciosManzano;

import java.util.Scanner;

public class Exercicio1lManzano {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        int maiorValor = Integer.MIN_VALUE;
        int menorValor = Integer.MAX_VALUE;

        System.out.println("Digite valores inteiros positivos (digite um valor negativo para encerrar):");

        int valor;
        
        while (true) {
            System.out.print("Digite um valor: ");
            valor = sc.nextInt();

           
            if (valor < 0) {
                break;
            }

           
            if (valor > maiorValor) {
                maiorValor = valor;
            }

            if (valor < menorValor) {
                menorValor = valor;
            }
        }

       
        System.out.println("Maior valor informado: " + maiorValor);
        System.out.println("Menor valor informado: " + menorValor);

        sc.close();

	}

}
