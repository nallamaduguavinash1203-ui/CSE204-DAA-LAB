import java.util.*;

class Series1 {

    int sum(int a, int r, int n) {

        int sum = 0;
        int term = a;

        for (int i = 1; i <= n; i++) {
            sum = sum + term;
            term = term * r;
        }

        return sum;
    }

    public static void main(String[] args) {

        Series1 s1 = new Series1();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first term (a):");
        int a = sc.nextInt();

        System.out.println("Enter the common ratio (r):");
        int r = sc.nextInt();

        System.out.println("Enter the number of terms (n):");
        int n = sc.nextInt();

        System.out.println("The sum of GP is " + s1.sum(a, r, n));

        sc.close();
    }
}