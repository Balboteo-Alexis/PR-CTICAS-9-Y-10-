package Rectangulo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Pruebas unitarias (JUnit 5) para la clase {@link ejemplo}.
 * <p>
 * Se verifican tres escenarios principales:
 * <ul>
 *   <li>Dimensiones positivas: se comprueba que el área y el perímetro sean correctos.</li>
 *   <li>Dimensiones negativas: se comprueba que los métodos devuelvan {@code -1}.</li>
 *   <li>Dimensiones con cero: se comprueba que los métodos devuelvan {@code 0}.</li>
 * </ul>
 */
class testEjemplo {

    /**
     * Prueba el caso normal con valores positivos.
     * <p>
     * Para {@code alto=10} y {@code ancho=4}:
     * <ul>
     *   <li>Área esperada: {@code 10 * 4 = 40}</li>
     *   <li>Perímetro esperado: {@code 2*10 + 2*4 = 28}</li>
     * </ul>
     */
    @Test
    void valoresPositivos() {
        ejemplo r = new ejemplo(10, 4);

        assertAll(
            () -> assertEquals(40, r.area()),
            () -> assertEquals(28, r.perimetro())
        );
    }

    /**
     * Prueba dimensiones negativas (alto y/o ancho).
     * <p>
     * Según la lógica de {@link ejemplo#area()} y {@link ejemplo#perimetro()},
     * si {@code alto < 0} o {@code ancho < 0} el resultado debe ser {@code -1}.
     */
    @Test
    void valoresNegativos() {
        ejemplo r1 = new ejemplo(-10, 4);   // alto negativo
        ejemplo r2 = new ejemplo(10, -4);   // ancho negativo
        ejemplo r3 = new ejemplo(-10, -4);  // ambos negativos

        assertAll(
            () -> assertEquals(-1, r1.area()),
            () -> assertEquals(-1, r1.perimetro()),

            () -> assertEquals(-1, r2.area()),
            () -> assertEquals(-1, r2.perimetro()),

            () -> assertEquals(-1, r3.area()),
            () -> assertEquals(-1, r3.perimetro())
        );
    }

    /**
     * Prueba dimensiones iguales a cero.
     * <p>
     * Según la lógica de {@link ejemplo#area()} y {@link ejemplo#perimetro()},
     * si {@code alto == 0} o {@code ancho == 0} el resultado debe ser {@code 0}.
     * <p>
     * Nota: al final se incluye una aserción marcada como "errónea" a propósito
     * (para demostrar un test que debe fallar).
     */
    @Test
    void valoresCero() {
        ejemplo r1 = new ejemplo(0, 4);   // alto cero
        ejemplo r2 = new ejemplo(10, 0);  // ancho cero
        ejemplo r3 = new ejemplo(0, 0);   // ambos cero

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