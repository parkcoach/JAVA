package day11;

public class ExceptionTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("수행시작");
		try{
			int num1 = Integer.parseInt(args[0]);
			int num2 = Integer.parseInt(args[1]);
			int result = num1/num2;
			System.out.println("연산결과: "+result);
		} 
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("두개의 프로그램 아규먼트를 입력하세요");
		}
		catch(Exception e){
			System.out.println("나머지 예외");
			e.printStackTrace();
		
		}
		/*catch(ArithmeticException e){
			System.out.println("두 번째 숫자는 0일 수 없어요");
			e.printStackTrace();
//			System.out.println(e);
		}catch(NumberFormatException e){
			System.out.println("숫자만 입력하세요");
			e.printStackTrace();
		}*/finally{
			System.out.println("이 블럭은 반드시 수행합니다");
		}
		System.out.println("수행종료");	
	} 

}
