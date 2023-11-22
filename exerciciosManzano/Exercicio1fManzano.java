/*Elaborar um programa que apresente como resultado o valor de uma potência de uma base 
qualquer elevada a um expoente qualquer, ou seja, de BE
, em que B é o valor da base e E o valor 
do expoente. Observe que neste exercício não pode ser utilizado o operador de exponenciação do 
portuguol (^). */

package exerciciosManzano;

import java.util.Scanner;

public class Exercicio1fManzano {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        
        System.out.print("Digite o valor da base (B): ");
        int base = sc.nextInt();

        
        System.out.print("Digite o valor do expoente (E): ");
        int expoente = sc.nextInt();

        sc.close();
        
        long resultado = calcularPotencia(base, expoente);

        System.out.println(base + "^" + expoente + " = " + resultado);

	}
	
    private static long calcularPotencia(int base, int expoente) {
        long resultado = 1;

        int contador = 0;
        while (contador < expoente) {
            resultado *= base;
            contador++;
        }

        return resultado;
    }

}
