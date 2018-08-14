package modelo;

public class Ecuacion {
	
	private double a;
	private double b;
	private double c;
	private double d;
	private double x1;
	private double x2;
	
	public Ecuacion(double p_a,double p_b,double p_c) {
		this.a = p_a;
		this.b = p_b;
		this.c = p_c;
		this.d = 0;
		this.x1 = 0;
		this.x2 = 0;
	}
	
	public void resolver() throws SolucionIrrealException,DivisionCeroException {
		
		this.d = Math.pow(this.b, 2) - 4*this.a*this.c;
		System.out.println("El valor de la raíz es " + this.d);
		if(this.d < 0) {
			throw new SolucionIrrealException();
		} else if(a == 0) {
			
			throw new DivisionCeroException();
		}else {
			this.x1 = (-b + Math.sqrt(this.d)) /2*this.a;
			this.x2 = (-b - Math.sqrt(this.d)) /2*this.a;
			
			System.out.println("la solucion es :\nX1= "+x1+"\nX2= "+x2);
		}
		
		
	}

}
