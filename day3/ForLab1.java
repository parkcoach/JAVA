package day3;

public class ForLab1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = (int)(Math.random()*8)+3;
		int deco = (int)(Math.random()*3)+1;
		
		if(deco==1){
			for(int i=0;i<count;i++){
				System.out.print("*");
			}
		}
		else if(deco==2){
			for(int i=0;i<count;i++){
				System.out.print("$");
			}
		}
		else{
			for(int i=0;i<count;i++){
				System.out.print("#");
			}
		}
	}

}
