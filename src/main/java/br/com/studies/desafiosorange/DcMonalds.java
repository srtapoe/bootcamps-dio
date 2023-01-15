package br.com.studies.desafiosorange;

import java.util.Scanner;

public class DcMonalds {
    public static void main(String[] args) {
        Scanner dadosEntrada = new Scanner(System.in);
        System.out.println("Ingredientes = ");

        String ingredientes = dadosEntrada.next();

        String[] ingredientesFormatados = ingredientes.split(";");

        for (String ingrediente : ingredientesFormatados) {
            System.out.println(ingrediente);
        }

    }
}
