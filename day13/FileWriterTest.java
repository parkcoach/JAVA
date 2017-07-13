package day13;
import java.io.*;
public class FileWriterTest {
    public static void main(String args[]) {
        FileWriter writer = null;
        try  {
        	writer = new FileWriter("c:/kjh/output.txt",true);
            char arr[] = { '��', 'ü', '��', '��', '��', '��', 'J', 'a', 'v', 'a' };          
            for (int cnt = 0; cnt < arr.length; cnt++)
                writer.write(arr[cnt]);
            writer.write("\n");
            writer.write(arr);
            writer.write("\n");
            writer.write("OCJP ���� ���");
            writer.write("\n");
            System.out.println("���Ͽ� ��� �Ϸ�!!");
        } catch (IOException ioe) {
            System.out.println("���Ϸ� ����� �� �����ϴ�.");
        } finally {
            try {
                writer.close();
            } catch (Exception e) {
            	System.out.println("������ �ݴµ��� ���� �߻�!!");
            }
        }
    }
}

