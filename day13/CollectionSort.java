package day13;
import java.util.*;
public class CollectionSort {
   public static void main(String[] args) {
      String[] array={"JAVA", "SERVLET", "JDBC", "JSP","RMI"};
      List<String> list=new ArrayList<String>();
      Collections.addAll(list,array);
      System.out.println("list�� ����� ��� ������ : "+list);

      int index=Collections.binarySearch(list,"JDBC");
      System.out.println("\"JDBC\" �� ����� ��ġ : "+index);
     
      String maxStr=Collections.max(list);
      String minStr=Collections.min(list);
      System.out.println("�ִ밪:"+maxStr);
      System.out.println("�ּҰ�:"+minStr);  

      Collections.sort(list);
      System.out.println("list�� �����͵��� ������������ ������ ��� : "+list);
   
      Collections.shuffle(list);
      System.out.println("list�� �����͵��� ���� ��� : "+list);
   }
}
