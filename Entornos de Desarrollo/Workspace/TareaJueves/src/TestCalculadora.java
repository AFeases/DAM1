import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;

public class TestCalculadora {
    
    @Test
    public void TestCalcular(){
        assertEquals(CalculadoraIMC.calcularIMC(40, 2), 10);
    }

}
