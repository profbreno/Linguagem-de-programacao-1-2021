
public class Pessoa {
	
	//Atributos
	private String nome;
	private String cpf;
	private int anoNascimento;
	
	public Pessoa() {
		this.nome = "Indefinido";
		this.cpf = "Indefinido";
		this.anoNascimento = 0;
	}
	
	public Pessoa(String n, String c, int a) {
		this.nome = n;
		this.cpf = c;
		this.anoNascimento = a;
	}
	
	public String getNome() {
		return this.nome;
	}
	public String getcpf() {
		return this.cpf;
	}
	public int getAnoNascimento() {
		return this.anoNascimento;
	}
}
