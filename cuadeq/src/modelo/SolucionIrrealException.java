package modelo;

public class SolucionIrrealException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SolucionIrrealException() {
		super ("La ra�z es negativa. por el cual, la soluci�n no es real");
	}

}

