import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class TestPunto {
    private Punto coordenada;
    private Punto coordenada_destino;
    

    @BeforeEach
    public void nuevacoordenada(){
        coordenada = new Punto(10, 20);
        coordenada_destino = new Punto(5, 10);
    }
    @Test
    public void TestSetX (){
        coordenada.setX(3);
        assertEquals(3, coordenada.getX());

    }
    @Test
    public void TestGetX (){
        assertEquals(10, coordenada.getX());
    }
    @Test
    public void TestSetY (){
        coordenada.setY(7);
        assertEquals(7, coordenada.getY());
    }
    @Test
    public void TestGetY (){
        assertEquals(20, coordenada.getY());
    }
    @Test
    public void TestDistancia (){
        assertEquals(11.180339887498949, coordenada.distancia(coordenada_destino));
    }
    @Test
    public void TestCompara (){
        assertEquals(false, coordenada.compara(coordenada_destino));
    }
}
