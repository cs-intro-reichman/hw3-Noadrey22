public class Test {
	public static void main(String args[]) {

	public static int plus(int x1, int x2) {
		int sum = x1;
		if (x2 > 0) {
			for (int i = 0; i < x2; i++) {
				sum++;
			}
		} else {
			for (int j = 0; j < -x2; j++) {
				sum++;
			}
		}
		return sum;
		System.out.print(plus(5, 7));
	}
}
}