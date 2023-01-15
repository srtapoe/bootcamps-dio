package br.com.studies.desafiosorange;


import java.util.Scanner;
public class PontosNaCarteira {
    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);

        System.out.println("Velocidade: ");
        int velocidade = dados.nextInt();
        System.out.println("Qtde. multas: ");
        int qtdeMultas = dados.nextInt();

        int multas = 0;

        if(velocidade > 80 && (multas = 1 + qtdeMultas) >= 3){
            System.out.println(multas + " multas. Levou pontos na carteira");
        }else if(velocidade > 80 && (multas = 1 + qtdeMultas) < 3){
            System.out.println(multas + " multas. Não levou pontos na carteira");
        }else{
            System.out.println(qtdeMultas + " multas. Não levou pontos na carteira");
        }



    }
}
