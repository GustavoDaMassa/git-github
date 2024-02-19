import java.util.Scanner;
import java.math.*;

public class m {

    public static void main(String[] args) {

        double menor;
        double media = 0;
        double nnotas = 0;
        double notas[] = new double[16];

        for (int i = 0; i < notas.length; i++) {
            notas[i] = 11;
        }

        System.out.println("Digite suas notas (apos a ultima digite 12):");

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
        System.out.println(soma);
        media = soma / nnotas;

        System.out.println("media geral: " + media);

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

        System.out.println("foram descartadas " + desc + " notas.");

        int m = 0;
        for (int i = 0; i < desc; i++) {

            menor = notas[m];
            for (int j = 0; j < notas.length; j++) {
                if (notas[j] < menor) {
                    menor = notas[j];
                    m = j;
                    // System.out.println(m);
                }
            }
            notas[m] = 11;
            /*
             * System.out.println(m);
             * System.out.println(notas[m]);
             * System.out.println("---------");
             */
        }

        /*
         * for (double d : notas) {
         * System.out.println(d);
         * }
         */
        soma = 0;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] != 12 && notas[i] != 11)
                soma += notas[i];
            // System.out.println(i + "-" + soma);

        }

        // System.out.println(soma);
        media = soma / (nnotas - desc);

        System.out.printf("nota com 25 porcento descartado: %.2f ", media);

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