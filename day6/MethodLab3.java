package day6;

public class MethodLab3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1 = {10, 20, 30};
		int[] array2 = {100, 500, 300, 200, 400};
		int[] array3 = {1,10,3,4,5,8,7,6,9,2};
		
		maxNumArray(array1);
		maxNumArray(array2);
		maxNumArray(array3);
	}
	
	public static void maxNumArray(int[] array){
		int max = Integer.MIN_VALUE;
		for(int i=0;i<array.length;i++){
			if(max<array[i])
				max = array[i];
		}
		System.out.println("가장 큰 값은 "+max+"입니다.");
	}
}
