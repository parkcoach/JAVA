package day8;

//Object -> Parent -> Child
class Parent extends java.lang.Object {
	String name = "�θ��̸�";
	
	void printInfo(){
		System.out.println("�θ��� ������ ����մϴ�.");
	}
	
	@Override
	public String toString(){
		return "Parent [name="+name+"]";
	}
}

class Child extends Parent{
	@Override // annotation���� : �����ϴ� ��, � ���� ������
	void printInfo(){
		System.out.println("�ڽ��� ������ ����մϴ�.");
	}
	
	@Override
	public String toString(){
		return "Child []";
	}
}

public class ParentChildTest {

	public static void main(String[] args) {
		Child obj = new Child();
		System.out.println(obj.toString());
		System.out.println(obj.name);
		obj.printInfo();
		
	}

}
