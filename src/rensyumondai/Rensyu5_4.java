package rensyumondai;

public class Rensyu5_4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		double bottom = 10.0;
		double height = 5.0;
		double sArea = calcTriangleArea(bottom, height);

		System.out.println("三角形の底辺の長さが10.0cm、高さが5.0㎝の場合、面積は" + sArea);

		double radius = 5.0;
		double eArea = calcCircleArea(radius);

		System.out.println("円の半径が5.0㎝の場合、面積は" + eArea);

	}

	public static double calcTriangleArea(double bottom, double height) {
		double triangleArea = bottom * height / 2;
		return triangleArea;
	}

	public static double calcCircleArea(double radius) {
		double CircleArea = radius * radius * 3.14;
		return CircleArea;
	}

}
