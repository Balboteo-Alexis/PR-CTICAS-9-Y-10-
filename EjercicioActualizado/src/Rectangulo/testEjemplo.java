package Rectangulo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testEjemplo {

    @Test
    void valoresPositivos() {
    	rectangle r = new rectangle(10, 4);

        assertAll(
            () -> assertEquals(40, r.area()),
            () -> assertEquals(28, r.perimetro())
        );
    }

    @Test
    void valoresNegativos() {
    	rectangle r1 = new rectangle(-10, 4); // alto negativo
    	rectangle r2 = new rectangle(10, -4); // ancho negativo
    	rectangle r3 = new rectangle(-10, -4); // ambos negativos

        assertAll(
            () -> assertEquals(-1, r1.area()),
            () -> assertEquals(-1, r1.perimetro()),

            () -> assertEquals(-1, r2.area()),
            () -> assertEquals(-1, r2.perimetro()),

            () -> assertEquals(-1, r3.area()),
            () -> assertEquals(-1, r3.perimetro())
        );
    }

    @Test
    void valoresCero() {
    	rectangle r1 = new rectangle(0, 4);  // alto cero
    	rectangle r2 = new rectangle(10, 0); // ancho cero
    	rectangle r3 = new rectangle(0, 0);  // ambos cero

        assertAll(
            () -> assertEquals(0, r1.area()),
            () -> assertEquals(0, r1.perimetro()),

            () -> assertEquals(0, r2.area()),
            () -> assertEquals(0, r2.perimetro()),

            () -> assertEquals(0, r3.area()),
            () -> assertEquals(0, r3.perimetro()),
            
            
            
            // Aserción ERRÓNEA (debería fallar): si hay un 0 el perímetro debe ser 0, no 28
            () -> assertEquals(28, r1.perimetro())
            
            
            
        
        );
        
    }
}