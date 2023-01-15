package br.com.studies.bootcamp.desafios.basicos;

import java.io.IOException;
import java.util.Scanner;

public class PreenchimentoDeVetor {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int T = leitor.nextInt();
        int[] N = new int[1000];
        int contador = 0;
        while (contador  < 999) {
            for (int j = 0; j < T; j++) {
                if (contador  > 999) break;
                N[contador ] = j;
                contador ++;
            }
        }

        for (int i = 0; i < N.length; i++) {
            System.out.println("N[" + i + "] = " + N[i]);
        }
    }
}
