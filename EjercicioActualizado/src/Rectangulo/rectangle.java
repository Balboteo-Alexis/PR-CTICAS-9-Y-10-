package Rectangulo;

public class rectangle {

    private int alto;
    private int ancho;

    /**
     * @param alto
     * @param ancho
     */
    
    public rectangle(int alto, int ancho) {
        this.alto = alto;
        this.ancho = ancho;
    }

    public int surface() {
        return area();
    }

	protected int area() {
		int res;
        res = alto * ancho;

        if (alto == 0 || ancho == 0) res = 0;
        if (alto < 0 || ancho < 0) res = -1;

        return res;
	}

	
	
    public int perimeter() {
    	return perimetro();
    }

  
	protected int perimetro() {
		int res ;
    	res = 2 * ancho + 2 * alto;
        if (alto < 0 || ancho < 0) res =  -1;
        if (alto == 0 || ancho == 0) res =  0;
        
        return res;
	}
}