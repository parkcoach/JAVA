package day13;
import java.io.*;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class CopyExam {

	public static void main(String[] args) {
		FileReader reader = null;
		BufferedReader br = null;
		GregorianCalendar cal = new GregorianCalendar();
		try(FileWriter  writer = new FileWriter("sample_"+cal.get(Calendar.YEAR)+"_0"+(cal.get(Calendar.MONTH)+1)+
				"_"+cal.get(Calendar.DAY_OF_MONTH)+".txt", true)){
			reader = new FileReader("sample.txt");
			br = new BufferedReader(reader);
			PrintWriter out = new PrintWriter(writer);

			while(true){
				String line = br.readLine();
				if(line==null){
					break;
				}
				out.println(line);
			}
		}

		catch (IOException e) {
			System.out.println("ó���ϴ� ���� ������ �߻��߽��ϴ�.");
		} finally {
			try {
				System.out.println("���簡 �Ϸ�Ǿ����ϴ�.");
				br.close();
				reader.close();
			} catch (Exception e) {
				System.out.println("ó���ϴ� ���� ������ �߻��߽��ϴ�.");
			}
		}

	}

}
