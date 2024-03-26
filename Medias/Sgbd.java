package Medias;


import java.util.Scanner;
import java.math.*;

public class Sgbd {

    public static void main(String[] args) {

        double menor = 0;
        double media = 0;
        double avmedia = 0;
        double nnotas = 0; // numero de atividades 
        double avnotas = 0; // numero de avaliaçoes
        double notas[] = new double[16];
        double avaliacao[] = new double[2];

        for (int i = 0; i < notas.length; i++) {
            notas[i] = 11;
        }

        System.out.println("Digite as notas das suas atividades (apos a ultima digite 12):");

        Scanner scanner = new Scanner(System.in);

        for (int j = 0; j < notas.length; j++) {

            notas[j] = scanner.nextDouble();
            if (notas[j] == 12)
                break;
            nnotas = j + 1;

        }

        double soma = 0;

        for (int i = 0; notas[i] != 12; i++) {
            soma += notas[i];
        }
        
        //System.out.println(soma);
         media = soma / nnotas;

        System.out.println("media geral das atividades: " + media);

        double desc = nnotas / 4;

        System.out.println("Deseja descartar o teto de 25% (1) ou o chao de 25% (2) das notas?");

        int n = scanner.nextInt();

        if (n == 1)
            desc = arredondarC(desc);
        else if (n == 2)
            desc = arredondarF(desc);
        else {
            System.out.println("Opcao invalida. Sera feito o arrendondamento matematico");
            desc = arredondar(desc);
        }

        System.out.printf("foram descartadas %.1lf notas.\n", desc);
        System.out.println("foram descartadas " + desc + " notas.");

        int m = 0;
        for (int i = 0; i < desc; i++) {

            menor = notas[m];
            for (int j = 0; j < notas.length; j++) {
                if (notas[j] < menor)
                    menor = notas[j];
                m = j;
            }
            notas[m] = 11;

        }

        soma = 0;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] != 12 && notas[i] != 11)
                soma += notas[i];
            System.out.println(soma);

        }

        System.out.println(soma);
        media = soma / (nnotas - desc);

        System.out.printf("nota das atividades com 25 porcento descartado: %.2f ", media);

        for (int i = 0; i < avaliacao.length; i++) {
            avaliacao[i] = 11;
        }
        
        System.out.println("Digite as notas das suas atividades (apos a ultima digite 12):");


        for (int j = 0; j < avaliacao.length; j++) {

            notas[j] = scanner.nextDouble();
            if (avaliacao[j] == 12)
                break;
            avnotas = j + 1;

        }

        double avsoma = 0;

        for (int i = 0; avaliacao[i] != 12; i++) {
            avsoma += avaliacao[i];
        }
        
        //System.out.println(avsoma);
         avmedia = avsoma / avnotas;

        System.out.println("media geral das avaliaçoes: " + avmedia);
        System.out.println();
        

        System.out.printf("media geral da disciplina: " + ((0.4 * media) +(0.6*avmedia)));

    }

    private static double arredondarF(double desc) {
        return Math.floor(desc);
    }

    private static double arredondarC(double desc) {
        return Math.ceil(desc);
    }

    private static double arredondar(double desc) {
        return Math.round(desc);
    }
}