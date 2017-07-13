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
		int width = sc.nextInt(); //길이
		int height = sc.nextInt(); //높이
		Shape s = new Shape(width, height);
		System.out.println("가로 : "+width+", 높이 : "+height);
		System.out.println("사각형 면적 : "+s.getSquare());
		System.out.printf("삼각형 면적 : %.2f", s.getTriangle());
	}

}
