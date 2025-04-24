package org.cuatrovientos.dam.ed.EjerciciosJUnit.Entrega.Ejercicio2;

import java.util.Random;

public class GeneradorIp {
	Random rnd = new Random();
	private int parte1;
	private int parte2;
	private int parte3;
	private int parte4;

	private void generarNumero(int min, int max) {
		parte1 = rnd.nextInt(min, max+1);
		parte2 = rnd.nextInt(min, max+1);
		parte3 = rnd.nextInt(min, max+1);
		parte4 = rnd.nextInt(min, max+1);
	}

	public String generarIPV4() {
		String resultado = "";
		generarNumero();

		if (parte1 == 0) {
			parte1 += 1;
		}
		if (parte4 == 0) {
			parte4 += 1;
		}

		resultado = parte1 + "." + parte2 + "." + parte3 + "." + parte4;
		return resultado;
		
	}
}
