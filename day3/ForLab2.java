package day3;

public class ForLab2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int odd_mul = 1; //Ȧ����
		int even_mul = 1; //¦����
		
		for(int i=5;i<=20;i++){
			if(i%2==0)
				even_mul *= i;
			else
				odd_mul *= i;
		}
		
		System.out.println("¦���� �� : "+even_mul);
		System.out.println("Ȧ���� �� : "+odd_mul);
	}

}
