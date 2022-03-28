import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*Faça um programa que receba a temperatura média os 6 primeiros meses do ano e armazene-as em uma lista.
Após isto, calcule a média semestral das temperaturas e mostre todas as temperaturas acima desta média,
e em que mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2 – Fevereiro e etc).
*/

public class ListTemperaturaMediaMes {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<Double> temperaturasSemestral = new ArrayList<Double>();
		
		double soma = 0.0;
		for (int i = 1; i <= 6; i++) {
			System.out.print("Temperatura do mês " + i + ": ");
			double temp = sc.nextDouble();
			temperaturasSemestral.add(temp);
			soma += temp;
		}
		
		double mediaTemperaturasSemenstral = soma / temperaturasSemestral.size();
		System.out.println("Temperaturas: " + temperaturasSemestral);
		System.out.print("Média temperaturas:" + mediaTemperaturasSemenstral +" ºC " );
		System.out.println();
		
		
		for (Double temp : temperaturasSemestral) {
			if (temp > mediaTemperaturasSemenstral) {
				int index = temperaturasSemestral.indexOf(temp);
				switch (index) {
				case 0:
					System.out.println((index + 1) + " - JANEIRO: " + temp + " ºC");
					break;
				case 1:
					System.out.println((index + 1) + " - FEVEREIRO: " + temp + " ºC");
					break;
				case 2:
					System.out.println((index + 1) + " - MARÇO: " + temp + " ºC");
					break;
				case 3:
					System.out.println((index + 1) + " - ABRIL: " + temp + " ºC");
					break;
				case 4:
					System.out.println((index + 1) + " - MAIO: " + temp + " ºC");
					break;
				case 5:
					System.out.println((index + 1) + " - JUNHO: " + temp + " ºC");
					break;
				default:
					break;
				}
			}
		}
	}
}