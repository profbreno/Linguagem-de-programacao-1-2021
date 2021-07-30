
public class CarroIdealMain {

	public static void main(String[] args) {
		
		CarroIdeal fusca = new CarroIdeal();
		
		System.out.println("O fusca está andando a "+ fusca.getVelocidade() 
							+ " Km/h");
		
		fusca.acelerar(150);
		System.out.println("O fusca está andando a "+ fusca.getVelocidade() 
		+ " Km/h");
		
		fusca.acelerar(100);
		System.out.println("O fusca está andando a "+ fusca.getVelocidade() 
		+ " Km/h");
		
		//Error
		//fusca.velocidade = 400;
		//System.out.println("O fusca está andando a "+ fusca.getVelocidade() + " Km/h");
		

	}

}
