package br.com.studies.desafiosorange;

import java.util.Scanner;

public class IndustriaDaMulta {
    public static void main(String[] args) {
        Scanner dadosEntrada = new Scanner(System.in);

        System.out.println("Velocidade do veiculo: ");
        int velocidade = dadosEntrada.nextInt();

        if(velocidade > 60){
            System.out.println("Foi multado");
        }else{
            System.out.println("Nao foi multado");
        }
    }
}
