package day3;

public class ForTest5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for(int i=1;i<=10;i++){
//			for(int j=0;j<i;j++){
//				System.out.print("@");
//			}
//			System.out.println();
//		}
		
		for(int i = 1;i<=10;i++){
			for(int j=10;j>=i;j--){
				System.out.print("@");
			}
			System.out.println();
		}
	}
}