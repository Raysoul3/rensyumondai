package chapter02;

public class Oracle_game1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("ジャンケンゲーム!!");
		String[] skill = { "グー", "チョキ", "パー" };

		while (true) {
			System.out.println("手を入力してね。0:グー,1:チョキ,2:パー > ");
			int input = new java.util.Scanner(System.in).nextInt();
			int defn = new java.util.Random().nextInt(3);
			System.out.println("あなたは" + skill[input]);
			System.out.println("PCは" + skill[defn]);

			if (input == defn) {
				System.out.println("あいこです");
			} else if ((input + 1) % 3 == defn) {
				System.out.println("あなたの勝ち");
				break;
			} else {
				System.out.println("PCの勝ち");
				break;
			}
		}
	}

}
