package org.cuatrovientos.dam.ed.EjerciciosJUnit.Entrega.Ejercicio2;

import java.lang.reflect.UndeclaredThrowableException;
import java.util.Random;

public class GeneradorIp {
	Random rnd = new Random();
	private int parte1;
	private int parte2;
	private int parte3;
	private int parte4;

	private void generarNumero(int min, int max) {
		if (min >= max) {
			throw new IllegalArgumentException("No puede ser el minimo mayor o igual al máximo");
		}
		parte1 = rnd.nextInt(min, max + 1);
		parte2 = rnd.nextInt(min, max + 1);
		parte3 = rnd.nextInt(min, max + 1);
		parte4 = rnd.nextInt(min, max + 1);
	}

	public String generarIPV4() {
		String resultado = "";

		// Aquí entiendo que lo de cambiar el máximo y el mínimo es desde aquí ¿O es el
		// propio usuario?
		generarNumero(0, 254);
//Aquí pense en si te referias a 0 como o 0 a cualquiero 0 como 10,20 etc entiendo que es solo 0.
		if (parte1 == 0) {
			parte1 += 1;
		}
		if (parte4 == 0) {
			parte4 += 1;
		}

		resultado = parte1 + "." + parte2 + "." + parte3 + "." + parte4;
		return resultado;

	}

	public int generarNumero_V2(int min, int max) {
		if (min >= max) {
			throw new IllegalArgumentException("No puede ser el minimo mayor o igual al máximo");
		}
		return rnd.nextInt(min, max + 1);
	}

	public String generarIPV4_V2() {
		String resultado = "";

		int parte1_V2 = generarNumero_V2(0, 254);
		int parte2_V2 = generarNumero_V2(0, 254);
		int parte3_V2 = generarNumero_V2(0, 254);
		int parte4_V2 = generarNumero_V2(0, 254);

		if (parte1_V2 == 0) {
			parte1_V2 += 1;
		}
		if (parte4_V2== 0) {
			parte4_V2 += 1;
		}

		resultado = parte1_V2 + "." + parte2_V2 + "." + parte3_V2 + "." + parte4_V2;
		return resultado;

	}
}
