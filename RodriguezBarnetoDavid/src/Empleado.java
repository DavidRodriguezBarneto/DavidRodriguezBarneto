
public class Empleado {

	private String nombre;
	private int sueldo;
	
	public Empleado ( String nombre, int sueldo) {
		this.sueldo=sueldo;
	}
	

	public boolean tieneSueldoBajo() {
		boolean esSueldoBajo=false;
		if (sueldo >= 0 && sueldo <= 1200) {
			esSueldoBajo=true;
		}
		return esSueldoBajo;
	}
	
	public boolean tieneSueldoAlto() {
		boolean esSueldoAlto=false;
		if (sueldo > 3000) {
			esSueldoAlto=true;
		}
		return esSueldoAlto;
	}
}
