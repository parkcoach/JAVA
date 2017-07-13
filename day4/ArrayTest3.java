package day4;

import java.util.Scanner;

public class ArrayTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("처리하려는 데이터의 갯수를 입력해주세요: ");
		int size = sc.nextInt();
		
		int[] ary= new int[size];
		for(int i=0;i<ary.length;i++){
			ary[i] = (int)(Math.random()*11)+10;
		}
		
		for(int i=0;i<ary.length;i++){
			System.out.print(ary[i]+" ");
		}

	}

}
