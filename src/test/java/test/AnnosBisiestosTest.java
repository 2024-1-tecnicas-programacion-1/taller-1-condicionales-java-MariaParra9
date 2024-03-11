package test;

import ejercicios.AnnosBisiestos;
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
public class AnnosBisiestosTest {
    @Test
    public void test1988() {
        String valorEsperado = "1988 es bisiesto";
        String valorActual = AnnosBisiestos.evaluar(1988);
        assertEquals(valorEsperado, valorActual);
    }
    
    @Test
    public void test1600() {
        String valorEsperado = "1600 es bisiesto";
        String valorActual = AnnosBisiestos.evaluar(1600);
        assertEquals(valorEsperado, valorActual);
    }
    
    @Test
    public void test1700() {
        String valorEsperado = "1700 no es bisiesto";
        String valorActual = AnnosBisiestos.evaluar(1700);
        assertEquals(valorEsperado, valorActual);
    }
    
    @Test
    public void test1800() {
        String valorEsperado = "1800 no es bisiesto";
        String valorActual = AnnosBisiestos.evaluar(1800);
        assertEquals(valorEsperado, valorActual);
    }
    
    @Test
    public void test1900() {
        String valorEsperado = "1900 no es bisiesto";
        String valorActual = AnnosBisiestos.evaluar(1900);
        assertEquals(valorEsperado, valorActual);
    }
    
    @Test
    public void test2000() {
        String valorEsperado = "2000 es bisiesto";
        String valorActual = AnnosBisiestos.evaluar(2000);
        assertEquals(valorEsperado, valorActual);
    }
    
    @Test
    public void test2012() {
        String valorEsperado = "2012 es bisiesto";
        String valorActual = AnnosBisiestos.evaluar(2012);
        assertEquals(valorEsperado, valorActual);
    }
    
    @Test
    public void test2019() {
        String valorEsperado = "2019 no es bisiesto";
        String valorActual = AnnosBisiestos.evaluar(2019);
        assertEquals(valorEsperado, valorActual);
    }
    
    @Test
    public void test2020() {
        String valorEsperado = "2020 es bisiesto";
        String valorActual = AnnosBisiestos.evaluar(2020);
        assertEquals(valorEsperado, valorActual);
    }
    
    @Test
    public void test2100() {
        String valorEsperado = "2100 no es bisiesto";
        String valorActual = AnnosBisiestos.evaluar(2100);
        assertEquals(valorEsperado, valorActual);
    }
    
    @Test
    public void test2400() {
        String valorEsperado = "2400 es bisiesto";
        String valorActual = AnnosBisiestos.evaluar(2400);
        assertEquals(valorEsperado, valorActual);
    }
}
