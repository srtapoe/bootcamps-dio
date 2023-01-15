package br.com.studies.desafiosorange;

import java.util.ArrayList;
import java.util.Scanner;

public class SalvandoMp3 {
    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);

        System.out.println("A quantidade de arquivos: ");
        int qtdeArquivos = dados.nextInt();

        String arquivo;


        ArrayList<String> arquivosDeletados = new ArrayList<>();
        ArrayList<String> arquivosSalvos = new ArrayList<>();

        for (int i = 0; i <qtdeArquivos; i++){
            System.out.println("Nome do arquivo: ");
            arquivo = dados.next();

            if(arquivo.contains(".mp3")){
                System.out.println("Salvando..." + arquivo);
                arquivosSalvos.add(arquivo);
            }else{
                System.out.println("Deletar");
                System.out.println("Deletando..." + arquivo);
                arquivosDeletados.add(arquivo);
            }
        }

        for (String salvos: arquivosSalvos) {
            System.out.println("========ARQUIVOS SALVOS========");
            System.out.println("Musica salva..." + salvos);
        }

        for (String deletados: arquivosDeletados){
            System.out.println("========ARQUIVOS DELETADOS=======");
            System.out.println("Musica salva..." + deletados);
        }

    }
}
