package controlador;

import modelo.DivisionCeroException;
import modelo.SolucionIrrealException;

public class Principal {
	
	public static void main(String[] args) {
		try {
		Controlador c =new Controlador();
		} 
		catch (SolucionIrrealException e) {
			System.out.println("Se ha producido la excepcion "+ e.toString());
		}catch(DivisionCeroException d) {
			System.out.println("Se ha producido la excepcion "+ d.toString());
		}
	}

}
