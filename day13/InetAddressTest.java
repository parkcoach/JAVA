package day13;
import java.net.*;
public class InetAddressTest {
	public static void main(String[] args) throws Exception{
		InetAddress me = InetAddress.getLocalHost();
		System.out.println(me.getHostAddress());
		InetAddress naver = InetAddress.getByName("www.naver.com");
		System.out.println(naver.getHostAddress());
	}
}
