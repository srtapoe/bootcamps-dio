package br.com.studies.desafiosorange;
import java.util.Scanner;

public class ImoveisDisponiveis {
    public static void main(String[] args) {

        Scanner dadosEntrada = new Scanner(System.in);
        System.out.println("Entrada = ");

        String fraseEntrada = dadosEntrada.next();

        String[] informacoesImovel = fraseEntrada.split("/");

        System.out.println("Imovel: " + informacoesImovel[0] + " R$" + informacoesImovel[1] + " " + informacoesImovel[2]);
    }
}
