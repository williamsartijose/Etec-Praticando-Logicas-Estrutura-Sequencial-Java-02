package EstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Ex1Terreno
{

    public static void main(
        String[] agrs )
    {

        Locale.setDefault( Locale.US );
        final Scanner sc = new Scanner( System.in );

        double largura, comprimento, valor, area;
        final double preco;

        System.out.print( "Digite a largura do terreno: " );
        largura = sc.nextDouble();

        System.out.print( "Digite o comprimento do terreno: " );
        comprimento = sc.nextDouble();

        System.out.print( "Digite o valor do metro quadrado: " );
        valor = sc.nextDouble();

        area = largura * comprimento;

        System.out.printf( "Area do terreno = %.2f\n", area );

        preco = area * valor;

        System.out.printf( "Preco do terreno = %.2f\n", preco );

        sc.close();

    }
}
