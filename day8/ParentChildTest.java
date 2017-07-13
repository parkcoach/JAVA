package day8;

//Object -> Parent -> Child
class Parent extends java.lang.Object {
	String name = "부모이름";
	
	void printInfo(){
		System.out.println("부모의 정보를 출력합니다.");
	}
	
	@Override
	public String toString(){
		return "Parent [name="+name+"]";
	}
}

class Child extends Parent{
	@Override // annotation구문 : 설명하는 것, 어떤 것을 쓰는지
	void printInfo(){
		System.out.println("자식의 정보를 출력합니다.");
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
