/*Elaborar um programa que possibilite calcular a área total de uma residência (sala, cozinha, 
banheiro, quartos, área de serviço, quintal, garagem, etc.). O programa deve solicitar a entrada do 
nome, a largura e o comprimento de um determinado cômodo. Em seguida, deve apresentar a área do cômodo lido e também uma mensagem solicitando do usuário a confirmação de continuar 
calculando novos cômodos. Caso o usuário responda “NAO”, o programa deve apresentar o valor 
total acumulado da área residencial.*/


package exerciciosManzano;

import java.util.Scanner;

public class Exercicio1kManzano {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        double areaTotal = 0;
        String respostaUsuario;

        
        while (true) {
            System.out.print("Digite o nome do cômodo: ");
            String nomeComodo = sc.next();

            System.out.print("Digite a largura do cômodo: ");
            double largura = sc.nextDouble();

            System.out.print("Digite o comprimento do cômodo: ");
            double comprimento = sc.nextDouble();

            
            double areaComodo = largura * comprimento;

            
            areaTotal += areaComodo;

           
            System.out.println("Área do " + nomeComodo + ": " + areaComodo + " metros quadrados");
            System.out.println("Área total acumulada: " + areaTotal + " metros quadrados");

            
            System.out.print("Deseja calcular outro cômodo? (SIM/NAO): ");
            respostaUsuario = sc.next();

           
            if (respostaUsuario.equalsIgnoreCase("NAO")) {
                break;
            }
        }
		
        System.out.println("Área total da residência: " + areaTotal + " metros quadrados");

        sc.close();

	}

}
