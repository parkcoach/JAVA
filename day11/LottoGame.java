package day11;

import java.util.Random;

class DuplicateException extends Exception{
	DuplicateException() {
		super("중복된 로또 번호가 발생했습니다.");
	}
}

class LottoMachine{
	int[] nums;

	public LottoMachine(){
		nums = new int[6];
	}

	public void createLottoNums(){
		Random r = new Random();
		for(int i=0;i<nums.length;i++){
			nums[i] = r.nextInt(20)+1;
		}
	}

	public void checkLottoNums() throws DuplicateException{
		int[] check = new int[21];
		for(int i=0;i<nums.length;i++){
			check[nums[i]]++;
		}

		for(int i=0;i<check.length;i++){
			if(check[i]>1)
				throw new DuplicateException();
		}
	}

	public int[] getNums(){
		return nums;
	}
}

public class LottoGame {

	public static void main(String[] args) throws DuplicateException {
		try{
			LottoMachine l = new LottoMachine();
			l.createLottoNums();
			l.checkLottoNums();
			int[] nums = l.getNums();
			for(int i=0;i<nums.length;i++){
				if(i==0)
					System.out.print(nums[i]);
				else
					System.out.print(", "+nums[i]);
			}
		} catch(DuplicateException e){
			System.out.println(e.getMessage());
		}

	}

}
