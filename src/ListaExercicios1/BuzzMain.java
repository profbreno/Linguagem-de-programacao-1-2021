package ListaExercicios1;

public class BuzzMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Buzz buzz1 = new Buzz("Buzz de Euclides da Cunha");
		Buzz buzz2 = new Buzz("Buzz de Monte Santo");
		Buzz buzz3 = new Buzz("Buzzina");
		Buzz buzz4 = new Buzz("Buzz de Tucano");
		Buzz buzz5 = new Buzz("Buzz 5");
		Buzz buzz6 = new Buzz("Buzz 6");
		Buzz buzz7 = new Buzz("Buzz de Ribeira");

		System.out.println("Buzz 1: " + buzz1.frases(1));
		System.out.println("Buzz 2: " + buzz2.frases(2));
		System.out.println("Buzz 3: " + buzz3.frases(3));
		System.out.println("Buzz 4: " + buzz4.frases(4));
		System.out.println("Buzz 5: " + buzz5.frases(5));
		System.out.println("Buzz 6: " + buzz6.frases(6));
		System.out.println("Buzz 7: " + buzz7.frases());
		System.out.println("Nome do Buzz 3: " + buzz3.getNome());

	}

}
