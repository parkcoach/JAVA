package day6;

public class MethodLab1 {

	public static void main(String[] args) {
		int num1, num2;
		for(int i=0;i<5;i++){
			num1 = (int)(Math.random()*30)+1;
			num2 = (int)(Math.random()*30)+1;
			
			System.out.println(num1+"와 "+num2+"의 차이는 "+value(num1,num2)+"입니다.");
		}
	}

	public static int value(int big, int small){
		int temp = 0;
		if(big<small){
			temp = big;
			big = small;
			small = temp;
		}

		return big-small;
	}

}
