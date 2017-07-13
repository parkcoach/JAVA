package day9;

class GuGu {
	private int dan;
	private int number;
	
	GuGu(){}
	GuGu(int dan, int number){
		this.dan = dan;
		this.number = number;
	}
	
	void printPart(){
		if(number == 0){
			for(int n = 1;n<=9;n++){
				System.out.print("\t"+dan+"*"+n+"="+dan*n);
			}
			System.out.println();
		}
		else{
			System.out.println(dan*number);
		}
	}
}

class GuGuDan extends GuGu{
	GuGuDan(){
		
	}
	
	GuGuDan(int dan){
		super(dan,0);
	}
	
	GuGuDan(int dan,int number){
		super(dan,number);
	}
	
	static void printAll(){
		for(int i=1;i<=9;i++){
			for(int j=1;j<=9;j++){
				System.out.print(i+"*"+j+"="+i*j+"\t");
			}
			System.out.println();
		}
	}
}

public class GuGuDanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dan = (int)(Math.random()*20)+1;
		int number = (int)(Math.random()*20)+1;
		
		if(1<=dan && dan<=9 && 1<=number && number<=9){
			GuGuDan g = new GuGuDan(dan,number);
			System.out.print(number+"*"+dan+"=");
			g.printPart();
		}
		else if(1<=dan && dan<=9 && 10<=number){
			GuGuDan g = new GuGuDan(dan);
			System.out.print(dan+"´Ü : ");
			g.printPart();
		}
		else if(10<=dan){
			GuGuDan g = new GuGuDan();
			g.printAll();
		}
	}

}
