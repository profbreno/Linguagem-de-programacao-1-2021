package Arrays;

import java.util.Scanner;

public class TesteMatch {
	
	public static void main(String args[]) {
		
		int[] array = {16, 2, 77, 40, 12071};
		String[] nomes = {"Mariane", "Guilherme", "Dhomini"};
		
		System.out.println(array[2]);
		array[2] = 10;
		System.out.println(array[2]);
		// Verificar tamanho do array
		System.out.println(array.length);
		
		
		
		// Percorrendo um array com o for
		Scanner leitor = new Scanner(System.in);
		String[] nomesProprios = new String[10];
		
		for(int i = 0; i < nomesProprios.length; i++) {
			System.out.println("Digite um nome próprio:");
			nomesProprios[i] = leitor.nextLine();
		}
		for(int i = 0; i < nomesProprios.length; i++) {
			System.out.println("Nome próprio "+ i +":"+ nomesProprios[i]);
		}
	}
	
}
