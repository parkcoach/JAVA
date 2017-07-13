package day8;

class GradeExpr{
	int[] jumsu;
	
	GradeExpr(int[] j){
		jumsu = j;
	}
	
	double getAverage(){
		int sum = this.getTotal();
		double ans = sum/jumsu.length;
		return ans;
	}
	
	int getTotal(){
		int sum = 0;
		for(int x : jumsu){
			sum += x;
		}
		return sum;
	}
	
	int getGoodScore(){
		int max = Integer.MIN_VALUE;
		for(int x : jumsu){
			if(max < x){
				max = x;
			}
		}
		return max;
	}
	
	int getBadScore(){
		int min = Integer.MAX_VALUE;
		for(int x : jumsu){
			if(min > x){
				min = x;
			}
		}
		return min;
	}
}

public class GradeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[5];
		for(int i=0;i<a.length;i++){
			a[i] = (int)(Math.random()*41)+60;
		}
		
		GradeExpr g = new GradeExpr(a);
		
		System.out.print("������ : ");
		for(int x : a){
			System.out.print(x+" ");
		}
		System.out.println();
		
		System.out.println("����: "+g.getTotal());
		System.out.println("���: "+g.getAverage());
		System.out.println("�ְ� ����: "+g.getGoodScore());
		System.out.println("���� ����: "+g.getBadScore());
		
		

	}

}
