import java.util.Scanner;

class Kthsmallest1
{


     int sort(int a[],int k)
     {
        
        int temp;
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]>a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        return a[k-1];
     }


    public static void main(String[] args)
    {
        int[] a;
        Kthsmallest1 s1 = new Kthsmallest1();
        System.out.println("Enter the size of array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        a = new int[n];

        System.out.println("Enter the elements of array");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter the value of k");
        int k = sc.nextInt(); 

        System.out.println("The " + k + "th smallest element is: " + s1.sort(a,k));
        sc.close();

    }
}