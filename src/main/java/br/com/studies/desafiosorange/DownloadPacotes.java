package br.com.studies.desafiosorange;

import java.util.Scanner;

public class DownloadPacotes {
    public static void main(String[] args) {

        Scanner dados = new Scanner(System.in);

        System.out.println("Sua entrada = ");
        int termino = dados.nextInt();


        int inicial;
        String word = "/";


        for(inicial = 1; inicial <= termino; inicial++){
                String resultado = word.repeat(inicial);
                System.out.println(resultado);
        }
    }
}
