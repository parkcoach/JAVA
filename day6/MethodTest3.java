package day6;

public class MethodTest3 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main() 메서드 수행 시작");
		addNumber();
		addNumber(10,20,30);
		addNumber(new int[]{1,2,3,4,5});
		addNumber(1,2,3,4,5);
		System.out.println("main() 메서드 수행종료");

	}
	
	public static void addNumber(){
		System.out.println(10+2);
	}
	
	public static void addNumber(int num1, int num2){
		System.out.println(num1+num2);
	}
	
	public static void addNumber(int num1, int num2, int num3){
		System.out.println(num1+num2+num3);
	}
	
//	public static void addNumber(int[] nums){
//		int result = 0;
//		for(int i=0;i<nums.length;i++){
//			result += nums[i];
//		}
//		System.out.println(result);
//	}
	
	public static void addNumber(int... nums){
		int result = 0;
		for(int i=0;i<nums.length;i++){
			result += nums[i];
		}
		System.out.println(result);
	}


}
