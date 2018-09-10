package Modelo;

public class Cuadrado implements Figura{
	
	private double lado;

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return this.lado*this.lado;
	}

	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return 4*this.lado;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}
	
	

}
