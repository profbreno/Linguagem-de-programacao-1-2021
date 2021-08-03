/*	Crie uma classe para representar tempo em termos de hora, minutos e
 * segundos
	- Com 4 m�todos construtores
	- Uso dos modificadores
	*/

public class Tempo {

	private int horas;
	private int minutos;
	private int segundos;
	
	public Tempo() {
		setTempo(0, 0, 0);
	}
	public Tempo(int hora) {
		setTempo(hora, 0, 0);
	}
	public Tempo(int hora, int minutos) {
		setTempo(hora, minutos, 0);
	}
	public Tempo(int hora, int minutos, int segundos) {
		setTempo(hora, minutos, segundos);
	}
	
	public boolean setTempo(int h, int m, int s) {
		if((h>=0 && h<24) && (m>=0 && m<60) && (s>=0 && s<60)) {
			this.horas = h;
			this.minutos = m;
			this.segundos = s;
			return true;
		}else {
			this.horas = 0;
			this.minutos = 0;
			this.segundos = 0;
			return false;
		}
	}
	//M�todo chamado toString() que dever� retornar o tempo como
	//String. Ex: 07:30:00
	public String toString() {
		return this.horas + ":" + this.minutos + ":" + this.segundos;
	}
	
	//M�todo que retorne um long com o tempo em segundos.
	//Ex: 01:00:00 retornaria: 3600
	public long converteSegundos() {
		int horasConvertidas = this.horas * 3600;
		int minutosConvertidos = this.minutos * 60;
		long conversao = horasConvertidas + minutosConvertidos
								+ this.segundos;
		return conversao;
	}
	
	//M�todo que receba objeto Tempo como par�metro e retorne um long 
	//com a diferen�a entre este e o tempo do objeto em quest�o
	public long diferenca(Tempo relogio) {
		long diff = this.converteSegundos() - relogio.converteSegundos();
		return diff;
	}

}
