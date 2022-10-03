import org.junit.Assert;
import org.junit.Test;

public class TestBatalhaNinja {

    @Test
    public void deveRetornarNinjaComJutsuMaisForteSeOsDoisGastamOMesmoChakra() {
        Jutsu jutsuNinjaUm = new Jutsu(5, 8);
        Ninja ninjaUm = new Ninja("Naruto", jutsuNinjaUm);

        Jutsu jutsuNinjaDois = new Jutsu(5, 10);
        Ninja ninjaDois = new Ninja("Gaara", jutsuNinjaDois);

        Batalha batalha = new Batalha();

        Ninja ninjaVencedor = batalha.lutar(ninjaUm, ninjaDois);

        Assert.assertSame(ninjaDois, ninjaVencedor);
    }

    @Test
    public void deveAtualizarOChakraDoOponenteDeAcordoComODanoDoJutsoQuandoAtacar() {
        Jutsu jutsuNinjaAtacante = new Jutsu(5, 10);
        Ninja ninjaAtacante = new Ninja("Naruto", jutsuNinjaAtacante);

        Jutsu jutsuNinjaOponente = new Jutsu(5, 8);
        Ninja ninjaOponente = new Ninja("Gaara", jutsuNinjaOponente);

        int nivelChakraEsperado = 90;

        ninjaAtacante.atacar(ninjaOponente);

        Assert.assertEquals(nivelChakraEsperado, ninjaOponente.getChakraDoNinja());
    }

    @Test
    public void deveRetornarPrimeiroNinjaComoVencedorQuandoONomeForItachi() {
        Jutsu jutsuNinjaAtacante = new Jutsu(5, 10);
        Ninja ninjaAtacante = new Ninja("Itachi", jutsuNinjaAtacante);

        Jutsu jutsuNinjaOponente = new Jutsu(4, 8);
        Ninja ninjaOponente = new Ninja("Sasuke", jutsuNinjaOponente);

        Batalha batalhaDeuchiha = new Batalha();

        Ninja ninjaVencedor = batalhaDeuchiha.lutar(ninjaAtacante, ninjaOponente);

        Assert.assertSame(ninjaAtacante, ninjaVencedor);
    }

    @Test
    public void deveRetornarSegundoNinjaComoVencedorQuandoONomeForItachi() {
        Jutsu jutsuNinjaAtacante = new Jutsu(1, 10);
        Ninja ninjaAtacante = new Ninja("Sasuke", jutsuNinjaAtacante);

        Jutsu jutsuNinjaOponente = new Jutsu(5, 8);
        Ninja ninjaOponente = new Ninja("Itachi", jutsuNinjaOponente);

        Batalha batalhaDeuchiha = new Batalha();

        Ninja ninjaVencedor = batalhaDeuchiha.lutar(ninjaAtacante, ninjaOponente);

        Assert.assertSame(ninjaOponente, ninjaVencedor);
    }

    @Test
    public void deveRetornarPrimeiroNinjaComoVencedorQuandoEmpatar() {
        Jutsu jutsuNinjaAtacante = new Jutsu(5, 10);
        Ninja ninjaAtacante = new Ninja("Gaara", jutsuNinjaAtacante);

        Jutsu jutsuNinjaOponente = new Jutsu(5, 10);
        Ninja ninjaOponente = new Ninja("Rock lee", jutsuNinjaOponente);

        Batalha melhorBatalha = new Batalha();

        Ninja ninjaVencedor = melhorBatalha.lutar(ninjaAtacante, ninjaOponente);

        Assert.assertSame(ninjaAtacante, ninjaVencedor);
    }

    @Test
    public void deveRetornarONinjaComMaisChakra() {
        Jutsu jutsuNinjaAtacante = new Jutsu(2, 8);
        Ninja ninjaAtacante = new Ninja("Hashirama", jutsuNinjaAtacante);

        Jutsu jutsuNinjaOponente = new Jutsu(5, 9);
        Ninja ninjaOponente = new Ninja("Madara", jutsuNinjaOponente);

        Batalha batalhaNinjaRaiz = new Batalha();

        Ninja ninjaVencedor = batalhaNinjaRaiz.lutar(ninjaAtacante, ninjaOponente);

        Assert.assertSame(ninjaAtacante, ninjaVencedor);
    }

}
