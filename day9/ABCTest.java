package day9;

class A {
	A() {
		System.out.println("A클래스의 생성자 호출");
	}
}

class B extends A{
	B() {
		System.out.println("B클래스의 생성자 호출");
	}
}

class C extends B{
	C() {
		System.out.println("C클래스의 생성자 호출");
	}
}

public class ABCTest {

	public static void main(String[] args) {
		new A();
		System.out.println();
		new B();
		System.out.println();
		new C();

	}

}
