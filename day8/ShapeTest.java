package day8;

import java.util.Scanner;

class Shape{
	private int width;
	private int height;
	
	Shape(int w, int h){
		width = w < 0 ? -w : w;
		height = h < 0 ? -h : h;
	}
	
	int getSquare(){
		int square = width * height;
		return square;
	}
	
	double getTriangle(){
		double triangle = width * height * 0.5;
		return triangle;
	}
}

public class ShapeTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int width = sc.nextInt(); //����
		int height = sc.nextInt(); //����
		Shape s = new Shape(width, height);
		System.out.println("���� : "+width+", ���� : "+height);
		System.out.println("�簢�� ���� : "+s.getSquare());
		System.out.printf("�ﰢ�� ���� : %.2f", s.getTriangle());
	}

}
