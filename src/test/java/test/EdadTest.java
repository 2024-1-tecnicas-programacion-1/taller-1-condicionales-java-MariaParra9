package test;

import ejercicios.Edad;
import ejercicios.SetDeTenis;
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
public class EdadTest {
    @Test
    public void testCumpleañosHoy() {
        String valorEsperado = "Usted acaba de cumplir 18 años";
        String valorActual = Edad.evaluar(11, 3, 2006); // Se debe reemplazar con la fecha actual para la prueba
        assertEquals(valorEsperado, valorActual);
    }
    
    @Test
    public void testCumpleañosPasado() {
        String valorEsperado = "Cumpliste 30 años";
        String valorActual = Edad.evaluar(5, 2, 1992); // Se debe reemplazar con la fecha actual para la prueba
        assertEquals(valorEsperado, valorActual);
    }
    
    @Test
    public void testCumpleañosFuturo() {
        String valorEsperado = "Vas a cumplir 25 años";
        String valorActual = Edad.evaluar(25, 6, 2022); // Se debe reemplazar con la fecha actual para la prueba
        assertEquals(valorEsperado, valorActual);
    }
    
    @Test
    public void testCumpleañosHoySinCumpleaños() {
        String valorEsperado = "Usted tiene 40 años";
        String valorActual = Edad.evaluar(11, 3, 1982); // Se debe reemplazar con la fecha actual para la prueba
        assertEquals(valorEsperado, valorActual);
    }
    
    @Test
    public void testCumpleañosPasadoSinCumpleaños() {
        String valorEsperado = "Usted tiene 35 años";
        String valorActual = Edad.evaluar(5, 2, 1987); // Se debe reemplazar con la fecha actual para la prueba
        assertEquals(valorEsperado, valorActual);
    }
}
