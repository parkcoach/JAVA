package day4;

public class WhileLab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = (int)(Math.random()*16)+5;
		
		System.out.println("[for 결과]");
		for(int i=1;i<=num;i++){
			System.out.println(i+"->"+i*i);
		}
		System.out.println();
		
		int index = 1;
		System.out.println("[while 결과]");
		while(index<=num){
			System.out.println(index+"->"+index*index);
			index++;
		}
	}
}
