package uvg.edu.gt;


import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;
import static org.junit.Assert.*;

public class VectorHeapTest {

    @Test
    public void testAgregarYAtenderSiguiente() {
        VectorHeap<Paciente> colaEmergencias = new VectorHeap<>();
        Paciente p1 = new Paciente("Pelon1", "Tos", 'F');
        Paciente p2 = new Paciente("Pelon2", "fractura de craneo", 'A');
        colaEmergencias.agregar(p1);
        colaEmergencias.agregar(p2);
        assertEquals("Pelon2", colaEmergencias.atenderSiguiente().getNombre());
        assertEquals("Pelon1", colaEmergencias.atenderSiguiente().getNombre());
    }

    @Test
    public void testSiguiente() {
        VectorHeap<Paciente> colaEmergencias = new VectorHeap<>();
        Paciente p1 = new Paciente("Pelon1", "Tos", 'F');
        Paciente p2 = new Paciente("Pelon2", "Fractura de Cráneo", 'A');
        colaEmergencias.agregar(p1);
        colaEmergencias.agregar(p2);
        assertEquals("Pelon2", colaEmergencias.siguiente().getNombre());
    }

    @Test
    public void testEstaVacio() {
        VectorHeap<Paciente> colaEmergencias = new VectorHeap<>();
        assertTrue(colaEmergencias.estaVacio());
        Paciente p1 = new Paciente("Pelon1", "Tos", 'F');
        colaEmergencias.agregar(p1);
        assertFalse(colaEmergencias.estaVacio());
    }
}

