
public class Human implements Valuable {
	String name;
	int age;
	public Human(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	@Override
	public double EstimateValue(int month) {
		double value = Double.POSITIVE_INFINITY;
		return value;
	}
	public double EstimateValue(){
		double value = Double.POSITIVE_INFINITY;
		return value;
	}
	@Override
	public String toString(){
		return String.format("Human name: %s\nregistered age: %s",name,age);
	}
	public double getAge(){
		return age;
	}
}
