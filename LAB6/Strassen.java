class Strassen {

    static int[][] multiply(int[][] A, int[][] B) {
        int n = A.length;
        int[][] C = new int[n][n];

        if (n == 1) {
            C[0][0] = A[0][0] * B[0][0];
            return C;
        }

        int m = n / 2;

        int a = A[0][0], b = A[0][1];
        int c = A[1][0], d = A[1][1];

        int e = B[0][0], f = B[0][1];
        int g = B[1][0], h = B[1][1];

        int p1 = a * (f - h);
        int p2 = (a + b) * h;
        int p3 = (c + d) * e;
        int p4 = d * (g - e);
        int p5 = (a + d) * (e + h);
        int p6 = (b - d) * (g + h);
        int p7 = (a - c) * (e + f);

        C[0][0] = p5 + p4 - p2 + p6;
        C[0][1] = p1 + p2;
        C[1][0] = p3 + p4;
        C[1][1] = p1 + p5 - p3 - p7;

        return C;
    }

    public static void main(String[] args) {
        int[][] A = {{1, 2}, {3, 4}};
        int[][] B = {{5, 6}, {7, 8}};

        int[][] C = multiply(A, B);

        for (int[] row : C) {
            for (int x : row)
                System.out.print(x + " ");
            System.out.println();
        }
    }
}