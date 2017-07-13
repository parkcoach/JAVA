package day9;

class Super{
	int x = 10;
	int y = 20;
}

class Sub extends Super {
	int x = 100;
	int y = 20;
	void print(){
		int x = 1000;
		System.out.println(x); //지역변수
		System.out.println(this.x); //멤버변수
		System.out.println(super.x); //부모변수
		System.out.println(y);
		System.out.println(this.y);
		System.out.println(super.y);
	}
}
public class SuperSubTest {

	public static void main(String[] args) {
		new Sub().print(); //변수에 넣지 않아도 되는데 한번만 사용한다.
	}

}
