import java.util.Scanner;

class KthSmallest2 {

    static int partition(int[] arr, int low, int high) {

        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {

            if (arr[j] <= pivot) {
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    static int kthSmallest(int[] arr, int low, int high, int k) {

        int p = partition(arr, low, high);

        if (p == k - 1) {
            return arr[p];
        }

        if (p > k - 1) {
            return kthSmallest(arr, low, p - 1, k);
        }

        return kthSmallest(arr, p + 1, high, k);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter K: ");
        int k = sc.nextInt();

        int result = kthSmallest(arr, 0, n - 1, k);

        System.out.println("Kth smallest element = " + result);
    }
}