package Zup;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Thiago
 */
public class RoverTest {

    public RoverTest() {
    }

    /**
     * Test of GirarEsquerda method, of class Rover.
     */
    @Test
    public void testGirarEsquerdaNorte() {
        Rover r = new Rover();
        System.out.println("GirarEsquerdaNorte");
        String SentidoAtual = "N";
        String expResult = "W";
        String result = r.GirarEsquerda(SentidoAtual);
        assertEquals(expResult, result);

    }

    @Test
    public void testGirarEsquerdaOeste() {
        Rover r = new Rover();
        System.out.println("GirarEsquerdaOeste");
        String SentidoAtual = "W";
        String expResult = "S";
        String result = r.GirarEsquerda(SentidoAtual);
        assertEquals(expResult, result);

    }

    @Test
    public void testGirarEsquerdaSul() {
        Rover r = new Rover();
        System.out.println("GirarEsquerdaSul");
        String SentidoAtual = "S";
        String expResult = "E";
        String result = r.GirarEsquerda(SentidoAtual);
        assertEquals(expResult, result);

    }

    @Test
    public void testGirarEsquerdaLeste() {
        Rover r = new Rover();
        System.out.println("GirarEsquerdaLeste");
        String SentidoAtual = "E";
        String expResult = "N";
        String result = r.GirarEsquerda(SentidoAtual);
        assertEquals(expResult, result);

    }

    /**
     * Test of GirarDireita method, of class Rover.
     */
    @Test
    public void testGirarDireitaNorte() {
        Rover r = new Rover();
        System.out.println("GirarDireitaNorte");
        String SentidoAtual = "N";
        String expResult = "E";
        String result = r.GirarDireita(SentidoAtual);
        assertEquals(expResult, result);

    }

    @Test
    public void testGirarDireitaLeste() {
        Rover r = new Rover();
        System.out.println("GirarDireitaLeste");
        String SentidoAtual = "E";
        String expResult = "S";
        String result = r.GirarDireita(SentidoAtual);
        assertEquals(expResult, result);

    }

    @Test
    public void testGirarDireitaSul() {
        Rover r = new Rover();
        System.out.println("GirarDireitaSul");
        String SentidoAtual = "S";
        String expResult = "W";
        String result = r.GirarDireita(SentidoAtual);
        assertEquals(expResult, result);

    }

    @Test
    public void testGirarDireitaOeste() {
        Rover r = new Rover();
        System.out.println("GirarDireitaOeste");
        String SentidoAtual = "W";
        String expResult = "N";
        String result = r.GirarDireita(SentidoAtual);
        assertEquals(expResult, result);

    }

    /**
     * Test of verificaPlanalto method, of class Rover.
     */
    @Test
    public void testVerificaPlanalto() {
        Rover r = new Rover();
        System.out.println("verificaPlanalto");
        int coordenadaX = 1;
        int coordenadaY = 2;
        int tamanhoX = 5;
        int tamanhoY = 5;
        boolean expResult = true;
        boolean result = r.verificaPlanalto(coordenadaX, coordenadaY, tamanhoX, tamanhoY);
        assertEquals(expResult, result);

    }

    /**
     * Test of verificaPlanalto method, of class Rover.
     */
    @Test
    public void testVerificaCoordenadasNegativa() {
        Rover r = new Rover();
        System.out.println("verificaPlanaltoNegativo");
        int coordenadaX = -1;
        int coordenadaY = -2;
        int tamanhoX = 5;
        int tamanhoY = 5;
        boolean expResult = false;
        boolean result = r.verificaPlanalto(coordenadaX, coordenadaY, tamanhoX, tamanhoY);
        assertEquals(expResult, result);

    }

    @Test
    public void testForaDoPlanalto() {
        Rover r = new Rover();
        System.out.println("ForaDoPlanalto");
        int coordenadaX = 6;
        int coordenadaY = 9;
        int tamanhoX = 5;
        int tamanhoY = 5;
        boolean expResult = false;
        boolean result = r.verificaPlanalto(coordenadaX, coordenadaY, tamanhoX, tamanhoY);
        assertEquals(expResult, result);

    }

    /**
     * Test of verificaInstrucao method, of class Rover.
     */
    @Test
    public void testVerificaInstrucao() {
        Rover r = new Rover();
        System.out.println("verificaInstrucao");
        String instrucao = "LMLMLMLMM";
        boolean expResult = true;
        boolean result = r.verificaInstrucao(instrucao);
        assertEquals(expResult, result);

    }

    @Test
    public void testVerificaInstrucaoForaPadrao() {
        Rover r = new Rover();
        System.out.println("verificaInstrucaoForaPadrao");
        String instrucao = "LMLMMRXYZ";
        boolean expResult = false;
        boolean result = r.verificaInstrucao(instrucao);
        assertEquals(expResult, result);

    }

}
