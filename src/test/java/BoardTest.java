import main.Board;
import main.Commons;
import org.junit.jupiter.api.Test;
import space_invaders.sprites.Alien;
import space_invaders.sprites.Shot;

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


    @Test
    public void test_Update_Shot_Caso1() {
        try{
            Alien alien = board.getAliens().getFirst();
            Shot shot = board.getShot();
            int dieths = board.getDeaths();
            alien.die();
            shot.setX(alien.getX());
            shot.setY(alien.getY());
            Method method = Board.class.getDeclaredMethod("update_shots");
            method.setAccessible(true);
            method.invoke(board);
            assertFalse(alien.isVisible());
            assertEquals(dieths, board.getDeaths());
        } catch (InvocationTargetException | NoSuchMethodException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void test_Update_Shot_Caso2() {
        try{
            Alien alien = board.getAliens().getFirst();
            Shot shot = board.getShot();
            int dieths = board.getDeaths();
            shot.die();
            shot.setX(alien.getX());
            shot.setY(alien.getY());
            Method method = Board.class.getDeclaredMethod("update_shots");
            method.setAccessible(true);
            method.invoke(board);
            assertFalse(shot.isVisible());
            assertEquals(dieths, board.getDeaths());
        } catch (InvocationTargetException | NoSuchMethodException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void test_Update_Shot_Caso3() {
        try{
            Alien alien = board.getAliens().getFirst();
            Shot shot = board.getShot();
            int dieths = board.getDeaths();
            shot.setX(alien.getX()-1);
            shot.setY(alien.getY());
            Method method = Board.class.getDeclaredMethod("update_shots");
            method.setAccessible(true);
            method.invoke(board);
            assertTrue(alien.isVisible());
            assertTrue(shot.isVisible());
            assertEquals(dieths, board.getDeaths());
        } catch (InvocationTargetException | NoSuchMethodException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void test_Update_Shot_Caso4() {
        try{
            Alien alien = board.getAliens().getFirst();
            Shot shot = board.getShot();
            int dieths = board.getDeaths();
            shot.setX(alien.getX());
            shot.setY(alien.getY() + Commons.ALIEN_HEIGHT + 1);
            Method method = Board.class.getDeclaredMethod("update_shots");
            method.setAccessible(true);
            method.invoke(board);
            assertTrue(alien.isVisible());
            assertTrue(shot.isVisible());
            assertEquals(dieths, board.getDeaths());
        } catch (InvocationTargetException | NoSuchMethodException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void test_Update_Shot_Caso5() {
        try{
            Alien alien = board.getAliens().getFirst();
            Shot shot = board.getShot();
            int dieths = board.getDeaths();
            shot.setX(alien.getX());
            shot.setY(alien.getY() - 1);
            Method method = Board.class.getDeclaredMethod("update_shots");
            method.setAccessible(true);
            method.invoke(board);
            assertTrue(alien.isVisible());
            assertTrue(shot.isVisible());
            assertEquals(dieths, board.getDeaths());
        } catch (InvocationTargetException | NoSuchMethodException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void test_Update_Shot_Caso6() {
        try{
            Alien alien = board.getAliens().getFirst();
            Shot shot = board.getShot();
            int dieths = board.getDeaths();
            shot.setX(alien.getX());
            shot.setY(alien.getY());
            Method method = Board.class.getDeclaredMethod("update_shots");
            method.setAccessible(true);
            method.invoke(board);
            assertTrue(alien.isVisible());
            assertTrue(shot.isVisible());
            assertEquals(dieths + 1 , board.getDeaths());
        } catch (InvocationTargetException | NoSuchMethodException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void test_Update_Shot_Caso7() {
        try{
            Alien alien = board.getAliens().getFirst();
            Shot shot = board.getShot();
            int dieths = board.getDeaths();
            shot.setX(alien.getX() + Commons.ALIEN_WIDTH + 1);
            shot.setY(alien.getY());
            Method method = Board.class.getDeclaredMethod("update_shots");
            method.setAccessible(true);
            method.invoke(board);
            assertTrue(alien.isVisible());
            assertTrue(shot.isVisible());
            assertEquals(dieths, board.getDeaths());
        } catch (InvocationTargetException | NoSuchMethodException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void test_Update_Shot_Caso8() {
        try{
            Alien alien = board.getAliens().getFirst();
            Shot shot = board.getShot();
            int dieths = board.getDeaths();
            shot.setX(alien.getX());
            shot.setY(-1);
            Method method = Board.class.getDeclaredMethod("update_shots");
            method.setAccessible(true);
            method.invoke(board);
            assertTrue(alien.isVisible());
            assertFalse(shot.isVisible());
            assertEquals(dieths, board.getDeaths());
        } catch (InvocationTargetException | NoSuchMethodException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void test_Update_Aliens_Caso1 () {
        try{
            Alien alien = board.getAliens().getFirst();
            int posY;
            alien.setX(5);
            posY = alien.getY();
            Method method = Board.class.getDeclaredMethod("update_aliens");
            method.setAccessible(true);
            method.invoke(board);
            assertTrue(board.isInGame());
            assertEquals(1, board.getDirection());
            for (int i = 0; i < Commons.ALIEN_ROWS; i++) {
                for (int j = 0; j < Commons.ALIEN_COLUMNS; j++) {
                    alien = board.getAliens().removeFirst();
                    assertEquals(posY + Commons.GO_DOWN + i * (Commons.ALIEN_HEIGHT + Commons.ALIEN_SEPARATOR), alien.getY());
                }
            }
        }catch (InvocationTargetException | NoSuchMethodException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void test_Update_Sliens_Caso2 () {
        try {
            Alien alien = board.getAliens().getFirst();
            alien.setX(6);
            alien.setY(Commons.GROUND - Commons.ALIEN_HEIGHT);
            Method method = Board.class.getDeclaredMethod("update_aliens");
            method.setAccessible(true);
            method.invoke(board);
            assertFalse(board.isInGame());
        } catch (InvocationTargetException | NoSuchMethodException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void test_Update_Aliens_Caso3() {
        try{
            Alien alien = board.getAliens().getFirst();
            int posY;
            alien.setX(328);
            posY = alien.getY();
            Method method = Board.class.getDeclaredMethod("update_aliens");
            method.setAccessible(true);
            method.invoke(board);
            assertTrue(board.isInGame());
            assertEquals(-1, board.getDirection());
            for (int i = 0; i < Commons.ALIEN_ROWS; i++) {
                for (int j = 0; j < Commons.ALIEN_COLUMNS; j++) {
                    alien = board.getAliens().removeFirst();
                    assertEquals(posY + Commons.GO_DOWN + i * (Commons.ALIEN_HEIGHT + Commons.ALIEN_SEPARATOR), alien.getY());
                }
            }
        }catch (InvocationTargetException | NoSuchMethodException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}


