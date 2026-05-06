package Rectangulo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testEjemplo {

    @Test
    void valoresPositivos() {
        ejemplo r = new ejemplo(10, 4);

        assertAll(
            () -> assertEquals(40, r.area()),
            () -> assertEquals(28, r.perimetro())
        );
    }

    @Test
    void valoresNegativos() {
        ejemplo r1 = new ejemplo(-10, 4); // alto negativo
        ejemplo r2 = new ejemplo(10, -4); // ancho negativo
        ejemplo r3 = new ejemplo(-10, -4); // ambos negativos

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
        ejemplo r1 = new ejemplo(0, 4);  // alto cero
        ejemplo r2 = new ejemplo(10, 0); // ancho cero
        ejemplo r3 = new ejemplo(0, 0);  // ambos cero

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