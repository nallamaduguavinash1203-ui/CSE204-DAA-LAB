class Frequency {

    static final int SIZE = 100;
    static int[] hashTable = new int[SIZE];
    static int[] frequency = new int[SIZE];

    static void initialize() {
        for (int i = 0; i < SIZE; i++) {
            hashTable[i] = -1;
            frequency[i] = 0;
        }
    }

    static int findIndex(int key) {

        int index = key % SIZE;

        if (index < 0)
            index += SIZE;

        while (hashTable[index] != -1) {

            if (hashTable[index] == key)
                return index;

            index = (index + 1) % SIZE;
        }

        return index;
    }

    static void countFrequency(int[] arr) {

        initialize();

        for (int i = 0; i < arr.length; i++) {

            int index = findIndex(arr[i]);

            if (hashTable[index] == -1) {
                hashTable[index] = arr[i];
                frequency[index] = 1;
            } 
            else {
                frequency[index]++;
            }
        }
    }

    static void display() {

        for (int i = 0; i < SIZE; i++) {

            if (hashTable[i] != -1) {
                System.out.println(
                    hashTable[i] + " -> " + frequency[i]
                );
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = {2, 5, 2, 8, 5, 2, 8, 9};

        countFrequency(arr);

        System.out.println("Element Frequencies:");

        display();
    }
}