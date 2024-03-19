package Domain;

public class Bottle extends Product{
	
	private float volume;
	public Bottle(String name,int price,int pos,float volume) {
		super(name,price,pos);
		if (volume > 0)
			this.volume = volume;
		else
			this.volume = 0.5f;
	}
	
	@Override 
	public String toString() {
		return super.toString() + ", объем " + this.volume;
	}
}
