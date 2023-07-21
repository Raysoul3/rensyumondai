package chapter_7_8_9;

public class CopyMachine {

	int paper;

	public CopyMachine(int sheet) {
		this.paper = sheet > 0 ? sheet : 0;//P.137 に書いてる。

	}

	public void feedPaper(int sheet) {
		this.paper += sheet;
	}

	public void copy(int sheet) {
		System.out.println("15枚コピーしました.");

	}

}
