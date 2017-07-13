package day5;

public class ArrayLab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] int_arr = new int[10];
		for(int i=0;i<10;i++){
			int_arr[i] = (int)(Math.random()*26)+1;
			if(i==0)
				System.out.print(int_arr[i]);
			else
				System.out.print(", "+int_arr[i]);
		}
		System.out.println();
		
		char[] char_arr = new char[10];
		for(int i=0;i<10;i++){
			char_arr[i] = (char)(int_arr[i]+64);
			if(i==0)
				System.out.print(char_arr[i]);
			else
				System.out.print(", "+char_arr[i]);
		}
		

	}

}
