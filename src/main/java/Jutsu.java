public class Jutsu {
    private int quantidadeDeChakraUtilizado;
    private int danoDoJutsu;


    public Jutsu(int quantidadeDeChakraUtilizado, int danoDoJutsu){
        this.quantidadeDeChakraUtilizado = quantidadeDeChakraUtilizado > 5 ? 5 : quantidadeDeChakraUtilizado;
        this.danoDoJutsu = danoDoJutsu > 10 ? 10 : danoDoJutsu;
    }

    public int getQuantidadeDeChakraUtilizado() {
        return quantidadeDeChakraUtilizado;
    }

    public void setQuantidadeDeChakraUtilizado(int quantidadeDeChakraUtilizado) {
        this.quantidadeDeChakraUtilizado = quantidadeDeChakraUtilizado;
    }

    public int getDanoDoJutsu() {
        return danoDoJutsu;
    }

    public void setDanoDoJutsu(int danoDoJutsu) {
        this.danoDoJutsu = danoDoJutsu;
    }

}
