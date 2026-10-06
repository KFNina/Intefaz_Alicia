
package test;

import static org.junit.jupiter.api.Assertions.*;
import Metodo.Persona;
import org.junit.jupiter.api.Test;

class PersonaTest {
	
	@Test
	void determinarUbicacion_true() {
		Persona p1 = new Persona();
		p1.setubicacionAsociada(-5);
		assertEquals(true,p1.determinarUbicacion());
	}
	
	@Test
	void embellecer_true() {
		Persona p1 = new Persona();
		p1.setLocuraPers(70);
		p1.setsecretosPers(100);
		p1.embellecer(20);
		assertEquals(90,p1.getsecretosPers());
	}

	@Test
	void determinarLindo_true() {
		Persona p1 = new Persona();
		p1.setLocuraPers(78);
		p1.setMaximoLocura(100);
		p1.setubicacionAsociada(-5);
		assertEquals(true,p1.determinarLindo());
	}
	
	@Test
	void determinarNormal_true() {
		Persona p1 = new Persona();
		p1.setLocuraPers(8);
		p1.setsecretosPers(540);
		
		assertEquals(true,p1.determinarNormal());
	}
}
