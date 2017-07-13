package day2;

public class TimeTest {
	final static int m = 60;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int time = 32150;
		
		int hour = time/(m*m);
		time = time%(m*m);
		int minute = time/m;
		time = time%m;
		int second = time;
		
		System.out.println(hour+"시간 "+minute+"분 "+second+"초");
	}

}
