/*
A classe Contador possui um �nico atributo
- valorAtual
A classe prov� m�todos para:
- Atribuir um valor ao contador
- Incrementar o contador
- Obter o atual valor do  contador
*/
public class Contador {

	private int valorAtual;
	
	public void atribuirValor(int valor) {
		this.valorAtual = valor;
	}
	public void incrementarValor() {
		this.valorAtual++; // this.valorAtual = this.valorAtual + 1
	}
	public int getValorAtual() {
		return this.valorAtual;
	}
	
}
