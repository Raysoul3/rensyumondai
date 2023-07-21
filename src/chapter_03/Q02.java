package chapter_03;

public class Q02 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String n = name();
		int a = age();
		System.out.println(n + "(" + a + ")さん、こんにちは!");

	}

	public static String name() {
		System.out.println("お名前を入力してください>");
		String n = new java.util.Scanner(System.in).nextLine();
		return n;
	}

	public static int age() {
		System.out.println("年齢をいれてください>");
		int a = new java.util.Scanner(System.in).nextInt();
		return a;
	}

}
