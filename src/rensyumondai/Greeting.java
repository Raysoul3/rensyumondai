package rensyumondai;

public class Greeting {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//		int x = 23;
		//		int y = 6;
		//		int a=x+y;
		//		
		//		System.out.println("x+y="+a);
		//				
		//
		//	}
		//		int x = 10;
		//		while (x < 25) {
		//			x += 5;
		//			
		//		}
		//		System.out.println("ans:"+x);
		//		

		//		int num = new java.util.Random().nextInt(10)+1;
		//		
		//		if (num %2 ==0) {
		//			System.out.println(num+"は偶数です。");
		//			
		//		}else {
		//			System.out.println(num+"は奇数です。");
		//			
		//		}

		//		double bottom = 4.3;
		//		double height = 5.4;
		//		System.out.println("底辺:4.3,高さ:5.4の三角形の面積は:"+ bottom*height/2);
		////		
		//		System.out.println("あなたのなまえを入力してください");
		//		String name = new java.util.Scanner(System.in).nextLine();
		//		System.out.println("こんにちは,"+name+"さん!");
		//		
		//		System.out.println("スカイツリーの高さは？(m)");
		//		int tall = new java.util.Scanner(System.in).nextInt();
		//		if (tall == 643) {
		//			System.out.println("アタリ！");
		//		}else {
		//			System.out.println("ハズレ！");
		//		}

		//		int score = new java.util.Random().nextInt(101);
		//		System.out.println("score:"+score);
		//		
		//		if (score >= 80) {
		//			System.out.println("Excellent!");
		//		} else if (score >= 50) {
		//			System.out.println("Good.");
		//		} else {
		//			System.out.println("Bad...");
		//		}

		//		int sum =0;
		//		int cnt =5;
		//		
		//		for(int i = 0;i<cnt;i++) {
		//		 sum +=  new java.util.Random().nextInt(10);
		//		 System.out.println(sum);
		//			}
		//		double avg = (double)sum/cnt;
		//		System.out.println(cnt+"個の数値の合計は"+sum+"平均は"+avg);
		//		
		//		int gs = 0;
		//		for (int i = 0; i < 10; i++) {
		//			int num = new java.util.Random().nextInt(100);
		//			if (num >= 50) {
		//				gs += 1;
		//			}
		//		}
		//		System.out.println("50以上のscoreは" + gs + "個ありました。");

		System.out.println("10月は英語で何?");
		String ans = new java.util.Scanner(System.in).nextLine();
		if (ans.equals("october")) {
			System.out.println("OK!");
		} else {
			System.out.println("NG");
		}
	}
}
