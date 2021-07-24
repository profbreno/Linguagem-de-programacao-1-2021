package ListaExercicios1;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 * IMPORTANT: O nome da classe deve ser "Main" para que a sua solu��o execute
 * Class name must be "Main" for your solution to execute El nombre de la clase
 * debe ser "Main" para que su soluci�n ejecutar
 */
public class Main {

    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);

        double A, B, C, media;
        Scanner leitor = new Scanner(System.in);

        A = leitor.nextDouble();
        B = leitor.nextDouble();
        C = leitor.nextDouble();

        media = ((A * 2) + (B * 3) + (C * 5)) / 10;

        DecimalFormat df = new DecimalFormat(".#");
        media = Double.valueOf(df.format(media));

        System.out.println("MEDIA = " + new DecimalFormat(".#").format(media));

        leitor.close();

    }

}