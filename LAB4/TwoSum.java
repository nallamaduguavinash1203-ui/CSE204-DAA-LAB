import java.util.Scanner;

class TwoSum {

    static final int SIZE = 100;
    static int[] hashTable = new int[SIZE];

    static void initialize() {
        for (int i = 0; i < SIZE; i++) {
            hashTable[i] = -1;
        }
    }

    static void insert(int key) {
        int index = key % SIZE;

        while (hashTable[index] != -1) {
            index = (index + 1) % SIZE;
        }

        hashTable[index] = key;
    }

    static boolean search(int key) {
        int index = key % SIZE;

        while (hashTable[index] != -1) {

            if (hashTable[index] == key) {
                return true;
            }

            index = (index + 1) % SIZE;
        }

        return false;
    }

    static int[] twoSum(int[] arr, int T) {

        initialize();

        for (int i = 0; i < arr.length; i++) {

            int required = T - arr[i];

            if (search(required)) {
                return new int[]{required, arr[i]};
            }

            insert(arr[i]);
        }

        return new int[]{};
    }

    public static void main(String[] args) {

        int[] arr = {2, 7, 11, 15, 3};

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter target value: ");
        int T = sc.nextInt();

        int[] result = twoSum(arr, T);

        if (result.length == 2) {
            System.out.println("Pair found: " +
                    result[0] + " + " + result[1] + " = " + T);
        } else {
            System.out.println("No pair found");
        }

        sc.close();
    }
}