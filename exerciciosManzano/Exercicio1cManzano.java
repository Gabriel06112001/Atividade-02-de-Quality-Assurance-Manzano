//Elaborar um programa que apresente no final o somatório dos valores pares existentes na faixa de 
//1 até 500. 

package exerciciosManzano;

public class Exercicio1cManzano {

	public static void main(String[] args) {
		
		int soma=0;
		int contadora=1;
		
		while (contadora<501) {
			if (contadora%2==0) {
				soma+=contadora;
			}
			contadora++;
		}
		System.out.println("A soma dos valores pares existentes na faixa de 1 até 500 é: "+soma);
		

	}

}
