package day3;

public class ForLab2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int odd_mul = 1; //È¦¼ö°ö
		int even_mul = 1; //Â¦¼ö°ö
		
		for(int i=5;i<=20;i++){
			if(i%2==0)
				even_mul *= i;
			else
				odd_mul *= i;
		}
		
		System.out.println("Â¦¼öÀÇ °ö : "+even_mul);
		System.out.println("È¦¼öÀÇ °ö : "+odd_mul);
	}

}
