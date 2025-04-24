package org.cuatrovientos.dam.ed.EjerciciosJUnit.Entrega.EjercicioExamen;

import java.util.List;

public class Alumnos {
	 private final String nombre;
	    private String email; 
	    protected final List<Módulos> modulos;
	    
		public Alumnos(String nombre, String email, List<Módulos> modulos) {
			super();
			if (email == null) {
	    		throw new IllegalArgumentException("El email del alumno no es válido: " + email);
	    	}
			this.nombre = nombre;
			this.email = email;
			this.modulos = modulos;
		}

	    public String aprueba() {
	    	
	    	if (modulos.isEmpty()) {
				return "Aprobado enhorabuena";
			}
	    	for (Módulos m : modulos) {
				if (m.NotaModulo() < 5) {
					return "No apruebas lo siento.";
				}
			}
			return "Aprobado enhorabuena";
	    }
}