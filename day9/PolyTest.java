package day9;
public class PolyTest {
	public static void main(String[] args) {
		printObjectInfo(new Object());
		printObjectInfo(new java.util.Date());
		printObjectInfo(new java.io.File("c:/"));
		printObjectInfo(new String("가나다"));
		printObjectInfo("ABC");
		printObjectInfo(new A());
		printObjectInfo(new int[10]);
		printObjectInfo(100); // Java 5 AutoBoxing
	}
	static void printObjectInfo(Object o) {
		if(o instanceof String) {
			System.out.println("전달된 객체는 문자열입니다."+o.toString()+"("+((String)o).length()+")");
		} else if(o instanceof java.util.Date) {
			System.out.println("전달된 객체는 Date 형입니다.");
		} else {
			System.out.println("전달된 객체의 클래스명 : "+
	                             o.getClass().getName());
		}
	}
}
