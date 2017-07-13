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
		System.out.println("판매 TV 채널 "+getChannel()+"번의 프로를 플레이 합니다.");
	}
	
	public void sale(){
		System.out.printf("%s 모델의 상품을판매합니다. %,d 을 지불해 주세요.\n",getModel(),price);
	}
	
	public String toString(){
		return "판매상품정보 : 모델명("+getModel()+"), 가격("+String.format("%,d",price)+"원), 크기("+getSize()+")";
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
		System.out.println("대여 TV 채널 "+getChannel()+"번의 프로를 플레이 합니다.");
	}
	
	public void rent(){
		System.out.printf("%s 모델의 상품을대여합니다. %,d 을 지불해 주세요.\n",getModel(),price);
	}
	
	public String toString(){
		return "대여상품정보 : 모델명("+getModel()+"), 가격("+String.format("%,d",price)+"원), 크기("+getSize()+")";
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
