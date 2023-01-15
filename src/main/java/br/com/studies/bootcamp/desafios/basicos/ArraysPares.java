package br.com.studies.bootcamp.desafios.basicos;

public class ArraysPares {
    public static void main(String[] args) {
            int[] pares = {2,3,5,7,11,13,18,34};

            for(int i = 0; i<pares.length;i++) {
                if(pares[i] % 2 == 0) {
                    System.out.println(pares[i]);
                }
            }

        }

    }
