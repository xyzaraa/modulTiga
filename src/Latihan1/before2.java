package Latihan1;

import java.util.LinkedList;
import java.util.Queue;

public class before2 {

    public void queueExample() {
        Queue qu = new LinkedList();
        qu.add("Java");
        qu.add("DotNet");
        qu.offer("PHP");
        qu.offer("HTML");
        System.out.println("remove: " + qu.remove());
        System.out.println("element: " + qu.element());
        System.out.println("poll: " + qu.poll());
        System.out.println("peek: " + qu.peek());
    }

    public static void main(String[] args) {
        new before2().queueExample();
    }
}
