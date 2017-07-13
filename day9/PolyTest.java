package day9;
public class PolyTest {
	public static void main(String[] args) {
		printObjectInfo(new Object());
		printObjectInfo(new java.util.Date());
		printObjectInfo(new java.io.File("c:/"));
		printObjectInfo(new String("������"));
		printObjectInfo("ABC");
		printObjectInfo(new A());
		printObjectInfo(new int[10]);
		printObjectInfo(100); // Java 5 AutoBoxing
	}
	static void printObjectInfo(Object o) {
		if(o instanceof String) {
			System.out.println("���޵� ��ü�� ���ڿ��Դϴ�."+o.toString()+"("+((String)o).length()+")");
		} else if(o instanceof java.util.Date) {
			System.out.println("���޵� ��ü�� Date ���Դϴ�.");
		} else {
			System.out.println("���޵� ��ü�� Ŭ������ : "+
	                             o.getClass().getName());
		}
	}
}
