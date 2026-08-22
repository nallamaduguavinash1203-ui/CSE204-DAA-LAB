class Queue {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    Node front = null;
    Node rear = null;

    void enqueue(int data) {
        Node newNode = new Node(data);

        if (rear == null)
            front = rear = newNode;
        else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    void dequeue() {
        if (front == null) {
            System.out.println("Queue is Empty");
            return;
        }

        System.out.println("Deleted: " + front.data);
        front = front.next;

        if (front == null)
            rear = null;
    }

    void peek() {
        if (front == null)
            System.out.println("Queue is Empty");
        else
            System.out.println("Front: " + front.data);
    }

    void display() {
        Node temp = front;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Queue q = new Queue();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);

        System.out.print("Queue: ");
        q.display();

        q.dequeue();
        q.dequeue();

        System.out.print("After two dequeue: ");
        q.display();

        q.enqueue(60);
        q.enqueue(70);

        System.out.print("After enqueue 60, 70: ");
        q.display();

        q.peek();
    }
}