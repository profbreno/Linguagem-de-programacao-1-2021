package Arrays;

import java.text.DecimalFormat;
import java.util.Scanner;

/* Fa�a um programa para ler o pre�o de um produto em cada um dos meses do
 * ano e depois imprimir a m�dia do valor do produto no ano.
 */

public class Exemplo3_25_08_2021 {

	public static void main(String[] args) {
		
		double[] precos = new double[12];
		Scanner leitor = new Scanner(System.in);
		
		for(int i = 0; i < precos.length; i++) {
			System.out.println("Digite o pre�o do produto no m�s " + (i+1) + ": ");
			precos[i] = leitor.nextDouble();
		}
		
		double somaValores = 0;
		for(int i = 0; i < precos.length; i++) {
			//somaValores = somaValores + precos[i];
			somaValores += precos[i];
		}
		
		double mediaPrecos = somaValores / precos.length;
		
		System.out.println("A m�dia de pre�os � igual a R$ " 
							+ new DecimalFormat(".##").format(mediaPrecos));
		
	}
	
	//[30, 18 , 5 , 38]
	// Ordenado: [5, 18, 30, 38]
	
}
