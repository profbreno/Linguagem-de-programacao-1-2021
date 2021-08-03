
public class TempoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tempo relogio1 = new Tempo();
		Tempo relogio2 = new Tempo(13);
		Tempo relogio3 = new Tempo(15, 25);
		Tempo relogio4 = new Tempo(32, 10, 10);
		
		System.out.println(relogio1.toString());
		System.out.println(relogio2.toString());
		System.out.println(relogio3.toString());
		System.out.println(relogio4.toString());
		
		if(relogio4.setTempo(22, 60, 10)) {
			System.out.println("Horário correto: " +
								relogio4.toString());
		}else {
			System.out.println("O Horário continua errado!");
		}
		
		System.out.println("O relógio 3 marca " + relogio3.toString());
		System.out.println("Convertido em segundos fica: " 
							+ relogio3.converteSegundos());
		
		System.out.println("\nA diferença entre o relógio 3 e o relógio 2 é: " 
						+ relogio3.diferenca(relogio2));
		
	}

}
