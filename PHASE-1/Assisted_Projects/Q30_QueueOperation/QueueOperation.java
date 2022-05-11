package Ab_Ag_Int;

import java.util.*;

public class QueueOperation {
    public static void main(String[] args) {
        Queue < String > locationsQueue = new LinkedList < > ();
        locationsQueue.add("Kolkata");
        locationsQueue.add("Jamshedpur");
        locationsQueue.add("haryana");
        locationsQueue.add("Pune");
        locationsQueue.add("Howrah");
        System.out.println("Queue is : " + locationsQueue);
        System.out.println("Head of Queue : " + locationsQueue.peek());
        locationsQueue.remove();
        System.out.println("After removing Head of Queue : " + locationsQueue);
        System.out.println("Size of Queue : " + locationsQueue.size());
    }
}