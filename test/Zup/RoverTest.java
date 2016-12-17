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

}
