package chapter02;

public class Oracle_game {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("数当てゲーム！！\n(0~100)を入力してください。");
		int ans = new java.util.Random().nextInt(101);

		int count = 0;//宣言して、下のインクリメントと一緒に、入力回数を記録する。
		while (true) {//何回回すのが分からない時に「while文」を使う。
			int input = new java.util.Scanner(System.in).nextInt();
			count++;//インクリメントの活用方法です。
			System.out.println("いくつかな?(0~100) > " + input);
			if (input > ans) {
				System.out.println("もっと下だよ。");
			} else if (input < ans) {
				System.out.println("もっと上だよ。");
			} else if (input == ans) {
				System.out.println("正解!!");
				break;
			}

		}
		System.out.println(count + "回で正解しました❣");

	}

}
