/**
 * 
 */
package org.cuatrovientos.dam.ed.EjerciciosJUnit.Entrega.EjercicioExamen;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

/**
 * Tests para la clase Módulos, enfocados en el método NotaModulo.
 * NOTA: Estos tests reflejan el comportamiento ACTUAL del código (v2),
 * incluyendo los bugs restantes (cálculo de medias, exámenes exactos, regla examen < 4).
 */
class MódulosTest {

    /**
     * Aquí queremos comprobar que si se pone todo correcto salga la nota correcta.
     */
    @Test
    void testNotaModulo() {
        Módulos M = new Módulos("Mates", 3, 2, List.of(8f, 9.5f, 7f), List.of(8.6f, 7.7f));
        float factor = 100.0f;
        float actual = Math.round(M.NotaModulo() * factor) / factor;
        assertEquals(8.16f, actual, "No salen las notas como deberían.");
    }

    /**
     * Aquí quiero ver si sin entregar uno sigue funcionando.
     */
    @Test
    void testNoUnEntregable() {
        Módulos M = new Módulos("Mates", 3, 2, List.of(8f, 7f), List.of(8.6f, 7.7f));
        float factor = 100.0f;
        float actual = Math.round(M.NotaModulo() * factor) / factor;
        assertEquals(6.26f, actual, "No salen las notas como deberían. En uno no entregado.");
    }

    /**
     * Aquí quiero ver si sin entregar lo suficiente sale 0.
     */
    @Test
    void testNoEntregable() {
        Módulos M = new Módulos("Mates", 3, 2, List.of(7f), List.of(8.6f, 7.7f));
        float factor = 100.0f;
        float actual = Math.round(M.NotaModulo() * factor) / factor;
        assertEquals(0f, actual, "No devuelve 0 cuando no se cumple el mínimo de entregables.");
    }

    /**
     * Aquí quiero ver que si no se entrega el número exacto de exámenes la nota sea 0.
     */
    @Test
    void testFaltanExamenes() {
        Módulos M = new Módulos("Mates", 3, 2, List.of(8f, 9f, 7f), List.of(8.6f)); // Solo 1 examen
        float factor = 100.0f;
        float actual = Math.round(M.NotaModulo() * factor) / factor;
        assertEquals(0f, actual, "No devuelve 0");
    }
    
    /**
     * Queremos ver si al entregar más exámenes de los esperados, la nota es 0.
     */
    @Test
    void testSobranExamenes() {
        Módulos M = new Módulos("Mates", 3, 2, List.of(8f, 9f, 7f), List.of(8.6f, 7.7f, 9.0f)); // 3 exámenes
        float factor = 100.0f;
        float actual = Math.round(M.NotaModulo() * factor) / factor;
        assertEquals(0f, actual, "No devuelve 0 cuando sobran exámenes.");
    }


    /**
     * Queremos ver si la regla de examen < 4 implementada actualmente impide que salga más nota.
     */
    @Test
    void testExamenMenorQue4NotaMayorIgual4() {
        Módulos M = new Módulos("Mates", 3, 2, List.of(6f, 6f, 6f), List.of(3f, 9f));
        float factor = 100.0f;
        float actual = Math.round(M.NotaModulo() * factor) / factor;
        assertEquals(4f, actual, "No está limitando a 4");
    }

    /**
     * Ahora lo contrario deberia salir la nota actual 1 y no 0.
     */
    @Test
    void testExamenMenorQue4NotaMenorQue4() {
        Módulos M = new Módulos("Mates", 3, 2, List.of(1f, 1f, 1f), List.of(1f, 1f));
        float factor = 100.0f;
        float actual = Math.round(M.NotaModulo() * factor) / factor;
        assertEquals(1.0f, actual,"No sale la nota esperada.");
    }
}