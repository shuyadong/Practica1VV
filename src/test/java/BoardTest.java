import main.Board;
import main.Commons;
import org.junit.jupiter.api.Test;
import space_invaders.sprites.Alien;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.*;

public class BoardTest {

    Board board;
    @org.junit.jupiter.api.BeforeEach
    void setUp(){
        board=new Board();
    }

    @Test
    public void test_GameInit_Case1(){
        Alien alien;
        for (int i = 0; i < Commons.ALIEN_ROWS; i++) {
            for (int j = 0; j < Commons.ALIEN_COLUMNS; j++) {
                alien = board.getAliens().removeFirst();
                assertEquals((Commons.ALIEN_INIT_X) + j * (Commons.ALIEN_WIDTH + Commons.ALIEN_SEPARATOR), alien.getX());
                assertEquals((Commons.ALIEN_INIT_Y) + i * (Commons.ALIEN_HEIGHT + Commons.ALIEN_SEPARATOR), alien.getY());
            }
        }
    }

    @Test
    public void test_Update_Case1() {
        try{
            board.setDeaths(24);

            Method method = Board.class.getDeclaredMethod("update");
            method.setAccessible(true);
            method.invoke(board);
            assertFalse(board.isInGame());

        }catch (InvocationTargetException | NoSuchMethodException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void test_Update_Caso2() {
        try{
            board.setDeaths(5);

            Method method = Board.class.getDeclaredMethod("update");
            method.setAccessible(true);
            method.invoke(board);
            assertTrue(board.isInGame());

        } catch (InvocationTargetException | NoSuchMethodException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}

