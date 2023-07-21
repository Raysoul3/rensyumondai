package rensyumondai;

public class Q10 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("整数を入れてください。");
		int x = new java.util.Scanner(System.in).nextInt();
		boolean result = add(x);
		if (result) {
			System.out.println(x + "は、偶数です。");

		} else {

			System.out.println(x + "は奇数です。");

		}
	}

	public static boolean add(int x) {
		boolean result;
		if (x % 2 == 0) {
			result = true;
		} else {
			result = false;
		}
		return result;

	}

}
