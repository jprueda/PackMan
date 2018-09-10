package Modelo;

public class Circulo implements Figura {
	
	private double radio;
	

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return Math.PI*this.radio*this.radio;
	}

	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return 2*Math.PI*this.radio;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}
	

}
