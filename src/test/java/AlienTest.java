import space_invaders.sprites.Alien;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import space_invaders.sprites.Sprite;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.*;

public class AlienTest {

/*
    @Test
    void probarconMétodo_y_AtributoPrivado (){
        // Crear una instancia del objeto de la clase que se quiere probar. En este caso la clase Shot
        Shot shot = new Shot();
        try {
            // Accedemos al método que queremos probar. En este caso el método initShot.
            // Se puede hacer de dos formas.
            // Método 1: acceder a través de clase mediante el acceso a los métodos estáticos de la clase. y de ellos al método getDeclaredMethod
            // donde hay que indicar el método y los tipos o clases a los que pertenece cada parémetro. En este caso son dos número enteros
            Method metodo = Shot.class.getDeclaredMethod("initShot", int.class, int.class);
            // Método 2: acceder a través de los métodos de un objeto para conocer su clase y mediante el acceso a los métodos estáticos de la clase. y, de nuevo usar el método getDeclaredMethod
            // donde hay que indicar el método y los tipos o clases a los que pertenece cada parémetro. En este caso son dos número enteros
            Method metodo = shot.getClass().getDeclaredMethod("initShot", int.class, int.class);
            // Cambiamos el modificador de visibilidad del método para que pueda ser accesible
            metodo.setAccessible(true);
            // Finalmente, ejecutamos el método con los valores deseados
            metodo.invoke(shot, 10,10);

            // Ahora vamos a acceder a los atributos privados. En este caso como la declaración se hizo en la clase padre Sprite hay que usar el primero de los métodos que hemos visto antes
            // Se acceder al atributo a través de los métodos estáticos de la clase padre. En particular utilizando el método getDeclaredField indicando el nombre del atributo
            Field valx = Sprite.class.getDeclaredField("x");
            // Cambiamos el modificador de visibilidad del método para que pueda ser accesible
            valx.setAccessible(true);
            // Accedemos al valor del atributo. Como nos devuelve un objeto, procedemos a los correpondientes cast y operaciones necesarias para obtener el valor.
            int valorx = (int) valx.get(shot);

            // Hacemos lo mismo para el otro atributo
            Field valy = Sprite.class.getDeclaredField("y");
            valy.setAccessible(true);
            int valory = (int) valy.get(shot);
            // Comprobamos que el efecto es el deseado
            assertTrue((valorx == 16) && (valory==9));

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

*/
    @Test
    void testinitAlien_NormalC() {
        int x = 100;
        int y = 100;
        Alien a = new Alien(x, y);

        try {
            Method metodo = a.getClass().getDeclaredMethod("initAlien", int.class, int.class);
            metodo.setAccessible(true);
            metodo.invoke(a, x,y);

            Field valx = Sprite.class.getDeclaredField("x");
            valx.setAccessible(true);
            int valorx = (int) valx.get(a);

            Field valy = Sprite.class.getDeclaredField("y");
            valy.setAccessible(true);
            int valory = (int) valy.get(a);

            assertTrue((valorx == x) && (valory==y));

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
    void testinitAlien_XFueraRangoNegativoNC() {
        int x = -10;
        int y = 100;
        Alien a = new Alien(x, y);

        try {
            Method metodo = a.getClass().getDeclaredMethod("initAlien", int.class, int.class);
            metodo.setAccessible(true);
            metodo.invoke(a, x,y);

            Field valx = Sprite.class.getDeclaredField("x");
            valx.setAccessible(true);
            int valorx = (int) valx.get(a);

            Field valy = Sprite.class.getDeclaredField("y");
            valy.setAccessible(true);
            int valory = (int) valy.get(a);

            assertTrue((valorx == 0) && (valory == 100));

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
    void testinitAlien_XFueraRangoPositivoNC() {
        int x = 359;
        int y = 100;
        Alien a = new Alien(x, y);

        try {
            Method metodo = a.getClass().getDeclaredMethod("initAlien", int.class, int.class);
            metodo.setAccessible(true);
            metodo.invoke(a, x,y);

            Field valx = Sprite.class.getDeclaredField("x");
            valx.setAccessible(true);
            int valorx = (int) valx.get(a);

            Field valy = Sprite.class.getDeclaredField("y");
            valy.setAccessible(true);
            int valory = (int) valy.get(a);

            assertTrue((valorx == 358) && (valory == 100));

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
    void testinitAlien_YFueraRangoNegativoNC() {
        int x = 100;
        int y = -10;
        Alien a = new Alien(x, y);

        try {
            Method metodo = a.getClass().getDeclaredMethod("initAlien", int.class, int.class);
            metodo.setAccessible(true);
            metodo.invoke(a, x,y);

            Field valx = Sprite.class.getDeclaredField("x");
            valx.setAccessible(true);
            int valorx = (int) valx.get(a);

            Field valy = Sprite.class.getDeclaredField("y");
            valy.setAccessible(true);
            int valory = (int) valy.get(a);

            assertTrue((valorx == 100) && (valory == 0));

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
    void testinitAlien_YFueraRangoPositivoNC() {
        int x = 100;
        int y = 351;
        Alien a = new Alien(x, y);

        try {
            Method metodo = a.getClass().getDeclaredMethod("initAlien", int.class, int.class);
            metodo.setAccessible(true);
            metodo.invoke(a, x,y);

            Field valx = Sprite.class.getDeclaredField("x");
            valx.setAccessible(true);
            int valorx = (int) valx.get(a);

            Field valy = Sprite.class.getDeclaredField("y");
            valy.setAccessible(true);
            int valory = (int) valy.get(a);

            assertTrue((valorx == 100) && (valory == 350));

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
    void testActIzquierdaC(){
        int direccion = -1;
        int x = 10;
        Alien a = new Alien(x,10);
        a.act(direccion);
        assertEquals(9,a.getX());
    }

    @Test
    void testActDerechaC(){
        int direccion = 1;
        int x = 10;
        Alien a = new Alien(x,10);

        a.act(direccion);
        assertEquals(11,a.getX());

    }


    @Test
    void testActErrorNC(){
        int direccion = 2;
        int x = 10;
        Alien a = new Alien(x,10);
        a.act(direccion);
        assertEquals(10,a.getX());
    }
}