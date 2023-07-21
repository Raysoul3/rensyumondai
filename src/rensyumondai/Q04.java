package rensyumondai;

public class Q04 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("整数1を入れてください。");
		int x = new java.util.Scanner(System.in).nextInt();
		System.out.println("整数2を入れてください。");
		int y = new java.util.Scanner(System.in).nextInt();
		System.out.println("整数3を入れてください。");
		int z = new java.util.Scanner(System.in).nextInt();
		System.out.println("3つの整数値の最大は" + max(x, y, z) + "です。");
	}

	public static int max(int x, int y, int z) {
		int result = z;
		if (result < y) {
			result = y;
		}
		if (result < x) {
			result = x;
		}
		return result;

	}

}
