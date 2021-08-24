/*
 * Desafio
Voc� deve fazer a leitura de 5 valores inteiros. Em seguida mostre quantos valores informados s�o pares, quantos valores informados s�o �mpares, quantos valores informados s�o positivos e quantos valores informados s�o negativos.

Entrada
Voc� receber� 5 valores inteiros.

Sa�da
Exiba a mensagem conforme o exemplo de sa�da abaixo, sendo uma mensagem por linha e n�o esquecendo o final de linha ap�s cada uma.
 */

package ListaExercicios1;

import java.io.IOException;
import java.util.Scanner;

public class MinhaClasse {
	
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
//declare suas variaveis corretamente
        int[] numeros = new int[5];
        int par=0, impar=0, positivo=0, negativo=0;
        for (int i=0; i<5; i++) {
        	numeros[i] = leitor.nextInt();
        }

//continue a solu��o
        for (int i=0; i<5; i++) {
        	if(numeros[i] % 2 == 0)
        		par++;
        	else
        		impar++;
        	if(numeros[i]>0)
        		positivo++;
        	else if (numeros[i]<0)
        		negativo++;
        }
//insira suas variaveis corretamente
        System.out.println(par + " valor(es) par(es)");
        System.out.println(impar + " valor(es) impar(es)");
        System.out.println(positivo + " valor(es) positivo(s)");
        System.out.println(negativo + " valor(es) negativo(s)");
    }
	
}