import java.util.*;

class FractionalKnapsack {
    public static void main(String[] args) {
        int[] value = {60, 100, 120};
        int[] weight = {10, 20, 30};
        int capacity = 50;

        Integer[] index = {0, 1, 2};

        Arrays.sort(index, (i, j) ->
            Double.compare((double)value[j]/weight[j],
                           (double)value[i]/weight[i]));

        double profit = 0;

        System.out.println("Capacity = " + capacity);
        System.out.println("Selected Items:");

        for (int i : index) {
            if (capacity >= weight[i]) {
                capacity -= weight[i];
                profit += value[i];
                System.out.println("Item " + (i + 1) +
                    " -> Full, Value = " + value[i]);
            } else {
                double fraction = (double) capacity / weight[i];
                profit += value[i] * fraction;
                System.out.println("Item " + (i + 1) +
                    " -> " + fraction + " fraction, Value = " +
                    (value[i] * fraction));
                capacity = 0;
                break;
            }
        }

        System.out.println("Remaining Capacity = " + capacity);
        System.out.println("Maximum Profit = " + profit);
    }
}