package day7;

class Product{
	String name;
	int balance;
	int price;
	
	Product(){
		this("��ũ����",5,10000);
	}
	
	Product(String name, int balance, int price){
		this.name = name;
		this.balance= balance;
		this.price = price;
	}
	
	String getName(){
		return name;
	}
	
	int getBalance(){
		return balance;
	}
	
	int getPrice(){
		return price;
	}
	
}

public class ProductTest {

	public static void main(String[] args) {
		Product[] p = new Product[5];
		p[0] = new Product();
		p[1] = new Product("����",1,20000);
		p[2] = new Product("����",3,12000);
		p[3] = new Product("����",4,3000);
		p[4] = new Product("ġŲ",1,16000);
		
		for(int i=0;i<5;i++){
			System.out.println(p[i].getName()+" "+p[i].getBalance()+" "+p[i].getPrice());
		}

	}

}
