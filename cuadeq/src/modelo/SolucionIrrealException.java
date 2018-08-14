package modelo;

public class SolucionIrrealException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SolucionIrrealException() {
		super ("La raíz es negativa. por el cual, la solución no es real");
	}

}

