package Arrays;

import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String nome1, nome2, nome3;
		float nota1, nota2, nota3, media;
		System.out.print("Informe o nome do aluno 1: ");
		nome1 = teclado.nextLine();
		System.out.print("Informe o nome do aluno 2: ");
		nome2 = teclado.nextLine();
		System.out.print("Informe o nome do aluno 3: ");
		nome3 = teclado.nextLine();
		System.out.print("Informe a nota de " + nome1 + ": ");
		nota1 = teclado.nextFloat();
		System.out.print("Informe a nota de " + nome2 + ": ");
		nota2 = teclado.nextFloat();
		System.out.print("Informe a nota de " + nome3 + ": ");
		nota3 = teclado.nextFloat();
		media = (nota1 + nota2 + nota3)/3;
		
		if (nota1 > media)
			System.out.println("Parabéns " + nome1);
		if (nota2 > media)
			System.out.println("Parabéns " + nome2);
		if (nota3 > media)
			System.out.println("Parabéns " + nome3);
	}
	
}
