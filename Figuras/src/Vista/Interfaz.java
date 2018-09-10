package Vista;

import javax.swing.JOptionPane;

public class Interfaz {

	public Interfaz() 
	{
		// TODO Auto-generated constructor stub
		
	}

	/* metodo de prueba que pide un dato por JOptionPane y retorna el String correspondiente
	 * Reemplazar por lo que se necesiten
	 */
	
	public String pedirArea() 
	{
		return (JOptionPane.showInputDialog(null, "Ingrese Area", "Titulo"));
	}
	public String pedirRadio() {
		return JOptionPane.showInputDialog(null,"Ingrese radio","Titulo");
	}
	
	
	/* metodo de prueba que imprime un dato procesado por un método declarado en 
	 * Reemplazar por lo que se necesiten
	 */

	public void imprimir(String figura, double area, double perimetro) {
		String cadena = "";
		cadena = "el area es "+area+"\n"; 
		cadena = cadena+"el perimetro es: "+perimetro+"\n";
		escribir(cadena,figura);
	}
	public void escribir(String dato,String titulo) {
		JOptionPane.showMessageDialog(null, dato, titulo, JOptionPane.INFORMATION_MESSAGE);
	}
	
	
}
