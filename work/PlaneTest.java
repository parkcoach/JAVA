package work;

abstract class Plane{
	private String planeName;
	private int fuelSize;
	
	Plane(){}
	
	Plane(String planeName, int fuelSize){
		this.planeName = planeName;
		this.fuelSize = fuelSize;
	}
	
	public String getPlaneName(){
		return planeName;
	}
	
	public void setPlaneName(String planeName){
		this.planeName = planeName;
	}
	
	public int getFuelSize(){
		return fuelSize;
	}
	
	public void setFuelSize(int fuelSize){
		this.fuelSize = fuelSize;
	}
	
	public void refuel(int fuel){
		this.fuelSize += fuel;
	}
	
	abstract public void flight(int distance);
	
}

class Airplane extends Plane{
	Airplane(){
		this("L747",1000);
	}
	
	Airplane(String planeName, int fuelSize){
		super(planeName, fuelSize);
	}
	
	public void flight(int distance){
		super.setFuelSize(super.getFuelSize()-(distance*3));
	}
}

class Cargoplane extends Plane{
	Cargoplane(){
		this("C40",1000);
	}
	
	Cargoplane(String planeName, int fuelSize){
		super(planeName, fuelSize);
	}
	
	public void flight(int distance){
		super.setFuelSize(super.getFuelSize()-(distance*5));
	}
}

public class PlaneTest {

	public static void main(String[] args) {
		Airplane a = new Airplane();//객체 생성
		Cargoplane c = new Cargoplane();
		printTitle(); //생성된 객체의 정보 출력
		printInfo(a);
		printInfo(c);
		
		System.out.println("\n[100 운항]");
		a.flight(100); c.flight(100); //100 운항
		printTitle(); //객체 정보 출력
		printInfo(a);
		printInfo(c);
		
		System.out.println("\n[200 주유]");
		a.refuel(200); c.refuel(200); //200 주유
		printTitle(); //객체 정보 출력
		printInfo(a);
		printInfo(c);
	}
	
	public static void printInfo(Plane list) {
		System.out.println(list.getPlaneName()+"\t"+list.getFuelSize());
	}
	
	public static void printTitle(){
		System.out.println("Plane\tfuelSize");
		System.out.println("------------------");
	}

}