//Apresentar os resultados de uma tabuada de multiplicar (de 1 até 10) de um número qualquer.

package exerciciosManzano;

import java.util.Scanner;

public class Exercicio1aManzano {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro para ser multiplicado na tabuada: ");
		int numero = sc.nextInt();
		sc.close();
		
		
		int contadora =1;
		
		
		while (contadora<11) {
			System.out.println(contadora + "X" + numero + "=" + contadora*numero);
			contadora++;
			
		}
		

	}

}
