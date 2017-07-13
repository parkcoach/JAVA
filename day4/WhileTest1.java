package day4;

public class WhileTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int money = 2000;
		int spending;
		while(money > 0){
			System.out.println("ÇöÀç ÀÜ¾×: "+money);
			spending = (int)(Math.random()*1000)+100;
			if(money > spending){
				money-= spending;
				System.out.println("");
			}
		}

	}

}
