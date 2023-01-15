package br.com.studies.bootcamp.desafios.basicos;

import java.util.Scanner;

public class PedraPapelAtaque {
    public static void main(String[] args) {

        Scanner dadosEntrada = new Scanner(System.in);

        System.out.println("Jogadas = ");
        int jogadas = dadosEntrada.nextInt();

        String jogadorUm;
        String jogadorDois;

        for (int i = 0; i <jogadas;i++){
            jogadorUm = dadosEntrada.next();
            jogadorDois = dadosEntrada.next();


            if(jogadorUm.equalsIgnoreCase("ataque") && jogadorDois.equalsIgnoreCase("ataque")){
                System.out.println("Aniquilacao mutua");
            }else if(jogadorUm.equalsIgnoreCase("papel") && jogadorDois.equalsIgnoreCase("papel")){
                System.out.println("Ambos venceram");
            }else if(jogadorUm.equalsIgnoreCase("ataque") && jogadorDois.equalsIgnoreCase("pedra") || (jogadorUm.equalsIgnoreCase("ataque") && jogadorDois.equalsIgnoreCase("papel"))){
                System.out.println("Jogador 1 venceu");
            }else if(jogadorUm.equalsIgnoreCase("pedra") && jogadorDois.equalsIgnoreCase("ataque") || (jogadorUm.equalsIgnoreCase("papel") && jogadorDois.equalsIgnoreCase("ataque"))){
                System.out.println("Jogador 2 ganhou");
            }else {
                System.out.println("Nenhum vencedor");
            }
        }
    }
}
