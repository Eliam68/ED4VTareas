/**
 * 
 */
package org.cuatrovientos.dam.ed.EjerciciosJUnit.Entrega.Ejercicio2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Se ejecuta el metodo 1000 veces para comprobar si el aleatorio cumple siempre
 * con el objetivo de que no sea 0 al final o al principio 
 * y que el aleatorio siempre está entre 0 y 254. 
 */
class GeneradorIpTest {

	GeneradorIp testIp = new GeneradorIp();

	@Test
	void testIPv4() {

		String comprobadorString;
		for (int i = 0; i < 1000; i++) {
			comprobadorString = testIp.generarIPV4();
			String[] partes = comprobadorString.split("\\.");
			if (0 == Integer.parseInt(partes[0])) {
				fail("No debería tener un 0 el comienzo de la ip");
			}
			if (0 == Integer.parseInt(partes[3])) {
				fail("No debería tener un 0 al final de la ip");
			}
			//Aquí se comprueba que el generarNúmero cumple siempre. Se que no es llamar al metodo pero es para mantener la coherencia ya que sino tendría que poner que devolviese y no tendría sentido devolver 4 números al generarIPV4. Con hacer un generador valdría.
			for (int j = 0; j < partes.length; j++) {
				assertTrue(Integer.parseInt(partes[j]) >=0 && Integer.parseInt(partes[j]) <= 254);
			}
		}
	}
	
	@Test
	void testGenerarNumero1000_V2() {
		//No me sentía satisfecho con la solución anterior por lo que hice esta otra posible solución.
		for (int i = 0; i < 1000; i++) {
			int comprobador = testIp.generarNumero_V2(0, 254);
			assertTrue(comprobador >=0 && comprobador <= 254);
		}
	}
}
