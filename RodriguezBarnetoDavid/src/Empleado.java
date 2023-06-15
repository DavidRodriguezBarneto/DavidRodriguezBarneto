
public class Empleado {

	private String nombre;
	private int sueldo;
	
	public Empleado ( String nombre, int sueldo) {
		this.sueldo=sueldo;
	}
	

	/**
	 * @return esSUeldoBajo true si el sueldo esta entre 0 y 1200
	 * Metodo que se encarga de comprobar si el sueldo de un empleado es bajo
	 */
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
