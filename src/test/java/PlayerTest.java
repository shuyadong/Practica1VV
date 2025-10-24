import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import space_invaders.sprites.Player;

import javax.swing.*;
import java.awt.event.KeyEvent;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class PlayerTest {

    private Player player = new Player();

    @BeforeEach
    void SetUp(){

    }
    @Test
    void testActR1Incorrecto() {
        KeyEvent e = new KeyEvent(new JButton(), KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0, KeyEvent.VK_LEFT, KeyEvent.CHAR_UNDEFINED);
        int x = 0;
        player.setX(x);
        player.keyPressed(e);
        player.act();
        System.out.println(player.getX());
        boolean resultado = (player.getX() > 0);
        assertFalse(resultado);
    }
}
