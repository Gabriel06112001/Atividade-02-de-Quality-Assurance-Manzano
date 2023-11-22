/*Apresentar os resultados das potências de 3, variando do expoente 0 até o expoente 15. Deve ser 
considerado que qualquer número elevado a zero é 1, e elevado a 1 é ele próprio. Observe que 
neste exercício não pode ser utilizado o operador de exponenciação do portuguol (^).*/

package exerciciosManzano;

public class Exercicio1eManzano {

	public static void main(String[] args) {
		
		int expoente =0;
		
		while (expoente <= 15) {
            long resultado = calcularPotenciaDeTres(expoente);
            System.out.println("3^" + expoente + " = " + resultado);
            expoente++;
        }

	}

    private static long calcularPotenciaDeTres(int expoente) {
        long resultado = 1;

        int contador = 0;
        while (contador < expoente) {
            resultado *= 3;
            contador++;
        }

        return resultado;
    }

}
