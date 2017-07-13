package day8;
import java.util.*;

class CalculatorExpr{
	int num1;
	int num2;
	
	CalculatorExpr(int n1, int n2){
		num1 = n1;
		num2 = n2;
	}
	
	int getAddition(){
		return num1+num2;
	}
	
	int getSubtraction(){
		return num1-num2;
	}
	
	int getMultiplication(){
		return num1*num2;
	}
	
	double getDivision(){
		return num1/(double)num2;
	}
}

public class CalculatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		CalculatorExpr c = new CalculatorExpr(num1,num2);
		System.out.println("ÃßÃâµÈ ¼ýÀÚ: "+num1+", "+num2);
		System.out.println("µ¡¼À: "+c.getAddition());
		System.out.println("»¬¼À: "+c.getSubtraction());
		System.out.println("°ö¼À: "+c.getMultiplication());
		System.out.println("³ª´°¼À: "+c.getDivision());

	}

}
