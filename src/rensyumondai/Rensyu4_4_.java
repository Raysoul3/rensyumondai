package rensyumondai;

public class Rensyu4_4_ {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] num = {3,4,9};
		System.out.println("1桁の数字を入力してください。");
		int input = new java.util.Scanner(System.in).nextInt();
		for(int value:num) {
			if(input == value) {
				System.out.print("アタリ！");
			}
		}
		

	}

}
