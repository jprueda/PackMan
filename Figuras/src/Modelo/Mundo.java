package Modelo;

import Modelo.Circulo;
import Modelo.Cuadrado;

public class Mundo {
	private Cuadrado c;
	private Circulo cl;
	
	public Mundo() {
		c = new Cuadrado();
		cl = new Circulo();
	}

	public Cuadrado getC() {
		return c;
	}

	public void setC(Cuadrado c) {
		this.c = c;
	}

	public Circulo getCl() {
		return cl;
	}

	public void setCl(Circulo cl) {
		this.cl = cl;
	}
	
	
	

}
