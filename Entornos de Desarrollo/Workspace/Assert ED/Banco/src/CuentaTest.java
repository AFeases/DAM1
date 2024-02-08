import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.*;
public class CuentaTest {
    @Test
    public void testGetSaldo(){
        Cuenta cuenta1 = new Cuenta("ES2746864648234723", 100);
        float saldo = cuenta1.getSaldo();
        assertEquals(100, saldo);
    }
    @Test 
    public void testSetSaldo(){
        Cuenta cuenta1 = new Cuenta("ES47828935748939237", 0);
        cuenta1.setSaldo(100);
        float saldo = cuenta1.getSaldo();
        assertEquals(100, saldo);
    }
    @Test 
    public void testGetNumero(){
        Cuenta cuenta1 = new Cuenta("ES1234", 100);
        String numero = cuenta1.getNumero();
        String resultado = "ES1234";
        assertEquals(resultado, numero);
        
    }
    @Test 
    public void testSetNumero(){
        Cuenta cuenta1 = new Cuenta("ES47828935748939237", 100);
        cuenta1.setNumero("ES1234");
        String numero = cuenta1.getNumero();
        assertEquals("ES1234", numero);
    }
    @Test 
    public void testIngresarDinero(){
        Cuenta cuenta1 = new Cuenta("ES47828935748939237", 0);
        cuenta1.ingresarDinero(100);
        float saldo = cuenta1.getSaldo();
        assertEquals(100, saldo); 
    }
    @Test 
    public void testExtraerDinero(){
        try {
            Cuenta cuenta1 = new Cuenta("ES47828935748939237", 1000);
            cuenta1.extraerDinero(600);
            fail("Error");
        } catch (ArithmeticException ae) {
            // TODO: handle exception
        }
    }
}
