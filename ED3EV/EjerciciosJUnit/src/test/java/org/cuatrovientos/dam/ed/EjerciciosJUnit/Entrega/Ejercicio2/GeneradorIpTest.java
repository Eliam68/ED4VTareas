/**
 * 
 */
package org.cuatrovientos.dam.ed.EjerciciosJUnit.Entrega.Ejercicio2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Se ejecuta el metodo 1000 veces para comprobar si el aleatorio cumple siempre
 * con el objetivo
 */
class GeneradorIpTest {

	GeneradorIp testIp = new GeneradorIp();

	@Test
	void test() {

		char comprobadorChar;
		String comprobadorString;
		for (int i = 0; i < 1000; i++) {
			comprobadorString = testIp.generarIPV4();
			comprobadorChar = comprobadorString.charAt(0);
			if (comprobadorChar == 0) {
				fail("No debería tener un 0 el comienzo de la ip");
			}
			comprobadorChar = comprobadorString.charAt(comprobadorString.length()-1);
			if (comprobadorChar == 0) {
				fail("No debería tener un 0 al final de la ip");
			}
		}
	}
}
