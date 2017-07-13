package day2;

public class TypeTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c1,c2,c3;
		c1='A';
		c2='\u0041';
		c3=0x41;
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		c1='°¡';
		c2='\uac00';
		c3=0xb0a1;
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);

	}

}
