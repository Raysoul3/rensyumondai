package rensyumondai;

public class Q05 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("1からいくつまで足しますか");
		int x = new java.util.Scanner(System.in).nextInt();
		System.out.println("1から" + x + "までの和は" + sum(x) + "です。");

	}

	public static int sum(int x) {
		int gold = 0;

		for (int i = 1; i <= x; i++) {
			gold += i;
		}
		return gold;

	}

}
