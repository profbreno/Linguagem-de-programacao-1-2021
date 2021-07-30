package ListaExercicios1;

public class Buzz {

	private String nome;
	private String frase;
	
	public Buzz(String nome) {
		this.nome = nome;
	}
	
	/* Capacete retrátil
	 */
	
	public String getNome() {
		return this.nome;
	}

	//6 frases
	public String frases() {
		return this.frases(0);
	}
	public String frases(int numFrase) {
		
		switch(numFrase) {
		case 1:
			this.frase = "Ao infinito e além!";
			break;
		case 2:
			this.frase = "Isto não é voar. Isto é cair, com estilo!";
			break;
		case 3:
			this.frase = "Nunca duvidei de mim mesmo, Comandante, e não "
					+ "vou começar agora!";
			break;
		case 4:
			this.frase = "Embora você tenha tentado acabar comigo, a vingança "
					+ "não é um ideal que promovemos no meu planeta.";
			break;
		case 5:
			this.frase = "É quase como diz Buzz Lightyear, minha imaginação me "
					+ "leva ao infinito e ao além.";
			break;
		case 6:
			this.frase = "Eu sou seu Buzz Lightyear, vamos voar pra bem longe "
					+ "daqui. Ao infinito e além!";
			break;
		default:
			this.frase = "Frase não identificada";
			
		}
		
		return this.frase;
	}


	//Dispara Laser
	//Braço articulado para golpes

	//Abre as asas
	public boolean asas;

	public boolean abreAsas() {
		if(asas==true) {
			return false;
		}else {
			return true;
		}
	}
}
