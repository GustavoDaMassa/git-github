public class Materia {

    public int quantdeprovas;
    public int oi = 1;

    public Materia(int quantdeprovas) {
        this.quantdeprovas = quantdeprovas;

    }

    public static int Somatorio(int... n) {
        int soma = 0;
        for (int i : n) {
            soma += i;
        }
        return soma;
    }

}
