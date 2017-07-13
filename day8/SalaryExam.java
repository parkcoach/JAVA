package day8;

class SalaryExpr{
	int bonus;
	
	SalaryExpr(){
		this(0);
	}
	
	SalaryExpr(int bonus){
		this.bonus = bonus;
	}
	
	int getSalary(int grade){
		if(grade==1)
			bonus += 100;
		else if(grade==2)
			bonus += 90;
		else if(grade==3)
			bonus += 80;
		else
			bonus += 70;
		return bonus;
	}
	
}

public class SalaryExam {

	public static void main(String[] args) {
		int month = (int)(Math.random()*12)+1;
		int grade = (int)(Math.random()*4)+1;
		SalaryExpr s;
		
		if(month%2==0){
			s = new SalaryExpr(100);
		}
		else{
			s = new SalaryExpr();
		}
		System.out.println(month+"월 "+grade+"등급의 월급은 "+s.getSalary(grade)+"입니다.");
		

	}

}
