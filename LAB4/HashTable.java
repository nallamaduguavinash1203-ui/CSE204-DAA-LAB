import java.util.Arrays;

class HashTable {

    static final int SIZE = 10;
    int[] table = new int[SIZE];

    HashTable() {
        Arrays.fill(table, -1);
    }

    // Insert an element
    void insert(int key) {
        int index = key % SIZE;
        int start = index;

        while (table[index] != -1) {
            index = (index + 1) % SIZE;

            if (index == start) {
                System.out.println("Hash table is full");
                return;
            }
        }

        table[index] = key;
    }

    // Search an element
    int search(int key) {
        int index = key % SIZE;
        int start = index;

        while (table[index] != -1) {

            if (table[index] == key)
                return index;

            index = (index + 1) % SIZE;

            if (index == start)
                break;
        }

        return -1;
    }

    // Display hash table
    void display() {
        for (int i = 0; i < SIZE; i++) {
            System.out.println(i + " : " + table[i]);
        }
    }

    public static void main(String[] args) {

        HashTable h = new HashTable();

        h.insert(10);
        h.insert(20);
        h.insert(25);
        h.insert(35);
        h.insert(15);

        h.display();

        int result = h.search(25);

        if (result != -1)
            System.out.println("25 found at index " + result);
        else
            System.out.println("25 not found");
    }
}