package br.com.studies.bootcamp.desafios.basicos;

import java.util.Locale;
import java.util.Scanner;

public class CalculoSimples {
    public static void main(String[] args) {
        Scanner dadosEntrada = new Scanner(System.in);
        dadosEntrada.useLocale(Locale.US);

        System.out.println("Quantidade de pecas a catalogar = ");

        int qtdePecas = dadosEntrada.nextInt();

        int i = 0;
        double total = 0;
        int codigo;
        double numero;
        double valorUnitario;

        while(i < qtdePecas){
            System.out.println("Codigo da peca: ");
            codigo = dadosEntrada.nextInt();

            System.out.println("Numero da peca: ");
            numero = dadosEntrada.nextDouble();

            System.out.println("Valor Unitario da peca: ");
            valorUnitario = dadosEntrada.nextDouble();

            i++;

            total += numero * valorUnitario;


        }

        System.out.printf("VALOR A PAGAR: R$ %.2f", total);
    }
}
