package Controlador;

import Modelo.Mundo;
import Vista.Interfaz;

public class Controlador {

	//Atributos que vienen del Modelo (mundo) 
	private Mundo bd;
	
	//Atributos que vienen de Vista
	private Interfaz gui;
	
	public Controlador() {

		//aqui van los constructores tanto de Mundo, como de Vista
		
		bd = new Mundo();
		gui = new Interfaz();

		//aqui van los métodos que se invocan de Modelo (Mundo) y de Vista y que ejecutarán el programa.
		bd.getCl().setRadio(Double.parseDouble(gui.pedirRadio()));
		bd.getC().setLado(Double.parseDouble(gui.pedirArea()));
		bd.getC().area();
		bd.getCl().area();
		bd.getC().perimetro();
		bd.getCl().perimetro();
		gui.imprimir("Circulo", bd.getCl().area(), bd.getCl().perimetro());
		gui.imprimir("cuadrado", bd.getC().area(), bd.getC().perimetro());
	}

}
