import java.util.ArrayList;
import java.util.Collections;

class BucketSort
{
    static void bucketSort(float[] arr)
    {
        int n = arr.length;

        // Create n buckets
        ArrayList<Float>[] buckets = new ArrayList[n];

        for(int i = 0; i < n; i++)
        {
            buckets[i] = new ArrayList<Float>();
        }

        // Put elements into buckets
        for(int i = 0; i < n; i++)
        {
            int index = (int)(arr[i] * n);
            buckets[index].add(arr[i]);
        }

        // Sort individual buckets
        for(int i = 0; i < n; i++)
        {
            Collections.sort(buckets[i]);
        }

        // Combine buckets
        int k = 0;

        for(int i = 0; i < n; i++)
        {
            for(float value : buckets[i])
            {
                arr[k++] = value;
            }
        }
    }

    public static void main(String[] args)
    {
        float[] arr = {
            0.42f, 0.32f, 0.33f, 0.52f,
            0.37f, 0.47f, 0.51f
        };

        System.out.println("Given array is:");

        for(float x : arr)
        {
            System.out.print("\t" + x);
        }

        bucketSort(arr);

        System.out.println("\nSorted array is:");

        for(float x : arr)
        {
            System.out.print("\t" + x);
        }
    }
}