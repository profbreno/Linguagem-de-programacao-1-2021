package Arrays;

/* Fa�a um programa que gere um array de 20 posi��es, onde cada elemento
 * corresponde ao quadrado da sua posi��o. Depois imprima o array resultante.
 */


public class Exemplo2_25_08_2021 {

	public static void main(String[] args) {
		
		int[] numeros = new int[20];
		
		for(int i = 0; i < numeros.length; i++) {
			numeros[i] = i * i;
		}
		
		for(int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}
	}
}
