class Stack {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    Node top = null;

    void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }

    void pop() {
        if (top == null) {
            System.out.println("Stack Underflow");
            return;
        }

        System.out.println("Popped: " + top.data);
        top = top.next;
    }

    void peek() {
        if (top == null)
            System.out.println("Stack is Empty");
        else
            System.out.println("Top: " + top.data);
    }

    void display() {
        Node temp = top;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Stack s = new Stack();

        s.push(10);
        s.push(20);
        s.push(30);
        s.push(50);


        System.out.print("Stack: ");
        s.display();
         s.pop();

        System.out.print("After pop: ");
        s.display();
          s.push(70);

        s.peek();
      

        s.pop();

        System.out.print("After pop: ");
        s.display();
    }
}