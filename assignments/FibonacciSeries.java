package week1.day1.assignments;

public class FibonacciSeries {
	public static void main(String[] args) {
		int n = 11;
		int n1 = 0;
		int n2 = 1;
		for (int i = 1; i <=n; i++) { //
			System.out.println(n1);
			int n3 = n1+n2;
			n1 = n2;
			n2 = n3;
		}
	}
}
