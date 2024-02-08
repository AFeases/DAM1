package Calculadora.src;
import static org.junit.Assert.*;
import org.junit.Test;

public class calculadoraTest {

    @Test 
    public void testSuma(){

        calculadora calcu = new calculadora(20, 10);
        int resultado = calcu.suma();
        assertEquals("La suma es correcta",300, resultado);
        
    
    }

    @Test
    public void testResta(){
        calculadora calcu = new calculadora(15, 10);
        int resultado = calcu.resta();
        assertEquals(5, resultado);
    }

    @Test
    public void testmultiplica(){
        calculadora calcu = new calculadora(3, 10);
        int resultado = calcu.multiplica();
        assertEquals(30, resultado);
    }

    @Test
    public void testdivide2(){
        calculadora calcu = new calculadora(20, 10);
        int resultado = calcu.divide2();
        assertEquals(2, resultado);
    }
}
