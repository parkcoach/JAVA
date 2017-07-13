package day6;

public class MethodLab4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] ch = {{'A','b','C'},
					   {'a','b','c','D','E','F'},
					   {'z','S','Z','S'}};
		
		System.out.println("[ 출력 결과 ]");
		System.out.println("-------------");
		
		for(int i=0;i<3;i++){
			System.out.print("호출전 : ");
			System.out.println(ch[i]);
			
			convertChar(ch[i]);
			
			System.out.print("호출후 : ");
			System.out.println(ch[i]);
			System.out.println("-------------");
		}
	}
	
	public static void convertChar(char[] ch){
		for(int i=0;i<ch.length;i++){
			if(ch[i] <97)
				ch[i] = (char)(ch[i] + 32);
			else
				ch[i] = (char)(ch[i] - 32);
		}
	}
}
