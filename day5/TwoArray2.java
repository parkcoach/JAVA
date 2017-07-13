package day5;

public class TwoArray2 {

	public static void main(String[] args) {
		int[] nums[] = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};

		for(int i=0;i<nums.length;i++){
			for(int j=0;j<nums[0].length;j++){
				if(i==j)
					System.out.print(nums[i][j]+" ");
			}
		}
		System.out.println();
		for(int i=0;i<nums.length;i++){
			for(int j=0;j<nums[0].length;j++){
				if(nums[0].length-1-j==i)
					System.out.print(nums[i][j]+" ");
			}
		}

	}

}
