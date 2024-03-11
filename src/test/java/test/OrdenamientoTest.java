package test;

import ejercicios.Ordenamiento;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author danielsanchez
 */
public class OrdenamientoTest {
    @Test
    public void testOrdenadoAscendente() {
        String valorEsperado = "Los números ordenados de menor a mayor son: 1 2 3 4";
        String valorActual = Ordenamiento.evaluar(1, 2, 3, 4);
        assertEquals(valorEsperado, valorActual);
    }
    
    @Test
    public void testOrdenadoDescendente() {
        String valorEsperado = "Los números ordenados de menor a mayor son: 1 2 3 4";
        String valorActual = Ordenamiento.evaluar(4, 3, 2, 1);
        assertEquals(valorEsperado, valorActual);
    }
    
    @Test
    public void testAleatorio1() {
        String valorEsperado = "Los números ordenados de menor a mayor son: 0 1 6 7";
        String valorActual = Ordenamiento.evaluar(7, 0, 6, 1);
        assertEquals(valorEsperado, valorActual);
    }
    
    @Test
    public void testAleatorio2() {
        String valorEsperado = "Los números ordenados de menor a mayor son: -3 0 5 10";
        String valorActual = Ordenamiento.evaluar(5, -3, 10, 0);
        assertEquals(valorEsperado, valorActual);
    }
    
    @Test
    public void testNegativos() {
        String valorEsperado = "Los números ordenados de menor a mayor son: -10 -5 -3 0";
        String valorActual = Ordenamiento.evaluar(-3, -10, 0, -5);
        assertEquals(valorEsperado, valorActual);
    }
    
    @Test
    public void testIguales() {
        String valorEsperado = "Los números ordenados de menor a mayor son: 3 3 3 3";
        String valorActual = Ordenamiento.evaluar(3, 3, 3, 3);
        assertEquals(valorEsperado, valorActual);
    }
    
    @Test
    public void testCero() {
        String valorEsperado = "Los números ordenados de menor a mayor son: 0 0 0 0";
        String valorActual = Ordenamiento.evaluar(0, 0, 0, 0);
        assertEquals(valorEsperado, valorActual);
    }
    
    @Test
    public void testUnNegativo() {
        String valorEsperado = "Los números ordenados de menor a mayor son: -5 -1 0 3";
        String valorActual = Ordenamiento.evaluar(3, -5, -1, 0);
        assertEquals(valorEsperado, valorActual);
    }
    
    @Test
    public void testUnPositivo() {
        String valorEsperado = "Los números ordenados de menor a mayor son: 0 1 5 8";
        String valorActual = Ordenamiento.evaluar(8, 5, 1, 0);
        assertEquals(valorEsperado, valorActual);
    }
    
    @Test
    public void testPositivosYNegativos() {
        String valorEsperado = "Los números ordenados de menor a mayor son: -5 0 1 8";
        String valorActual = Ordenamiento.evaluar(1, -5, 8, 0);
        assertEquals(valorEsperado, valorActual);
    }
}
