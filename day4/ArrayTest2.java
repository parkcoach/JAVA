package day4;
import java.util.*;
public class ArrayTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {3,1,4,7,10,6,2,15,8,11};
		System.out.println(nums[0]);
		System.out.println(nums[nums.length-1]);
		System.out.println(nums[4]);
		
		for(int i=nums.length-1;i>=0;i--){
			System.out.print(nums[i]+"\t");
		}
		System.out.println();
		
		int max = Integer.MIN_VALUE;
		for(int i=0;i<nums.length;i++){
			if(max<nums[i])
				max = nums[i];
		}
		System.out.println("최댓값: "+max);
		
		int min = Integer.MAX_VALUE;
		for(int i=0;i<nums.length;i++){
			if(min>nums[i])
				min = nums[i];
		}
		System.out.println("최소값: "+min);
	}

}
