
public class PessoaMain {

	public static void main(String[] args) {
		
		Pessoa pessoa1 = new Pessoa();
		Pessoa pessoa2 = new Pessoa("Emanuel", "123.456.789-12", 2004);
		
		// Dados da pessoa 1
		System.out.println("Dados da pessoa 1");
		System.out.println(pessoa1.getNome());
		System.out.println(pessoa1.getcpf());
		System.out.println(pessoa1.getAnoNascimento() + "\n");
		
		// Dados da pessoa 2
		System.out.println("Dados da pessoa 2");
		System.out.println(pessoa2.getNome());
		System.out.println(pessoa2.getcpf());
		System.out.println(pessoa2.getAnoNascimento());

	}

}
