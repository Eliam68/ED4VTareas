package org.cuatrovientos.dam.ed.EjerciciosJUnit.Entrega.EjercicioExamen;

import java.util.Iterator;
import java.util.List;

public class Módulos{
	private String nombre;
	private final int totalEntregablesEsperados;
	private final int totalExamenesEsperados;
	private final List<Float> notasEntregables;
	private final List<Float> notasExamenes;

	public Módulos(String nombre, int totalEntregablesEsperados, int totalExamenesEsperados,
			List<Float> notasEntregables, List<Float> notasExamenes) {
		super();
		this.nombre = nombre;
		this.totalEntregablesEsperados = totalEntregablesEsperados;
		this.totalExamenesEsperados = totalExamenesEsperados;
		this.notasEntregables = notasEntregables;
		this.notasExamenes = notasExamenes;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getTotalEntregablesEsperados() {
		return totalEntregablesEsperados;
	}

	public int getTotalExamenesEsperados() {
		return totalExamenesEsperados;
	}

	public List<Float> getNotasEntregables() {
		return notasEntregables;
	}

	public List<Float> getNotasExamenes() {
		return notasExamenes;
	}

	public float NotaModulo() {
		float notaFinal = 0;
		int contador1 = 1;
		int contador2 = 0;
		boolean minimo4Examenes = false;
		float notaTotalExamenes = 0;
		float notaTotalEntregables = 0;
		for (Float float1 : notasEntregables) {
			contador1 += 1;
			notaTotalEntregables += float1;
		}
		for (Float float2 : notasExamenes) {
			contador2 += 1;
			if (float2 < 4) {
				minimo4Examenes = true;
			}
			notaTotalExamenes += float2;
		}
		if (totalEntregablesEsperados < contador1) {
			return notaFinal;
		}
		if (totalExamenesEsperados < contador2) {
			return notaFinal;
		}
		notaTotalEntregables /= totalEntregablesEsperados;
		notaTotalExamenes /= totalExamenesEsperados;
		notaTotalEntregables *= 0.6;
		notaTotalExamenes *= 0.4;
		notaFinal = notaTotalEntregables + notaTotalExamenes;
		if (minimo4Examenes && notaFinal >= 4) {
			notaFinal = 4;
		}
		return notaFinal;
	}
}
