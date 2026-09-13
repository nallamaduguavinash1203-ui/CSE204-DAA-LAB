class MaxMin {

    static class Result {
        int max;
        int min;

        Result(int max, int min) {
            this.max = max;
            this.min = min;
        }
    }

    static Result findMaxMin(int[] arr, int low, int high) {

        // Only one element
        if (low == high) {
            return new Result(arr[low], arr[low]);
        }

        // Two elements
        if (high == low + 1) {
            if (arr[low] > arr[high]) {
                return new Result(arr[low], arr[high]);
            } else {
                return new Result(arr[high], arr[low]);
            }
        }

        // Divide
        int mid = (low + high) / 2;

        // Conquer
        Result left = findMaxMin(arr, low, mid);
        Result right = findMaxMin(arr, mid + 1, high);

        // Combine
        int max = Math.max(left.max, right.max);
        int min = Math.min(left.min, right.min);

        return new Result(max, min);
    }

    public static void main(String[] args) {

        int[] arr = {7, 2, 9, 4, 1, 8};

        Result result = findMaxMin(arr, 0, arr.length - 1);

        System.out.println("Maximum element = " + result.max);
        System.out.println("Minimum element = " + result.min);
    }
}