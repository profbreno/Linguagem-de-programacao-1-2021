package Arrays;

import java.text.DecimalFormat;
import java.util.Scanner;

/* Faça um programa para ler o preço de um produto em cada um dos meses do
 * ano e depois imprimir a média do valor do produto no ano.
 */

public class Exemplo3_25_08_2021 {

	public static void main(String[] args) {
		
		double[] precos = new double[12];
		Scanner leitor = new Scanner(System.in);
		
		for(int i = 0; i < precos.length; i++) {
			System.out.println("Digite o preço do produto no mês " + (i+1) + ": ");
			precos[i] = leitor.nextDouble();
		}
		
		double somaValores = 0;
		for(int i = 0; i < precos.length; i++) {
			//somaValores = somaValores + precos[i];
			somaValores += precos[i];
		}
		
		double mediaPrecos = somaValores / precos.length;
		
		System.out.println("A média de preços é igual a R$ " 
							+ new DecimalFormat(".##").format(mediaPrecos));
		
	}
	
	//[30, 18 , 5 , 38]
	// Ordenado: [5, 18, 30, 38]
	
}
