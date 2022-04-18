package EstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

// Problema "idades"
// Fazer um programa para ler o nome e idade de duas pessoas. Ao final mostrar
// uma mensagem com os
// nomes e a idade média entre essas pessoas, com uma casa decimal, conforme
// exemplo.

public class Ex3Idades
{

    public static void main(
        String[] args )
    {
        Locale.setDefault( Locale.US );
        final Scanner sc = new Scanner( System.in );

        String primeiraPessoa, segundaPessoa;
        int primeiraIdade, segundaIdade;
        double media;

        System.out.println( "Dados da primeira pessoa: " );
        System.out.print( "Nome: " );
        primeiraPessoa = sc.nextLine();
        System.out.print( "Idade: " );
        primeiraIdade = sc.nextInt();

        System.out.println( "Dados da segunda pessoa: " );
        System.out.print( "Nome: " );
        sc.nextLine();// --------------> limpeza de buffer
        segundaPessoa = sc.nextLine();
        System.out.print( "Idade: " );
        segundaIdade = sc.nextInt();

        media = ( primeiraIdade + segundaIdade ) / 2.0;

        System.out.printf( "A idade media de %s e %s eh de %.1f anos", primeiraPessoa, segundaPessoa, media );

        sc.close();

    }

}
