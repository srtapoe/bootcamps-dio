package br.com.studies.desafiosorange;

import java.util.Scanner;

public class PaginasLidas {
    public static void main(String[] args) {
        Scanner dadosEntrada = new Scanner(System.in);

        System.out.println("Quantidades de páginas: ");
        int paginasLivro = dadosEntrada.nextInt();

        int paginasPorDia = 3;

        int tempoLeitura = paginasLivro / paginasPorDia;

        System.out.println(tempoLeitura + " dias");
    }
}
