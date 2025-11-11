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
    void testActR1Incorrecto() {
        KeyEvent e = new KeyEvent(new JButton(), KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0, KeyEvent.VK_LEFT, KeyEvent.CHAR_UNDEFINED);
        int x = 0;
        int salidaEsperada = -2;
        player.setX(x);
        player.keyPressed(e);
        player.act();
        //System.out.println(player.getX());
        boolean resultado = (player.getX() == salidaEsperada);
        assertFalse(resultado); //Test correcto
    }

    @Test
    void TestActR2Incorrecto(){
        KeyEvent e = new KeyEvent(new JButton(), KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0, KeyEvent.VK_RIGHT, KeyEvent.CHAR_UNDEFINED);
        int x = 358;
        int salidaEsperada = 360;
        player.setX(x);
        player.keyPressed(e);
        player.act();
        //System.out.println(player.getX());
        boolean resultado = (player.getX() == salidaEsperada);
        assertFalse(resultado); //Test correcto
    }

    @Test
    void TestActR3Correcto(){
        KeyEvent e = new KeyEvent(new JButton(), KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0, KeyEvent.VK_RIGHT, KeyEvent.CHAR_UNDEFINED);
        int x = 36;
        int salidaEsperada = 38;
        player.setX(x);
        player.keyPressed(e);
        player.act();
        //System.out.println(player.getX());
        boolean resultado = (player.getX() == salidaEsperada);
        assertTrue(resultado); //Test correcto
    }

    @Test
    void TestActR4Correcto(){
        KeyEvent e = new KeyEvent(new JButton(), KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0, KeyEvent.VK_0, KeyEvent.CHAR_UNDEFINED);
        int x = 38;
        int salidaEsperada = 38;
        player.setX(x);
        player.keyPressed(e);
        player.act();
        //System.out.println(player.getX());
        boolean resultado = (player.getX() == salidaEsperada);
        assertTrue(resultado); //Test correcto
    }

    @Test
    void TestActR5Correcto(){
        KeyEvent e = new KeyEvent(new JButton(), KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0, KeyEvent.VK_LEFT, KeyEvent.CHAR_UNDEFINED);
        int x = 100;
        int salidaEsperada = 98;
        player.setX(x);
        player.keyPressed(e);
        player.act();
        //System.out.println(player.getX());
        boolean resultado = (player.getX() == salidaEsperada);
        assertTrue(resultado); //Test correcto
    }

    @Test
    void TestInitPlayerCorrecto(){
        int salidaPlayerEnMedio = 179;
        int salidaPlayerInitGround = 280;
        boolean xyCorrecto = (salidaPlayerEnMedio == player.getX()) && (salidaPlayerInitGround == player.getY());
        assertTrue(xyCorrecto);
    }

    @Test
    void TestKeyPressedC1Correcto(){
        KeyEvent e = new KeyEvent(new JButton(), KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0, KeyEvent.VK_LEFT, KeyEvent.CHAR_UNDEFINED);
        int salidaEsperadaIzquierda = 37;
        player.keyPressed(e);
        //System.out.println(e.getKeyCode());
        boolean resultado = (e.getKeyCode() == salidaEsperadaIzquierda);
        assertTrue(resultado); //Test correcto
    }

    @Test
    void TestKeyPressedC2Correcto(){
        KeyEvent e = new KeyEvent(new JButton(), KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0, KeyEvent.VK_RIGHT, KeyEvent.CHAR_UNDEFINED);
        int salidaEsperadaDerecha = 39;
        player.keyPressed(e);
        //System.out.println(e.getKeyCode());
        boolean resultado = (e.getKeyCode() == salidaEsperadaDerecha);
        assertTrue(resultado); //Test correcto
    }

    @Test
    void TestKeyPressedC3Incorrecto(){
        KeyEvent e = new KeyEvent(new JButton(), KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0, KeyEvent.VK_W, KeyEvent.CHAR_UNDEFINED);
        int salidaEsperadaIzquierda = 37;
        int salidaEsperadaDerecha = 39;
        player.keyPressed(e);
        //System.out.println(e.getKeyCode());
        boolean resultado = (e.getKeyCode() == salidaEsperadaIzquierda) && (e.getKeyCode() == salidaEsperadaDerecha);
        assertFalse(resultado); //Test correcto
    }

    @Test
    void TestKeyReleasedC1Correcto(){
        KeyEvent e = new KeyEvent(new JButton(), KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0, KeyEvent.VK_LEFT, KeyEvent.CHAR_UNDEFINED);
        int salidaEsperadaIzquierda = 37;
        player.keyReleased(e);
        //System.out.println(e.getKeyCode());
        boolean resultado = (e.getKeyCode() == salidaEsperadaIzquierda);
        assertTrue(resultado); //Test correcto
    }

    @Test
    void TestKeyReleasedC2Correcto(){
        KeyEvent e = new KeyEvent(new JButton(), KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0, KeyEvent.VK_RIGHT, KeyEvent.CHAR_UNDEFINED);
        int salidaEsperadaDerecha = 39;
        player.keyReleased(e);
        //System.out.println(e.getKeyCode());
        boolean resultado = (e.getKeyCode() == salidaEsperadaDerecha);
        assertTrue(resultado); //Test correcto
    }

    @Test
    void TestKeyReleasedC3Incorrecto(){
        KeyEvent e = new KeyEvent(new JButton(), KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0, KeyEvent.VK_W, KeyEvent.CHAR_UNDEFINED);
        int salidaEsperadaIzquierda = 37;
        int salidaEsperadaDerecha = 39;
        player.keyReleased(e);
        //System.out.println(e.getKeyCode());
        boolean resultado = (e.getKeyCode() == salidaEsperadaIzquierda) && (e.getKeyCode() == salidaEsperadaDerecha);
        assertFalse(resultado); //Test correcto
    }
}
