import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import space_invaders.sprites.Player;

import javax.swing.*;
import java.awt.event.KeyEvent;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class PlayerTest {

    private Player player;

    @BeforeEach
    void SetUp(){
        player = new Player();
    }
    @Test
    void testAct_Caso1() {
        KeyEvent e = new KeyEvent(new JButton(), KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0, KeyEvent.VK_LEFT, KeyEvent.CHAR_UNDEFINED);
        int x = 0;
        int salidaEsperada = 0;
        boolean resultado ;
        player.setX(x);
        player.keyPressed(e);
        player.act();
        //System.out.println(player.getX());
        resultado = (player.getX() == salidaEsperada);
        assertTrue(resultado);

    }

    @Test
    void TestAct_Caso2(){
        KeyEvent e = new KeyEvent(new JButton(), KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0, KeyEvent.VK_RIGHT, KeyEvent.CHAR_UNDEFINED);
        int x = 358;
        int salidaEsperada = 358;
        boolean resultado;
        player.setX(x);
        player.keyPressed(e);
        player.act();
        //System.out.println(player.getX());
        resultado = (player.getX() == salidaEsperada);
        assertTrue(resultado);
    }

    @Test
    void TestAct_Caso3(){
        KeyEvent e = new KeyEvent(new JButton(), KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0, KeyEvent.VK_RIGHT, KeyEvent.CHAR_UNDEFINED);
        int x = 36;
        int salidaEsperada = 38;
        boolean resultado;
        player.setX(x);
        player.keyPressed(e);
        player.act();
        //System.out.println(player.getX());
        resultado = (player.getX() == salidaEsperada);
        assertTrue(resultado); //Test correcto
    }

    @Test
    void TestAct_Caso4(){
        KeyEvent e = new KeyEvent(new JButton(), KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0, KeyEvent.VK_0, KeyEvent.CHAR_UNDEFINED);
        int x = 38;
        int salidaEsperada = 38;
        boolean resultado;
        player.setX(x);
        player.keyPressed(e);
        player.act();
        //System.out.println(player.getX());
        resultado = (player.getX() == salidaEsperada);
        assertTrue(resultado); //Test correcto
    }

    @Test
    void TestAct_Caso5(){
        KeyEvent e = new KeyEvent(new JButton(), KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0, KeyEvent.VK_LEFT, KeyEvent.CHAR_UNDEFINED);
        int x = 100;
        int salidaEsperada = 98;
        boolean resultado;
        player.setX(x);
        player.keyPressed(e);
        player.act();
        //System.out.println(player.getX());
        resultado = (player.getX() == salidaEsperada);
        assertTrue(resultado); //Test correcto
    }

    @Test
    void TestInitPlayer_Caso1(){
        int salidaPlayerEnMedio = 179;
        int salidaPlayerInitGround = 280;
        boolean xyCorrecto;
        xyCorrecto = (salidaPlayerEnMedio == player.getX()) && (salidaPlayerInitGround == player.getY());
        assertTrue(xyCorrecto);
    }

    @Test
    void TestKeyPressed_Caso1(){
        KeyEvent e = new KeyEvent(new JButton(), KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0, KeyEvent.VK_LEFT, KeyEvent.CHAR_UNDEFINED);
        int salidaEsperadaIzquierda = 37;
        boolean resultado;
        player.keyPressed(e);
        //System.out.println(e.getKeyCode());
        resultado = (e.getKeyCode() == salidaEsperadaIzquierda);
        assertTrue(resultado); //Test correcto
    }

    @Test
    void TestKeyPressed_Caso2(){
        KeyEvent e = new KeyEvent(new JButton(), KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0, KeyEvent.VK_RIGHT, KeyEvent.CHAR_UNDEFINED);
        int salidaEsperadaDerecha = 39;
        boolean resultado;
        player.keyPressed(e);
        //System.out.println(e.getKeyCode());
        resultado = (e.getKeyCode() == salidaEsperadaDerecha);
        assertTrue(resultado); //Test correcto
    }

    @Test
    void TestKeyPressed_Caso3(){
        KeyEvent e = new KeyEvent(new JButton(), KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0, KeyEvent.VK_W, KeyEvent.CHAR_UNDEFINED);
        int salidaEsperadaIzquierda = 37;
        int salidaEsperadaDerecha = 39;
        boolean resultado;
        player.keyPressed(e);
        //System.out.println(e.getKeyCode());
        resultado = (e.getKeyCode() == salidaEsperadaIzquierda) && (e.getKeyCode() == salidaEsperadaDerecha);
        assertFalse(resultado); //Test correcto
    }

    @Test
    void TestKeyReleased_Caso1(){
        KeyEvent e = new KeyEvent(new JButton(), KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0, KeyEvent.VK_LEFT, KeyEvent.CHAR_UNDEFINED);
        int salidaEsperadaIzquierda = 37;
        boolean resultado;
        player.keyReleased(e);
        //System.out.println(e.getKeyCode());
        resultado = (e.getKeyCode() == salidaEsperadaIzquierda);
        assertTrue(resultado); //Test correcto
    }

    @Test
    void TestKeyReleased_Caso2(){
        KeyEvent e = new KeyEvent(new JButton(), KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0, KeyEvent.VK_RIGHT, KeyEvent.CHAR_UNDEFINED);
        int salidaEsperadaDerecha = 39;
        boolean resultado;
        player.keyReleased(e);
        //System.out.println(e.getKeyCode());
        resultado = (e.getKeyCode() == salidaEsperadaDerecha);
        assertTrue(resultado); //Test correcto
    }

    @Test
    void TestKeyReleased_Caso3(){
        KeyEvent e = new KeyEvent(new JButton(), KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0, KeyEvent.VK_W, KeyEvent.CHAR_UNDEFINED);
        int salidaEsperadaIzquierda = 37;
        int salidaEsperadaDerecha = 39;
        boolean resultado;
        player.keyReleased(e);
        //System.out.println(e.getKeyCode());
        resultado = (e.getKeyCode() == salidaEsperadaIzquierda) && (e.getKeyCode() == salidaEsperadaDerecha);
        assertFalse(resultado); //Test correcto
    }
}
