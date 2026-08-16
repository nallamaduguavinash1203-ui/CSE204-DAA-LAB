import java.util.*;

class Series2 {

    double sum(int a, int r, int n) {

        if (r == 1) {
            return a * n;
        }

        return a * (Math.pow(r, n) - 1) / (r - 1);
    }

    public static void main(String[] args) {

        Series2 s1 = new Series2();
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
