import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class EmpleadoTest {

	@ParameterizedTest
	@ValueSource(ints = { 1200, 0 })
	public void testTieneSueldoBajo(int sueldo) {
		Empleado empleado1 = new Empleado("Pepe", sueldo);
		assertEquals(true, empleado1.tieneSueldoBajo());
	}
	
	@Test
	public void testTieneSueldoBajo() {
		Empleado empleado2 = new Empleado("Maria", 1100);
		Empleado empleado3 = new Empleado("David", 3500);
		
		assertEquals(true, empleado2.tieneSueldoBajo());
		assertFalse(empleado3.tieneSueldoBajo());
	}

	@ParameterizedTest
	@ValueSource(ints = { 3001, 4000, 5000 })
	public void testTieneSueldoAlto(int sueldo) {
		Empleado empleado4 = new Empleado("Jorge", sueldo);
		assertTrue(empleado4.tieneSueldoAlto());
	}

	@Test
	public void testTieneSueldoAlto() {
		Empleado empleado5 = new Empleado("Jose", 4000);
		Empleado empleado6 = new Empleado("Ramon", 2100);

		assertTrue(empleado5.tieneSueldoAlto());
		assertFalse(empleado6.tieneSueldoAlto());
	}

}
