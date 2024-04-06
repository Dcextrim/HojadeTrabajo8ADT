package uvg.edu.gt;

import java.util.PriorityQueue;

/**
 * Clase Factory que proporciona métodos estáticos para crear instancias de VectorHeap y PriorityQueue.
 */
public class PriorityQueueFactory {

    /**
     * Crea una nueva instancia de VectorHeap.
     * @param <E> El tipo de elementos almacenados en el VectorHeap.
     * @return Una nueva instancia de VectorHeap.
     */
    public static <E extends Comparable<E>> VectorHeap<E> VectorHeap() {
        return new VectorHeap<>();
    }

    /**
     * Crea una nueva instancia de PriorityQueue (Java Collection Framework).
     * @param <E> El tipo de elementos almacenados en la PriorityQueue.
     * @return Una nueva instancia de PriorityQueue.
     */
    public static <E extends Comparable<E>> PriorityQueue<E> JavaPriorityQueue() {
        return new PriorityQueue<>();
    }
}
