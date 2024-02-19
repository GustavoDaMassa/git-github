public class Materia {

    private int mediafinal = 6;
    public int quantdeprovas;

    public Materia(int quantdeprovas){
        this.quantdeprovas = quantdeprovas;

    }

    public static int Somatorio(int...n){
        int soma=0;
        for(int i : n){
            soma+=i;
        }
        return soma;
    }

    
}
