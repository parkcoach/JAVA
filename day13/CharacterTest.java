package day13;

public class CharacterTest {

	public static void main(String[] args) {
		System.out.println(Character.toLowerCase('A')); //�ҹ��ڷ� �ٲٱ�
		System.out.println(Character.toUpperCase('a')); //�빮�ڷ� �ٲٱ�
		System.out.println(Character.isDigit('A'));
		System.out.println(Character.isDigit('1'));		//���ڳ�
		System.out.println(Character.isLowerCase('A'));		//�ҹ��ڳ�
		System.out.println(Character.isUpperCase('A'));		//�빮�ڳ�
		System.out.println(Character.isSpaceChar(' '));		//�����̽��ٳ�
	}

}
