package rensyumondai;

public class Cleric {

	String name;
	int hp = 50;
	final int MAXHP = 50;
	int mp = 10;
	final int MAXMP = 10;

	public void selfAid() {
		this.mp -= 5;
		System.out.println(this.name + "は、「セルフエイド」を使った。");
		this.hp = this.MAXHP;
		System.out.println(this.name + "は、hpを最大まで回復した。");

	}

	public int pray(int sec) {
		System.out.println(this.name + "は、" + sec + "秒間神に祈った。");
//	mainメソッドのひきうけるために、（int sec)を事前に設置した。
		int recover = new java.util.Random().nextInt(3) + sec;
//問題の要求の「０～2」ポイントだから、ランダムの範囲が3を設置した。
//「+sec]の意味は、実際に祈った時間だ。
		int recoverActual = Math.min(this.MAXMP - this.mp, recover);
//問題の要求「最大MPより回復できない」と書いたため、ここにMath.minをりようして、
//適当のHP量を絞る。		
		this.mp += recoverActual;
		System.out.println("MPが" + recoverActual + "回復した。");

	}

}
