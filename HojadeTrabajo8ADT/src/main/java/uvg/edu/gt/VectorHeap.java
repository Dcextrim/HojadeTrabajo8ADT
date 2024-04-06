package uvg.edu.gt;

import java.util.PriorityQueue;

/**
 * Clase que implementa una cola de prioridad basada en un heap utilizando una PriorityQueue subyacente.
 * @param <E> El tipo de elementos almacenados en la cola de prioridad.
 */
class VectorHeap<E extends Comparable<E>> {
    private PriorityQueue<E> queue;

    /**
     * Constructor que inicializa la PriorityQueue subyacente.
     */
    public VectorHeap() {
        queue = new PriorityQueue<>();
    }

    /**
     * Agrega un elemento a la cola de prioridad.
     * @param elemento El elemento a agregar.
     */
    public void agregar(E elemento) {
        queue.offer(elemento);
    }

    /**
     * Obtiene el siguiente elemento que será atendido sin eliminarlo de la cola.
     * @return El siguiente elemento en la cola de prioridad.
     */
    public E siguiente() {
        return queue.peek();
    }

    /**
     * Remueve y devuelve el siguiente elemento en la cola de prioridad.
     * @return El siguiente elemento en la cola de prioridad.
     */
    public E atenderSiguiente() {
        return queue.poll();
    }

    /**
     * Verifica si la cola de prioridad está vacía.
     * @return true si la cola está vacía, false si contiene elementos.
     */
    public boolean estaVacio() {
        return queue.isEmpty();
    }
}
