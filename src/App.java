
public class App {

	public static void main(String[] args) {
		
		Contador contador = new Contador();
		Contador contador2 = new Contador();
		
		contador.atribuirValor(73);
		contador2.atribuirValor(199);
		int valorAtual = contador.getValorAtual();
		System.out.println("Valor inicial: " + valorAtual);
		contador.incrementarValor();
		valorAtual = contador.getValorAtual();
		System.out.println("Valor ap�s o incremento: " + valorAtual);
		
		int valor = contador2.getValorAtual();
		System.out.println("Valor da segunda inst�ncia: "+ valor);
		contador2.incrementarValor();
		valor = contador2.getValorAtual();
		System.out.println("Valor da segunda inst�ncia ap�s o incremento: " 
				+ valor);
		
	}
}