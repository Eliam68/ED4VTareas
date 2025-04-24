/**
 * 
 */
package org.cuatrovientos.dam.ed.EjerciciosJUnit.Entrega.EjercicioExamen;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Collections; 
import java.util.List;

import org.junit.jupiter.api.Test;

/**
 * Nos interesa saber que todos los alumnos se aprueban o desaprueban correctamente 
 * y que se inicializan correctamente.
 */
class AlumnosTest {

    /**
     *  Queremos ver si el alumno no tiene módulos, aprueba automáticamente.
     */
    @Test
    void testAprueba_SinModulos() {
        Alumnos a = new Alumnos("Ana", "ana@test.com", Collections.emptyList()); 
        assertEquals("Aprobado enhorabuena", a.aprueba(), "No aprueba automáticamente sin módulos.");
    }

    /**
     * Testea que si todos los módulos tienen nota >= 5 (según NotaModulo ACTUAL), el alumno aprueba.
     */
    @Test
    void testAprueba_TodosModulosAprobados() {
        Módulos m1 = new Módulos("Mates", 3, 2, List.of(8f, 9.5f, 7f), List.of(8.6f, 7.7f)); 
        Módulos m2 = new Módulos("Física", 3, 2, List.of(8f, 7f), List.of(8.6f, 7.7f));    
        Alumnos a = new Alumnos("Benito", "ben@test.com", List.of(m1, m2));
        assertEquals("Aprobado enhorabuena", a.aprueba(), "No aprueba cuando todos los módulos tienen nota >= 5.");
    }

    /**
     * Testea que si un módulo tiene nota < 5 , el alumno NO aprueba.
     */
    @Test
    void testAprueba_UnModuloSuspenso() {
        Módulos m1 = new Módulos("Mates", 3, 2, List.of(8f, 9.5f, 7f), List.of(8.6f, 7.7f)); 
        Módulos m2 = new Módulos("Química", 3, 2, List.of(1f, 1f, 1f), List.of(1f, 1f));   
        Alumnos a = new Alumnos("Carla", "carla@test.com", List.of(m1, m2));
        assertEquals("No apruebas lo siento.", a.aprueba(), "Aprueba incorrectamente .");
    }

    /**
     * Testea que la excepción por email null se lanza al crear el alumno.
     */
    @Test
    void testAprueba_EmailNullConModulos() { 
        Módulos m1 = new Módulos("Mates", 3, 2, List.of(8f, 9.5f, 7f), List.of(8.6f, 7.7f));
        assertThrows(IllegalArgumentException.class, () -> {
            new Alumnos("David", null, List.of(m1)); 
        }, "El constructor no lanza IllegalArgumentException con email null.");
    }

    /**
     * Testea que la excepción por email null se lanza al crear el alumno, incluso sin módulos.
     */
    @Test
    void testAprueba_EmailNullSinModulos() { 
        assertThrows(IllegalArgumentException.class, () -> {
            new Alumnos("Elena", null, Collections.emptyList());
        }, "El constructor no lanza IllegalArgumentException con email null y sin módulos.");
    }

    /**
     * Testea el caso con una lista de módulos vacía.
     */
     @Test
    void testAprueba_ArrayListVacio() {
        Alumnos a = new Alumnos("Fernando", "fer@test.com", new ArrayList<>()); 
        assertEquals("Aprobado enhorabuena", a.aprueba(), "No aprueba con un ArrayList vacío.");
    }

}