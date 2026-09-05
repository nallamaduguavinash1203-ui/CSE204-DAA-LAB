class MergeSort
{
    static void merge(int[] arr,int low,int mid,int high)
    {
        int i=low;
        int j=mid+1;
        int k=0;

        int[] temp=new int[high-low+1];

        while(i<=mid&&j<=high)
        {
            if(arr[i]<arr[j])
                temp[k++]=arr[i++];
            else
                temp[k++]=arr[j++];
        }

        while(i<=mid)
            temp[k++]=arr[i++];
        while(j<=high)
            temp[k++]=arr[j++];

        for(int l=0;l<temp.length;l++)
            arr[low+l]=temp[l];
    }

    static void mergesort(int[] arr,int low,int high)
    {
        int mid;
        if(low<high)
        {
            mid=(low+high)/2;
            mergesort(arr,low,mid);
            mergesort(arr,mid+1,high);
            merge(arr,low,mid,high);
        }
    }

    public static void main(String[] args)
    {
        int[] arr={9,5,3,7,2,6,1,8,0};
        System.out.println("Given array is:");
        for(int y:arr)
        {
            System.out.print("\t"+y);
        }
        mergesort(arr,0,(arr.length-1));
        System.out.println("\nSorted array is:");
        for(int x:arr)
        {
            System.out.print("\t"+x);
        }
    }
}