package modelo;

public class DivisionCeroException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DivisionCeroException() {
		super("hay un cero en el denominador. por el cual, la ecuación es indefinida");
	}

}
