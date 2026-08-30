import java.util.Arrays;

class HashTableQ {

    static final int SIZE = 10;
    int[] table = new int[SIZE];

    // Constructor
    HashTableQ() {
        Arrays.fill(table, -1);
    }

    // Insert using Quadratic Probing
    void insert(int key) {

        int hash = key % SIZE;

        for (int i = 0; i < SIZE; i++) {

            int index = (hash + i * i) % SIZE;

            if (table[index] == -1) {
                table[index] = key;
                return;
            }
        }

        System.out.println("Hash table is full");
    }

    // Search using Quadratic Probing
    int search(int key) {

        int hash = key % SIZE;

        for (int i = 0; i < SIZE; i++) {

            int index = (hash + i * i) % SIZE;

            if (table[index] == -1)
                return -1;

            if (table[index] == key)
                return index;
        }

        return -1;
    }

    // Display
    void display() {

        for (int i = 0; i < SIZE; i++) {
            System.out.println(i + " : " + table[i]);
        }
    }

    public static void main(String[] args) {

        HashTableQ h = new HashTableQ();

        h.insert(10);
        h.insert(20);
        h.insert(30);
        h.insert(25);
        h.insert(35);

        h.display();

        int result = h.search(35);

        if (result != -1)
            System.out.println("35 found at index " + result);
        else
            System.out.println("35 not found");
    }
}