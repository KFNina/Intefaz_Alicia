package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import Metodo.Mundo;
import Metodo.Persona;

class MundoTest {
	Persona nico = new Persona(8,540,200,30);
	Persona josue = new Persona(180,30,200,-9);
	Persona eze = new Persona(120,30,200,-19);
	Persona facu = new Persona(8,540,200,30);
	Persona norman = new Persona(180,30,200,-9);
	Mundo mundo = new Mundo();
	
	
	@Test
	void cuantosPersonajesLindosTest() {
		mundo.agregarPersona(josue);
		mundo.agregarPersona(norman);
		mundo.agregarPersona(nico);
		
		assertEquals(2, mundo.personajeLindo());
	}

	@Test
	void personajesNormalesTest() {
		mundo.agregarPersona(facu);
		mundo.agregarPersona(eze);
		mundo.agregarPersona(nico);
		mundo.agregarPersona(nico);
		
		assertEquals(3,mundo.personajeNormal().size());
	}
	
	@Test
	void personajesLindoQueNormalesTest() {
		mundo.agregarPersona(josue);
		mundo.agregarPersona(norman);
		mundo.agregarPersona(josue);
		mundo.agregarPersona(norman);
		mundo.agregarPersona(nico);
		mundo.agregarPersona(facu);
		mundo.agregarPersona(eze);
		
		assertEquals(true, mundo.personajesLindosNormales());
	}
	
	@Test
	void personajeConMasLocuraTest() {
		mundo.agregarPersona(josue);
		mundo.agregarPersona(norman);
		mundo.agregarPersona(nico);
		mundo.agregarPersona(facu);
		mundo.agregarPersona(eze);
		
		assertEquals(norman, mundo.personajeConMayorLocura());
	}
}
