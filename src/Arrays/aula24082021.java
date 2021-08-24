package Arrays;

import java.util.Scanner;

/* O guichê de pedágio de uma rodovia possui um equipamento que registra diariamente a
 * quantidade de carros que passaram. Faça um programa para ler cada registro do mês de
 * setembro e informar qual o maior volume de carros que passou e em qual dia do mês.
*/

public class aula24082021 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leitor = new Scanner(System.in);
		int[] carrosPorDia = new int[3];
		
		for(int i = 0 ; i < carrosPorDia.length; i++) {
			System.out.println("Digite a quantidade de carros do dia "+ i+1 + ": ");
			carrosPorDia[i] = leitor.nextInt();
		}
		
		// 0  - 1  - 2
		// 10 - 30 - 25
		
		

	}

}
