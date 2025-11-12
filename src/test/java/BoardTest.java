import main.Board;
import main.Commons;
import org.junit.jupiter.api.Test;
import space_invaders.sprites.Alien;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BoardTest {

    Board board;
    @org.junit.jupiter.api.BeforeEach
    void setUp(){
        board=new Board();
    }

    @Test
    public void test_GameInit(){
        Alien alien;
        for (int i = 0; i < Commons.ALIEN_ROWS; i++) {
            for (int j = 0; j < Commons.ALIEN_COLUMNS; j++) {
                alien = board.getAliens().removeFirst();
                assertEquals((Commons.ALIEN_INIT_X) + j * (Commons.ALIEN_WIDTH + Commons.ALIEN_SEPARATOR), alien.getX());
                assertEquals((Commons.ALIEN_INIT_Y) + i * (Commons.ALIEN_HEIGHT + Commons.ALIEN_SEPARATOR), alien.getY());
            }
        }
    }
}

