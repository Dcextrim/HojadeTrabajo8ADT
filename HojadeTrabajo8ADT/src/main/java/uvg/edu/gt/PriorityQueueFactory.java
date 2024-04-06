package uvg.edu.gt;

import java.util.PriorityQueue;

public class PriorityQueueFactory {

    public static <E extends Comparable<E>> VectorHeap<E> VectorHeap() {
        return new VectorHeap<>();
    }

    public static <E extends Comparable<E>> PriorityQueue<E> JavaPriorityQueue() {
        return new PriorityQueue<>();
    }
}
