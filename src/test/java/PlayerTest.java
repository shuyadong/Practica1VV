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
        player.setX(x);
        player.keyPressed(e);
        player.act();
        //System.out.println(player.getX());
        boolean resultado = (player.getX() != 0);
        assertFalse(resultado); //El codigo está mal, porque devuelve 2 en vez de 0
    }

    @Test
    void TestActR2Incorrecto(){
        KeyEvent e = new KeyEvent(new JButton(), KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0, KeyEvent.VK_RIGHT, KeyEvent.CHAR_UNDEFINED);
        int x = 358;
        player.setX(x);
        player.keyPressed(e);
        player.act();
        //System.out.println(player.getX());
        boolean resultado = (player.getX() != 358);
        assertFalse(resultado); //El codigo esta mal, porque devuelve 360 en vez de 358
    }

    @Test
    void TestActR3Correcto(){
        KeyEvent e = new KeyEvent(new JButton(), KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0, KeyEvent.VK_RIGHT, KeyEvent.CHAR_UNDEFINED);
        int x = 36;
        player.setX(x);
        player.keyPressed(e);
        player.act();
        //System.out.println(player.getX());
        boolean resultado = (player.getX() == 38);
        assertTrue(resultado); //Test correcto
    }

    @Test
    void TestActR4Correcto(){
        KeyEvent e = new KeyEvent(new JButton(), KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0, KeyEvent.VK_0, KeyEvent.CHAR_UNDEFINED);
        int x = 38;
        player.setX(x);
        player.keyPressed(e);
        player.act();
        //System.out.println(player.getX());
        boolean resultado = (player.getX() == 38);
        assertTrue(resultado); //Test correcto
    }

    @Test
    void TestActR5Correcto(){
        KeyEvent e = new KeyEvent(new JButton(), KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0, KeyEvent.VK_LEFT, KeyEvent.CHAR_UNDEFINED);
        int x = 100;
        player.setX(x);
        player.keyPressed(e);
        player.act();
        //System.out.println(player.getX());
        boolean resultado = (player.getX() == 98);
        assertTrue(resultado); //Test correcto
    }

    @Test
    void TestInitPlayerCorrecto(){
        int playerEnMedio = 179;
        int playerInitGround = 280;
        boolean xyCorrecto = (playerEnMedio == player.getX()) && (playerInitGround == player.getY());
        assertTrue(xyCorrecto); //El codigo esta mal, sale false en vez de true
    }

    @Test
    void TestKeyPressedC1Correcto(){
        KeyEvent e = new KeyEvent(new JButton(), KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0, KeyEvent.VK_LEFT, KeyEvent.CHAR_UNDEFINED);
        int izquierda = 37;
        player.keyPressed(e);
        //System.out.println(e.getKeyCode());
        boolean resultado = (e.getKeyCode() == izquierda);
        assertTrue(resultado); //Test correcto
    }

    @Test
    void TestKeyPressedC2Correcto(){
        KeyEvent e = new KeyEvent(new JButton(), KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0, KeyEvent.VK_RIGHT, KeyEvent.CHAR_UNDEFINED);
        int derecha = 39;
        player.keyPressed(e);
        //System.out.println(e.getKeyCode());
        boolean resultado = (e.getKeyCode() == derecha);
        assertTrue(resultado); //Test correcto
    }

    @Test
    void TestKeyPressedC3Incorrecto(){
        KeyEvent e = new KeyEvent(new JButton(), KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0, KeyEvent.VK_W, KeyEvent.CHAR_UNDEFINED);
        int izquierda = 37;
        int derecha = 39;
        player.keyPressed(e);
        //System.out.println(e.getKeyCode());
        boolean resultado = (e.getKeyCode() == izquierda) && (e.getKeyCode() == derecha);
        assertFalse(resultado); //Test correcto
    }

    @Test
    void TestKeyReleasedC1Correcto(){
        KeyEvent e = new KeyEvent(new JButton(), KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0, KeyEvent.VK_LEFT, KeyEvent.CHAR_UNDEFINED);
        int izquierda = 37;
        player.keyReleased(e);
        //System.out.println(e.getKeyCode());
        boolean resultado = (e.getKeyCode() == izquierda);
        assertTrue(resultado); //Test correcto
    }

    @Test
    void TestKeyReleasedC2Correcto(){
        KeyEvent e = new KeyEvent(new JButton(), KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0, KeyEvent.VK_RIGHT, KeyEvent.CHAR_UNDEFINED);
        int derecha = 39;
        player.keyReleased(e);
        //System.out.println(e.getKeyCode());
        boolean resultado = (e.getKeyCode() == derecha);
        assertTrue(resultado); //Test correcto
    }

    @Test
    void TestKeyReleasedC3Incorrecto(){
        KeyEvent e = new KeyEvent(new JButton(), KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0, KeyEvent.VK_W, KeyEvent.CHAR_UNDEFINED);
        int izquierda = 37;
        int derecha = 39;
        player.keyReleased(e);
        //System.out.println(e.getKeyCode());
        boolean resultado = (e.getKeyCode() == izquierda) && (e.getKeyCode() == derecha);
        assertFalse(resultado); //Test correcto
    }
}
