
public class Batedeira {

	private boolean ligar = false;
	private int velocidade;
	private int timer;
	
	//+ pulsar(ligar : boolean) : void
	public void pulsar(boolean ligado) {
		this.ligar = ligado;
	}
	//+ getLigado() : boolean
	public boolean getLigado() {
		return this.ligar;
	}
	//+ setVelocidade(velocidade : int) : void
	public void setVelocidade(int veloc) {
		this.velocidade = veloc;
	}
	//+ setTimer(timer : int) : void
	public void setTimer(int timer) {
		this.timer = timer;
	}
	//+ getVelocidade() : int
	public int getVelocidade() {
		return this.velocidade;
	}
	//+ getTimer() : int
	public int getTimer() {
		return this.timer;
	}
	
}
