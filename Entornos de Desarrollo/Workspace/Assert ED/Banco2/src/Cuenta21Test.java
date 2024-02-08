import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class Cuenta21Test {
    private Cuenta2 cta;

    @BeforeEach
    public void nuevacuenta2(){
        cta = new Cuenta2("ES628364837467846", 100);
    
    }
    @Test 
    public void testGetSaldo(){
        float saldo = cta.getSaldo();
        assertEquals(100, saldo);
    }
    @Test 
    public void testSetSaldo(){
        cta.setSaldo(20);
        assertEquals(20, cta.getSaldo());
        
    }
    @Test
    public void testIngresarDinero(){
        cta.ingresarDinero(500);
        assertEquals(600, cta.getSaldo());
    }
    @Test 
    public void testExtraerDinero(){
        try {
            cta.extraerDinero(10);
        } catch (ArithmeticException ae) {
            
        }
    }
}
