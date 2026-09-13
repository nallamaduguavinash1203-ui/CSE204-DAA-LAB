class MaximumSubarray {

    static int maxCrossingSum(int[] arr, int low, int mid, int high) {

        int leftSum = Integer.MIN_VALUE;
        int sum = 0;

        // Find maximum sum on left side
        for (int i = mid; i >= low; i--) {
            sum = sum + arr[i];

            if (sum > leftSum) {
                leftSum = sum;
            }
        }

        int rightSum = Integer.MIN_VALUE;
        sum = 0;

        // Find maximum sum on right side
        for (int i = mid + 1; i <= high; i++) {
            sum = sum + arr[i];

            if (sum > rightSum) {
                rightSum = sum;
            }
        }

        return leftSum + rightSum;
    }

    static int maxSubarraySum(int[] arr, int low, int high) {

        // Base case
        if (low == high) {
            return arr[low];
        }

        // Divide
        int mid = (low + high) / 2;

        // Conquer
        int leftSum = maxSubarraySum(arr, low, mid);
        int rightSum = maxSubarraySum(arr, mid + 1, high);

        // Combine
        int crossingSum = maxCrossingSum(arr, low, mid, high);

        return Math.max(leftSum,
               Math.max(rightSum, crossingSum));
    }

    public static void main(String[] args) {

        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int maxSum = maxSubarraySum(arr, 0, arr.length - 1);

        System.out.println("Maximum subarray sum = " + maxSum);
    }
}