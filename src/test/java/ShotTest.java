import space_invaders.sprites.Shot;
import org.junit.jupiter.api.Test;
import space_invaders.sprites.Sprite;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.*;

public class ShotTest {

    @Test
    void testinitShot_Normal1C(){
        int x = -6;
        int y = 176;
        Shot shot = new Shot();
        try {
            Method metodo = shot.getClass().getDeclaredMethod("initShot", int.class, int.class);
            metodo.setAccessible(true);
            metodo.invoke(shot, x,y);

            Field valx = Sprite.class.getDeclaredField("x");
            valx.setAccessible(true);
            int valorx = (int) valx.get(shot);

            Field valy = Sprite.class.getDeclaredField("y");
            valy.setAccessible(true);
            int valory = (int) valy.get(shot);

            assertTrue((valorx == 0) && (valory == 175));

        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
    }


    @Test
    void testinitShot_Normal2C(){
        int x = -5;
        int y = 176;
        Shot shot = new Shot(x,y);
        try {
            Method metodo = shot.getClass().getDeclaredMethod("initShot", int.class, int.class);
            metodo.setAccessible(true);
            metodo.invoke(shot, x,y);

            Field valx = Sprite.class.getDeclaredField("x");
            valx.setAccessible(true);
            int valorx = (int) valx.get(shot);

            Field valy = Sprite.class.getDeclaredField("y");
            valy.setAccessible(true);
            int valory = (int) valy.get(shot);

            assertTrue((valorx == 1) && (valory == 175));

        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
    }
    @Test
    void testinitShot_Normal3C(){
        int x = 351;
        int y = 176;
        Shot shot = new Shot(x,y);
        try {
            Method metodo = shot.getClass().getDeclaredMethod("initShot", int.class, int.class);
            metodo.setAccessible(true);
            metodo.invoke(shot, x,y);

            Field valx = Sprite.class.getDeclaredField("x");
            valx.setAccessible(true);
            int valorx = (int) valx.get(shot);

            Field valy = Sprite.class.getDeclaredField("y");
            valy.setAccessible(true);
            int valory = (int) valy.get(shot);

            assertTrue((valorx == 357) && (valory == 175));

        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
    }
    @Test
    void testinitShot_Normal4C(){
        int x = 352;
        int y = 176;
        Shot shot = new Shot(x,y);
        try {
            Method metodo = shot.getClass().getDeclaredMethod("initShot", int.class, int.class);
            metodo.setAccessible(true);
            metodo.invoke(shot, x,y);

            Field valx = Sprite.class.getDeclaredField("x");
            valx.setAccessible(true);
            int valorx = (int) valx.get(shot);

            Field valy = Sprite.class.getDeclaredField("y");
            valy.setAccessible(true);
            int valory = (int) valy.get(shot);

            assertTrue((valorx == 358) && (valory == 175));

        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
    }
    @Test
    void testinitShot_Normal5C(){
        int x = 179;
        int y = 176;
        Shot shot = new Shot(x,y);
        try {
            Method metodo = shot.getClass().getDeclaredMethod("initShot", int.class, int.class);
            metodo.setAccessible(true);
            metodo.invoke(shot, x,y);

            Field valx = Sprite.class.getDeclaredField("x");
            valx.setAccessible(true);
            int valorx = (int) valx.get(shot);

            Field valy = Sprite.class.getDeclaredField("y");
            valy.setAccessible(true);
            int valory = (int) valy.get(shot);

            assertTrue((valorx == 185) && (valory == 175));

        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
    }
    @Test
    void testinitShot_Normal6C(){
        int x = 179;
        int y = 1;
        Shot shot = new Shot(x,y);
        try {
            Method metodo = shot.getClass().getDeclaredMethod("initShot", int.class, int.class);
            metodo.setAccessible(true);
            metodo.invoke(shot, x,y);

            Field valx = Sprite.class.getDeclaredField("x");
            valx.setAccessible(true);
            int valorx = (int) valx.get(shot);

            Field valy = Sprite.class.getDeclaredField("y");
            valy.setAccessible(true);
            int valory = (int) valy.get(shot);

            assertTrue((valorx == 185) && (valory == 0));

        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
    }
    @Test
    void testinitShot_Normal7C(){
        int x = 179;
        int y = 2;
        Shot shot = new Shot(x,y);
        try {
            Method metodo = shot.getClass().getDeclaredMethod("initShot", int.class, int.class);
            metodo.setAccessible(true);
            metodo.invoke(shot, x,y);

            Field valx = Sprite.class.getDeclaredField("x");
            valx.setAccessible(true);
            int valorx = (int) valx.get(shot);

            Field valy = Sprite.class.getDeclaredField("y");
            valy.setAccessible(true);
            int valory = (int) valy.get(shot);

            assertTrue((valorx == 185) && (valory == 1));

        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
    }
    @Test
    void testinitShot_Normal8C(){
        int x = 179;
        int y = 350;
        Shot shot = new Shot(x,y);
        try {
            Method metodo = shot.getClass().getDeclaredMethod("initShot", int.class, int.class);
            metodo.setAccessible(true);
            metodo.invoke(shot, x,y);

            Field valx = Sprite.class.getDeclaredField("x");
            valx.setAccessible(true);
            int valorx = (int) valx.get(shot);

            Field valy = Sprite.class.getDeclaredField("y");
            valy.setAccessible(true);
            int valory = (int) valy.get(shot);

            assertTrue((valorx == 185) && (valory == 349));

        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
    }
    @Test
    void testinitShot_Normal9C(){
        int x = 179;
        int y = 351;
        Shot shot = new Shot(x,y);
        try {
            Method metodo = shot.getClass().getDeclaredMethod("initShot", int.class, int.class);
            metodo.setAccessible(true);
            metodo.invoke(shot, x,y);

            Field valx = Sprite.class.getDeclaredField("x");
            valx.setAccessible(true);
            int valorx = (int) valx.get(shot);

            Field valy = Sprite.class.getDeclaredField("y");
            valy.setAccessible(true);
            int valory = (int) valy.get(shot);

            assertTrue((valorx == 185) && (valory == 350));

        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
    }
    @Test
    void testinitShot_xFueraRangoInferiorNC(){
        int x = -7;
        int y = 176;
        Shot shot = new Shot(x,y);
        try {
            Method metodo = shot.getClass().getDeclaredMethod("initShot", int.class, int.class);
            metodo.setAccessible(true);
            metodo.invoke(shot, x,y);

            Field valx = Sprite.class.getDeclaredField("x");
            valx.setAccessible(true);
            int valorx = (int) valx.get(shot);

            Field valy = Sprite.class.getDeclaredField("y");
            valy.setAccessible(true);
            int valory = (int) valy.get(shot);

            assertTrue((valorx == 0) && (valory == 175));

        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
    }
    @Test
    void testinitShot_xFueraRangoSuperiorNC(){
        int x = 353;
        int y = 176;
        Shot shot = new Shot(x,y);
        try {
            Method metodo = shot.getClass().getDeclaredMethod("initShot", int.class, int.class);
            metodo.setAccessible(true);
            metodo.invoke(shot, x,y);

            Field valx = Sprite.class.getDeclaredField("x");
            valx.setAccessible(true);
            int valorx = (int) valx.get(shot);

            Field valy = Sprite.class.getDeclaredField("y");
            valy.setAccessible(true);
            int valory = (int) valy.get(shot);

            assertTrue((valorx == 358) && (valory == 175));

        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
    }
    @Test
    void testinitShot_yFueraRangoInferiorNC(){
        int x = 179;
        int y = 0;
        Shot shot = new Shot(x,y);
        try {
            Method metodo = shot.getClass().getDeclaredMethod("initShot", int.class, int.class);
            metodo.setAccessible(true);
            metodo.invoke(shot, x,y);

            Field valx = Sprite.class.getDeclaredField("x");
            valx.setAccessible(true);
            int valorx = (int) valx.get(shot);

            Field valy = Sprite.class.getDeclaredField("y");
            valy.setAccessible(true);
            int valory = (int) valy.get(shot);

            assertTrue((valorx == 185) && (valory == 0));

        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
    }
    @Test
    void testinitShot_yFueraRangoSuperiorNC(){
        int x = 179;
        int y = 352;
        Shot shot = new Shot(x,y);
        try {
            Method metodo = shot.getClass().getDeclaredMethod("initShot", int.class, int.class);
            metodo.setAccessible(true);
            metodo.invoke(shot, x,y);

            Field valx = Sprite.class.getDeclaredField("x");
            valx.setAccessible(true);
            int valorx = (int) valx.get(shot);

            Field valy = Sprite.class.getDeclaredField("y");
            valy.setAccessible(true);
            int valory = (int) valy.get(shot);

            assertTrue((valorx == 185) && (valory == 350));

        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
    }

}
