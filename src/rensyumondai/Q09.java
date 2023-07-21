package rensyumondai;

public class Q09 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("整数1を入れてください。");
		int add = new java.util.Scanner(System.in).nextInt();
		System.out.println("整数2を入れてください。");
		int akk = new java.util.Scanner(System.in).nextInt();

		System.out.println("2つの整数値の平均は" + result(add, akk) + "です。");

	}

	public static int result(int add, int akk) {
		int ave = (add + akk) / 2;
		return ave;

	}

}
