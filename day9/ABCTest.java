package day9;

class A {
	A() {
		System.out.println("AŬ������ ������ ȣ��");
	}
}

class B extends A{
	B() {
		System.out.println("BŬ������ ������ ȣ��");
	}
}

class C extends B{
	C() {
		System.out.println("CŬ������ ������ ȣ��");
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
