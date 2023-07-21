package Test_8_2;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("今週の料理リスト：\n");
		String[] list = {
				"ジャガイモ煮込み+ごはん",
				"麻婆豆腐＋ごはん",
				"ラーメン+餃子",
				"しゃぶしゃぶ＋ごはん",
				"バーベキュー放題",
				"ステーキ放題" };
		for (String L : list) {
			System.out.println(L);

			String L = new java.util.Random().nextInt(3);
			System.out.println("今日の料理は" + L);
		}

	}

}
