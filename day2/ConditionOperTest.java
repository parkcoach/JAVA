package day2;

public class ConditionOperTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value = (int)(Math.random()*5)+1;
		int result = 0;
		
		if(value==1)
			result = 300+50;
		else if(value==2)
			result = 300-50;
		else if(value==3)
			result = 300*50;
		else if(value==4)
			result = 300/50;
		else
			result = 300%50;
		
		System.out.println(result);
	}

}
