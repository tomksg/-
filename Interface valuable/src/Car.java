
public class Car implements Valuable{
	String name;
	double price;
	int month;
	public Car(String name,double price){
		this.name = name;
		this.price = price;
		month = 0;
	}
	@Override
	public double EstimateValue(int month) {
		if(this.month==0){
			price = price * 0.8;			
		}
		this.month = month;
	
		for(int i = this.month;i>0;i--){
			price = price * 0.99;
		}
		return price;
	}
	@Override
	public String toString(){
		return String.format("car name: %s\ninitial price: %s",name,getPrice());
	}
	public double getPrice(){
		return price;
	}
}