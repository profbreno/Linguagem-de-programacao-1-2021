
public class CarroIdeal{
	
	//atributos
	private int velocidade = 0;
	
	public int getVelocidade() {
		return this.velocidade;
	}
	
	//metodos
	public void acelerar(int v){
	
		//o carro só pode atingir 200km/h
		if((velocidade + v) <= 200){
			velocidade += v;
		}else{
			velocidade = 200;
		}
		
	}
	
	public void frear(int v){
		//....
	}

}