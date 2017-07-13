package day13;

public class CharacterTest {

	public static void main(String[] args) {
		System.out.println(Character.toLowerCase('A')); //소문자로 바꾸기
		System.out.println(Character.toUpperCase('a')); //대문자로 바꾸기
		System.out.println(Character.isDigit('A'));
		System.out.println(Character.isDigit('1'));		//숫자냐
		System.out.println(Character.isLowerCase('A'));		//소문자냐
		System.out.println(Character.isUpperCase('A'));		//대문자냐
		System.out.println(Character.isSpaceChar(' '));		//스페이스바냐
	}

}
