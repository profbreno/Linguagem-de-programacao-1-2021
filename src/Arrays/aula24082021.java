package Arrays;

import java.util.Scanner;

/* O guich� de ped�gio de uma rodovia possui um equipamento que registra diariamente a
 * quantidade de carros que passaram. Fa�a um programa para ler cada registro do m�s de
 * setembro e informar qual o maior volume de carros que passou e em qual dia do m�s.
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
