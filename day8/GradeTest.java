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
		
		System.out.print("점수들 : ");
		for(int x : a){
			System.out.print(x+" ");
		}
		System.out.println();
		
		System.out.println("총점: "+g.getTotal());
		System.out.println("평균: "+g.getAverage());
		System.out.println("최고 점수: "+g.getGoodScore());
		System.out.println("최저 점수: "+g.getBadScore());
		
		

	}

}
