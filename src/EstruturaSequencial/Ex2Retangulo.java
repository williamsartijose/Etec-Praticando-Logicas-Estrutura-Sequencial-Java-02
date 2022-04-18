package EstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

// Problema "retangulo"
// Fazer um programa para ler as medidas da base e altura de um retângulo. Em
// seguida, mostrar o valor
// da área, perímetro e diagonal deste retângulo, com quatro casas decimais,
// conforme exemplos.

public class Ex2Retangulo
{

    public static void main(
        String[] args )
    {

        Locale.setDefault( Locale.US );
        final Scanner sc = new Scanner( System.in );

        Double base, altura, area, perimetro, diagonal;

        System.out.println( "Base do retangulo: " );
        base = sc.nextDouble();

        System.out.println( "Altura do retangulo: " );
        altura = sc.nextDouble();

        area = base * altura;

        System.out.printf( "AREA: %.4f\n", area );

        perimetro = 2 * ( base + altura );

        System.out.printf( "PERIMETRO = %.4f\n", perimetro );

        diagonal = Math.sqrt( base * base + altura * altura );

        System.out.printf( "DIAGONAL = %.4f\n", diagonal );

        sc.close();
    }

}
