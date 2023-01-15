package br.com.studies.desafiosorange;

import java.util.Scanner;

public class BlueCouldIceCubes {
    public static void main(String[] args) {
        Scanner dadosEntrada = new Scanner(System.in);

        System.out.println("Tamanho da fila: ");
        int fila = dadosEntrada.nextInt();
        int qtdeCamarote = 0;

        for (int i = 0; i<=fila; i++){
            if(i % 2 != 0){
                qtdeCamarote++;
            }
        }

        System.out.println(qtdeCamarote + " pessoas no camarote");
    }
}
