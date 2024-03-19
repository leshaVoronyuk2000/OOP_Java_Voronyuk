package Domain;

public class HotDrink extends Product{
	private int temperature;
	public HotDrink(String name,int price, int pos,int temperature) {
		super(name,price,pos);
		this.temperature = temperature;
	}
	
	public String toString() {
		return super.toString() + ", температура " + this.temperature;
	}
}
