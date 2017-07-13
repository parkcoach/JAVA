package day2;

public class IfTest3 {

	public static void main(String[] args) {
		int score = (int)(Math.random()*101);
		
		if(90<=score && score<=100)
			System.out.println(score+": A등급");
		else if(80<=score && score<90)
			System.out.println(score+": B등급");
		else if(70<=score && score<80)
			System.out.println(score+": C등급");
		else if(60<=score && score<70)
			System.out.println(score+": D등급");
		else 
			System.out.println(score+": F등급");
	}

}
