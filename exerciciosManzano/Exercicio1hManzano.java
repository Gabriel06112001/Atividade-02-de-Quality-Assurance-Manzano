package exerciciosManzano;

public class Exercicio1hManzano {

	public static void main(String[] args) {
		
		int temperaturaCelsius = 10;

        System.out.println("Temperaturas convertidas de Celsius para Fahrenheit:");

        while (temperaturaCelsius <= 100) {
           
            double temperaturaFahrenheit = (temperaturaCelsius * 9.0 / 5.0) + 32;

           
            System.out.println(temperaturaCelsius + "°C = " + temperaturaFahrenheit + "°F");

          
            temperaturaCelsius += 10;

	}

}
}