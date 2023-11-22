//Apresentar o total da soma obtida dos cem primeiros números inteiros (1+2+3+4+...+98+99+100).

package exerciciosManzano;


public class Exercicio1bManzano {

	public static void main(String[] args) {
		
		
		int soma=0;
		int contadora=1;
		
		while (contadora<101) {
			
			soma+=contadora;
			contadora++;
		}
		System.out.println("A soma dos cem primeiros números inteiros é: "+soma);
		

	}

}
