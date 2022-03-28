import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*Fa�a um programa que receba a temperatura m�dia os 6 primeiros meses do ano e armazene-as em uma lista.
Ap�s isto, calcule a m�dia semestral das temperaturas e mostre todas as temperaturas acima desta m�dia,
e em que m�s elas ocorreram (mostrar o m�s por extenso: 1 � Janeiro, 2 � Fevereiro e etc).
*/

public class ListTemperaturaMediaMes {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<Double> temperaturasSemestral = new ArrayList<Double>();
		
		double soma = 0.0;
		for (int i = 1; i <= 6; i++) {
			System.out.print("Temperatura do m�s " + i + ": ");
			double temp = sc.nextDouble();
			temperaturasSemestral.add(temp);
			soma += temp;
		}
		
		double mediaTemperaturasSemenstral = soma / temperaturasSemestral.size();
		System.out.println("Temperaturas: " + temperaturasSemestral);
		System.out.print("M�dia temperaturas:" + mediaTemperaturasSemenstral +" �C " );
		System.out.println();
		
		
		for (Double temp : temperaturasSemestral) {
			if (temp > mediaTemperaturasSemenstral) {
				int index = temperaturasSemestral.indexOf(temp);
				switch (index) {
				case 0:
					System.out.println((index + 1) + " - JANEIRO: " + temp + " �C");
					break;
				case 1:
					System.out.println((index + 1) + " - FEVEREIRO: " + temp + " �C");
					break;
				case 2:
					System.out.println((index + 1) + " - MAR�O: " + temp + " �C");
					break;
				case 3:
					System.out.println((index + 1) + " - ABRIL: " + temp + " �C");
					break;
				case 4:
					System.out.println((index + 1) + " - MAIO: " + temp + " �C");
					break;
				case 5:
					System.out.println((index + 1) + " - JUNHO: " + temp + " �C");
					break;
				default:
					break;
				}
			}
		}
	}
}