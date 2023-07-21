package rensyumondai;

public class Q08 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("価格を入力してください。");
		int add = new java.util.Scanner(System.in).nextInt();
		Hello(add);

	}

	public static void Hello(int add) {
		int prince = (int) (add * 1.08);
		System.out.println(add + "円は消費税込みで" + prince + "円です");
	}

}
