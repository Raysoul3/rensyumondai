package rensyumondai;

public class Rensyu5_2and3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String title = "xxxxxx@xxxx";
		String address = "asdfjkl";
		String text = "パーティーの誘い";
		email(title,  text);
	}

	public static void email(String title, String address, String text) {
		System.out.println(title + "に、以下のメールを送信しました。");
		System.out.println("件名：" + address);
		System.out.println("本文：" + text);
	}

	public static void email(String title, String text) {
		System.out.println(title + "に、以下のメールを送信しました。");
		System.out.println("件名：無題。");
		System.out.println("本文：" + text);
	}

}
