package test;

import ejercicios.IMC;
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
public class IMCTest {
    @Test
    public void testBajoMenor45IMCmenor22() {
        String valorEsperado = "Bajo";
        String valorActual = IMC.evaluar(50, 1.8, 20);
        assertEquals(valorEsperado.toLowerCase(), valorActual.toLowerCase());
    }
    
    @Test
    public void testMedioMenor45IMCmayorIgual22() {
        String valorEsperado = "Medio";
        String valorActual = IMC.evaluar(70, 1.75, 30);
        assertEquals(valorEsperado.toLowerCase(), valorActual.toLowerCase());
    }
    
    @Test
    public void testMedioMayorIgual45IMCmenor22() {
        String valorEsperado = "Medio";
        String valorActual = IMC.evaluar(65, 1.7, 50);
        assertEquals(valorEsperado.toLowerCase(), valorActual.toLowerCase());
    }
    
    @Test
    public void testAltoMayorIgual45IMCmayorIgual22() {
        String valorEsperado = "Alto";
        String valorActual = IMC.evaluar(80, 1.65, 60);
        assertEquals(valorEsperado.toLowerCase(), valorActual.toLowerCase());
    }
    
    @Test
    public void testBajoMayor45IMCmenor22() {
        String valorEsperado = "Bajo";
        String valorActual = IMC.evaluar(55, 1.75, 46);
        assertEquals(valorEsperado.toLowerCase(), valorActual.toLowerCase());
    }
    
    @Test
    public void testMedioMayor45IMCmayorIgual22() {
        String valorEsperado = "Medio";
        String valorActual = IMC.evaluar(70, 1.65, 55);
        assertEquals(valorEsperado.toLowerCase(), valorActual.toLowerCase());
    }
    
    @Test
    public void testMedioMenor45IMCmenor22() {
        String valorEsperado = "Medio";
        String valorActual = IMC.evaluar(60, 1.7, 40);
        assertEquals(valorEsperado.toLowerCase(), valorActual.toLowerCase());
    }
    
    @Test
    public void testAltoMenor45IMCmayorIgual22() {
        String valorEsperado = "Alto";
        String valorActual = IMC.evaluar(75, 1.8, 35);
        assertEquals(valorEsperado.toLowerCase(), valorActual.toLowerCase());
    }
    
    @Test
    public void testAltoMayor45IMCmayorIgual22() {
        String valorEsperado = "Alto";
        String valorActual = IMC.evaluar(90, 1.7, 50);
        assertEquals(valorEsperado.toLowerCase(), valorActual.toLowerCase());
    }
    
    @Test
    public void testAltoMayor45IMCmenor22() {
        String valorEsperado = "Medio";
        String valorActual = IMC.evaluar(80, 1.65, 55);
        assertEquals(valorEsperado.toLowerCase(), valorActual.toLowerCase());
    }
}
