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
		System.out.println(x); //��������
		System.out.println(this.x); //�������
		System.out.println(super.x); //�θ𺯼�
		System.out.println(y);
		System.out.println(this.y);
		System.out.println(super.y);
	}
}
public class SuperSubTest {

	public static void main(String[] args) {
		new Sub().print(); //������ ���� �ʾƵ� �Ǵµ� �ѹ��� ����Ѵ�.
	}

}
