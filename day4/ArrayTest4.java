package day4;

import java.util.Scanner;

public class ArrayTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("처리하려는 데이터의 갯수를 입력해주세요: ");
		int size = sc.nextInt();
		
		int[] ary= new int[size];
		int[] check = new int[21];
		int index =0;
		while(true){
			int num = (int)(Math.random()*11)+10;
			
			if(check[num]!=0)
				continue;
			else{
				ary[index] = num;
				check[num]++;
				index++;
				if(index==size)
					break;
			}
		}	
		
		for(int i=0;i<size;i++){
			if(i==0){
				System.out.print(ary[i]);
			}
			else{
				System.out.print(", "+ary[i]);
			}
		}

	}

}