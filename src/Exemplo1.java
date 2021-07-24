
public class Exemplo1 {
	
	public static void main(String args[]) {
		
		Batedeira b = new Batedeira();
		
		b.pulsar(true);
		if(b.getLigado()) {
			System.out.println("A batedeira já está ligada");
		}else {
			b.pulsar(true);
			System.out.println("Acabei de ligar a batedeira");
		}
		b.setVelocidade(3);
		System.out.println("A velocidade da batedeira é "+ b.getVelocidade());
		b.setTimer(30);
		System.out.println("O timer da batedeira atual é "+ b.getTimer());
		
	}

}
