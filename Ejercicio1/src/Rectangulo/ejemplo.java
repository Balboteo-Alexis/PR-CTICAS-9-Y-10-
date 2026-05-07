package Rectangulo;

/**
 * Representa un rectángulo definido por su {@code alto} y {@code ancho}.
 * <p>
 * Permite calcular el área y el perímetro, con reglas especiales:
 * <ul>
 *   <li>Si {@code alto == 0} o {@code ancho == 0} entonces el resultado es {@code 0}.</li>
 *   <li>Si {@code alto < 0} o {@code ancho < 0} entonces el resultado es {@code -1} (valor inválido).</li>
 * </ul>
 */
public class ejemplo {

    /** Altura del rectángulo. */
    private int alto;

    /** Ancho del rectángulo. */
    private int ancho;

    /**
     * Crea un rectángulo con el alto y ancho indicados.
     *
     * @param alto altura del rectángulo
     * @param ancho ancho del rectángulo
     */
    public ejemplo(int alto, int ancho) {
        this.alto = alto;
        this.ancho = ancho;
    }

    /**
     * Calcula el área del rectángulo.
     * <p>
     * Reglas:
     * <ul>
     *   <li>Área base: {@code alto * ancho}</li>
     *   <li>Si {@code alto == 0} o {@code ancho == 0} devuelve {@code 0}.</li>
     *   <li>Si {@code alto < 0} o {@code ancho < 0} devuelve {@code -1}.</li>
     * </ul>
     *
     * @return el área calculada; {@code 0} si alguna dimensión es 0; {@code -1} si alguna dimensión es negativa
     */
    protected int area() {
        int res;
        res = alto * ancho;

        if (alto == 0 || ancho == 0) res = 0;
        if (alto < 0 || ancho < 0) res = -1;

        return res;
    }

    /**
     * Calcula el perímetro del rectángulo.
     * <p>
     * Reglas:
     * <ul>
     *   <li>Perímetro base: {@code 2 * ancho + 2 * alto}</li>
     *   <li>Si {@code alto < 0} o {@code ancho < 0} devuelve {@code -1}.</li>
     *   <li>Si {@code alto == 0} o {@code ancho == 0} devuelve {@code 0}.</li>
     * </ul>
     *
     * @return el perímetro calculado; {@code 0} si alguna dimensión es 0; {@code -1} si alguna dimensión es negativa
     */
    protected int perimetro() {
        int res;
        res = 2 * ancho + 2 * alto;
        if (alto < 0 || ancho < 0) res = -1;
        if (alto == 0 || ancho == 0) res = 0;

        return res;
    }
}