package ListaExercicios1;

import java.util.Locale;
import java.util.Scanner;

public class q1021 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double VI = input.nextDouble();
        int V = 0;

        System.out.println("NOTAS:");
        V = (int) VI / 100;
        System.out.printf("%d nota(s) de R$ 100.00%n", V);
        VI = VI % 100.0;

        V = (int) VI / 50;
        System.out.printf("%d nota(s) de R$ 50.00%n", V);
        VI = VI % 50.0;

        V = (int) VI / 20;
        System.out.printf("%d nota(s) de R$ 20.00%n", V);
        VI = VI % 20.0;

        V = (int) VI / 10;
        System.out.printf("%d nota(s) de R$ 10.00%n", V);
        VI = VI % 10.0;

        V = (int) VI / 5;
        System.out.printf("%d nota(s) de R$ 5.00%n", V);
        VI = VI % 5.0;

        V = (int) VI / 2;
        System.out.printf("%d nota(s) de R$ 2.00%n", V);
        VI = VI % 2.0;

        VI = VI * 100.0;

        System.out.println("MOEDAS:");
        V = (int) VI / 1;
        System.out.printf("%d moeda(s) de R$ 1.00%n", V);
        VI = VI % 100.0;

        V = (int) VI / 50;
        System.out.printf("%d moeda(s) de R$ 0.50%n", V);
        VI = VI % 50.0;
        V = (int) VI / 25;
        System.out.printf("%d moeda(s) de R$ 0.25%n", V);
        VI = VI % 25.0;

        V = (int) VI / 10;
        System.out.printf("%d moeda(s) de R$ 0.10%n", V);
        VI = VI % 10.0;

        V = (int) VI / 5;
        System.out.printf("%d moeda(s) de R$ 0.05%n", V);
        VI = VI % 5.0;

        V = (int) VI / 1;
        System.out.printf("%d moeda(s) de R$ 0.01%n", V);
        VI = VI % 1.0;

        input.close();

    }
}
