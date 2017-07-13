package day13;
import java.net.*;
import java.io.*;
public class URLTest1 {
	public static void main(String[] args) {
		try {
			//URL req = new URL("http://www.kma.go.kr/wid/queryDFSRSS.jsp?zone=11680640");
			URL req = new URL("https://www.naver.com");
			InputStream is = req.openStream();
			BufferedReader reader = new BufferedReader(
					                       new InputStreamReader(is, "utf-8"));
			String lineStr = "";
			int index = 1;
			while(true) {
				lineStr = reader.readLine();
				if(lineStr == null)
					break;
				System.out.println(index+" "+lineStr);	
				index++;
			}			
		} catch (MalformedURLException e) {
			System.out.println("URL문자열 오류 : "+e.getMessage());
		} catch (IOException e) {
			System.out.println("IO 오류 : "+e.getMessage());
		}
	}
}
