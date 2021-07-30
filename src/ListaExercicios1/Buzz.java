package ListaExercicios1;

public class Buzz {

	private String nome;
	private String frase;
	
	public Buzz(String nome) {
		this.nome = nome;
	}
	
	/* Capacete retr�til
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
			this.frase = "Ao infinito e al�m!";
			break;
		case 2:
			this.frase = "Isto n�o � voar. Isto � cair, com estilo!";
			break;
		case 3:
			this.frase = "Nunca duvidei de mim mesmo, Comandante, e n�o "
					+ "vou come�ar agora!";
			break;
		case 4:
			this.frase = "Embora voc� tenha tentado acabar comigo, a vingan�a "
					+ "n�o � um ideal que promovemos no meu planeta.";
			break;
		case 5:
			this.frase = "� quase como diz Buzz Lightyear, minha imagina��o me "
					+ "leva ao infinito e ao al�m.";
			break;
		case 6:
			this.frase = "Eu sou seu Buzz Lightyear, vamos voar pra bem longe "
					+ "daqui. Ao infinito e al�m!";
			break;
		default:
			this.frase = "Frase n�o identificada";
			
		}
		
		return this.frase;
	}


	//Dispara Laser
	//Bra�o articulado para golpes

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
