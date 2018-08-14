package controlador;

import modelo.DivisionCeroException;
import modelo.Ecuacion;
import modelo.SolucionIrrealException;

public class Controlador {
	
	Ecuacion eq = new Ecuacion(9.67, 5.789, 2.890);
	
	public Controlador() throws SolucionIrrealException, DivisionCeroException {
		resolverEcuacion();
	}
	
	public void resolverEcuacion() throws SolucionIrrealException,DivisionCeroException {
		
		try {
			eq.resolver();
		} catch(SolucionIrrealException e) {
			throw new SolucionIrrealException();
		
		} catch(DivisionCeroException d) {
			throw new DivisionCeroException();
		}
	}

}
