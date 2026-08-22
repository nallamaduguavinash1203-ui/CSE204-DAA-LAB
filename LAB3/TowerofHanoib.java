import java.util.Scanner;
import java.util.Stack;

public class TowerOfHanoib {

    static void makeMove(Stack<Integer> from, Stack<Integer> to,
                         char fromRod, char toRod) {

        if (from.isEmpty()) {
            int disk = to.pop();
            from.push(disk);
            System.out.println("Move disk " + disk +
                    " from " + toRod + " to " + fromRod);
        }
        else if (to.isEmpty()) {
            int disk = from.pop();
            to.push(disk);
            System.out.println("Move disk " + disk +
                    " from " + fromRod + " to " + toRod);
        }
        else if (from.peek() < to.peek()) {
            int disk = from.pop();
            to.push(disk);
            System.out.println("Move disk " + disk +
                    " from " + fromRod + " to " + toRod);
        }
        else {
            int disk = to.pop();
            from.push(disk);
            System.out.println("Move disk " + disk +
                    " from " + toRod + " to " + fromRod);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of disks: ");
        int n = sc.nextInt();

        Stack<Integer> source = new Stack<>();
        Stack<Integer> auxiliary = new Stack<>();
        Stack<Integer> destination = new Stack<>();

        // Put all disks on source
        for (int i = n; i >= 1; i--) {
            source.push(i);
        }

        int totalMoves = (int) Math.pow(2, n) - 1;

        // For even number of disks, swap auxiliary and destination
        if (n % 2 == 0) {
            Stack<Integer> temp = auxiliary;
            auxiliary = destination;
            destination = temp;
        }

        // Perform all moves
        for (int move = 1; move <= totalMoves; move++) {

            if (move % 3 == 1) {
                makeMove(source, destination, 'A', 'C');
            }
            else if (move % 3 == 2) {
                makeMove(source, auxiliary, 'A', 'B');
            }
            else {
                makeMove(auxiliary, destination, 'B', 'C');
            }
        }

        sc.close();
    }
}