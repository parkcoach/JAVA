package day10;

interface Rentable{
	public abstract void rent();
}

class TV{
	private String model;
	private int size;
	private int channel;
	
	public TV(){
		
	}
	
	public TV(String model, int size, int channel){
		this.model = model;
		this.size = size;
		this.channel = channel;
	}
	
	public String getModel(){
		return model;
	}
	
	public int getSize(){
		return size;
	}
	
	public int getChannel(){
		return channel;
	}
	
	public void setChannel(int channel){
		this.channel = channel;
	}
	
	public void channelUp(){
		int c = getChannel()+1;
		if(c>10)
			setChannel(1);
		else
			setChannel(c);
	}
	
	public void channelDown(){
		int c = getChannel()-1;
		if(c<1)
			setChannel(10);
		else
			setChannel(c);
	}
	
	public void play(){}
	
}

class SaleTV extends TV{
	private int price;
	
	public SaleTV(){
		
	}
	
	public SaleTV(int price, String model, int size, int channel){
		super(model, size, channel);
		this.price = price;
	}
	
	public void play(){
		System.out.println("�Ǹ� TV ä�� "+getChannel()+"���� ���θ� �÷��� �մϴ�.");
	}
	
	public void sale(){
		System.out.printf("%s ���� ��ǰ���Ǹ��մϴ�. %,d �� ������ �ּ���.\n",getModel(),price);
	}
	
	public String toString(){
		return "�ǸŻ�ǰ���� : �𵨸�("+getModel()+"), ����("+String.format("%,d",price)+"��), ũ��("+getSize()+")";
	}
}

class RentalTV extends TV implements Rentable{
	int price;
	
	RentalTV(){
		
	}
	
	RentalTV(int price, String model, int size, int channel){
		super(model, size, channel);
		this.price = price;
	}
	
	public void play(){
		System.out.println("�뿩 TV ä�� "+getChannel()+"���� ���θ� �÷��� �մϴ�.");
	}
	
	public void rent(){
		System.out.printf("%s ���� ��ǰ���뿩�մϴ�. %,d �� ������ �ּ���.\n",getModel(),price);
	}
	
	public String toString(){
		return "�뿩��ǰ���� : �𵨸�("+getModel()+"), ����("+String.format("%,d",price)+"��), ũ��("+getSize()+")";
	}
}

public class TVTest {

	public static void main(String[] args) {
		SaleTV s = new SaleTV(300000, "SALETV-1",40,1);
		RentalTV r = new RentalTV(100000, "RENTALTV-1",42,1);
		s.channelUp();
		s.channelUp();
		r.channelDown();
		r.channelDown();
		r.channelDown();
		printAllTV(s);
		printAllTV(r);
		printRentalTV(r);
	}
	
	static void printAllTV(TV tv){
		System.out.println(tv.toString());
		tv.play();
		if(tv instanceof SaleTV){
			((SaleTV) tv).sale();
		}
	}
	
	static void printRentalTV(Rentable tv){
		tv.rent();
	}

}
