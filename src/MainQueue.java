public class MainQueue {

    static class Node {
        String data;
        Node next;

        public Node(String data) {
            this.data = data;
        }
    }

    static class Queue {
        Node head, tail;

        public void enqueue(String data) {
            Node newNode = new Node(data);
            if (tail == null) {
                head = tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        public String dequeue() {
            if (head == null) {
                return null;
            }
            String data = head.data;
            head = head.next;
            if (head == null) {
                tail = null;
            }
            return data;
        }

        public String peek() {
            if (head == null) {
                return null;
            }
            return head.data;
        }

        public boolean isEmpty() {
            return head == null;
        }
    }

    public void mainQueue() {
        Queue queue = new Queue();
        queue.enqueue("Java");
        queue.enqueue("DotNet");
        queue.enqueue("PHP");
        queue.enqueue("HTML");

        System.out.println("dequeue: " + queue.dequeue());
        System.out.println("peek: " + queue.peek());
        System.out.println("dequeue: " + queue.dequeue());
        System.out.println("peek: " + queue.peek());
    }

    public static void main(String[] args) {
        new MainQueue().mainQueue();
    }
}
