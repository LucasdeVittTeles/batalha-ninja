public class Ninja {
    private String nome;
    private int chakraDoNinja;
    private Jutsu jutsuPrincipal;

    public Ninja(String nome, Jutsu jutsuPrincipal) {
        this.nome = nome;
        this.chakraDoNinja = 100;
        this.jutsuPrincipal = jutsuPrincipal;
    }

    public String getNome() {
        return nome;
    }

    public int getChakraDoNinja() {
        return chakraDoNinja;
    }

    public Jutsu getJutsuPrincipal() {
        return jutsuPrincipal;
    }

    public void atacar(Ninja ninjaOponente) {
        ninjaOponente.receberGolpe(this.jutsuPrincipal.getDanoDoJutsu());
        chakraDoNinja -= jutsuPrincipal.getQuantidadeDeChakraUtilizado();
    }

    public int receberGolpe(int danoDoJutsu) {
        return this.chakraDoNinja -= danoDoJutsu;
    }
}
