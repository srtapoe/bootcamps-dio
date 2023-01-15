package br.com.studies.desafiosorange;

import java.util.Scanner;

public class LojinhaDeDoces {
    public static void main(String[] args) {
        Scanner dadosEntrada = new Scanner(System.in);

        System.out.println("Insira seu dinheiro: ");
        int dinheiroColocado = dadosEntrada.nextInt();

        int qtdeDoces = dinheiroColocado * 2;

        System.out.println("O cliente obteve " + qtdeDoces + " doces");
    }
}
