package EstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;
// Problema "terreno"
// Fazer um programa para ler as medidas da largura e comprimento de um terreno
// retangular com uma
// casa decimal, bem como o valor do metro quadrado do terreno com duas casas
// decimais. Em seguida,
// o programa deve mostrar o valor da área do terreno, bem como o valor do preço
// do terreno, ambos com
// duas casas decimais, conforme exemplo.

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
