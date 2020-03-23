import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static Integer temp = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> A = new Stack<Integer>();
		Stack<Integer> B = new Stack<Integer>();
		Stack<Integer> C = new Stack<Integer>();

		System.out.println("Geef aantal schijven");
		int n = sc.nextInt();
		for (int i = n; i > 0; i--) {
			A.push(i);
		}
		printTorens(A, B, C);
		verplaatsToren(n, A, B, C);
		sc.close();
	}

	public static void verplaatsToren(int n, Stack<Integer> a, Stack<Integer> b, Stack<Integer> c) {
		System.out.println("n=" + n);
		if (n == 1) {
			c.push(a.pop());
			printTorens(a, b, c);

		} else {
			verplaatsToren(n - 1, a, c, b);
			c.push(a.pop());
			printTorens(a, b, c);
			verplaatsToren(n - 1, b, a, c);

		}
	}

	public static void printTorens(Stack<Integer> a, Stack<Integer> b, Stack<Integer> c) {
		System.out.println("A " + a);
		System.out.println("B " + b);
		System.out.println("C " + c);
	}
}
