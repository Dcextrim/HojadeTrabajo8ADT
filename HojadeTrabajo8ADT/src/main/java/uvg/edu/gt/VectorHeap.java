package uvg.edu.gt;

import java.util.PriorityQueue;

class VectorHeap<E extends Comparable<E>> {
    private PriorityQueue<E> queue;

    public VectorHeap() {
        queue = new PriorityQueue<>();
    }

    public void agregar(E elemento) {
        queue.offer(elemento);
    }

    public E siguiente() {
        return queue.peek();
    }

    public E atenderSiguiente() {
        return queue.poll();
    }

    public boolean estaVacio() {
        return queue.isEmpty();
    }
}
