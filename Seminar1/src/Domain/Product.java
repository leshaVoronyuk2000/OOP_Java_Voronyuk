package Domain;

public class Product {
	private String name;
	private int price;
	private int pos;
	
	public Product(String name,int price,int pos){
		this.name = name;
		if(price > 0)
			this.price = price;
		else
			this.price = 100;
		this.pos = pos;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setPrice(int price) {
		if(price > 0)
			this.price = price;
		else
			this.price = 100;
	}
	
	public int getPrice() {
		return this.price;
	}
	
	public void setPos(int pos) {
		this.pos = pos;
	}
	
	public int getPos() {
		return this.pos;
	}
	
	@Override 
	public String toString() {
		return this.name + ", цена " + this.price + ", позиция " + this.pos;
	}
}
