package day13;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class FileOutExam {

	public static void main(String[] args) {
		FileWriter writer = null;
		try {
			writer = new FileWriter ("c:/workspace/today.txt");
			GregorianCalendar cal = new GregorianCalendar();
			 writer.write("������ " + cal.get(Calendar.YEAR) + "�� "+ (cal.get(Calendar.MONTH)+1) +"�� "+ cal.get(Calendar.DAY_OF_MONTH) + "�� �Դϴ�.");
			 writer.write("\n");
			 int day = cal.get(Calendar.DAY_OF_WEEK);
			 writer.write("������ " + FindDay(day) + "�Դϴ�.");
			 writer.write("\n");
			 
			cal.set(1993, 7, 29);
			day = cal.get(Calendar.DAY_OF_WEEK);
			 writer.write("�ڿ����� " + FindDay(day) + "�� �¾���ϴ�." );
			System.out.println("������ �Ϸ�Ǿ����ϴ�.");
		} catch (IOException e) {
			System.out.println("������ �����߽��ϴ�.");
		} finally {
			try {
				if(writer != null)
					writer.close();
			} catch (IOException e1) {
				System.out.println("������ �ݴµ��� ������ �߻��߽��ϴ�.");
			}			
		}
	}

	static String FindDay(int day) {
		String dayofweek = "";
		switch (day) {
		case 1:
			dayofweek = "�Ͽ���";
			break;
		case 2:
			dayofweek = "������";
			break;
		case 3:
			dayofweek = "ȭ����";
			break;
		case 4:
			dayofweek = "������";
			break;
		case 5:
			dayofweek = "�����";
			break;
		case 6:
			dayofweek = "�ݿ���";
			break;
		default:
			dayofweek = "�Ͽ���";
		}
		return dayofweek;
	}
}
