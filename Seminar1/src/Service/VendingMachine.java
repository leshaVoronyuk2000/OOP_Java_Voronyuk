package Service;
import java.util.List;
import Domain.Product;

public class VendingMachine {
	private CoinDispencer coinDispencer;
	private Holder holder;
	private Display display;
	private List<Product> products;
	
	public VendingMachine(CoinDispencer coinDispencer,Holder holder,Display display,List<Product> products) {
		this.coinDispencer = coinDispencer;
		this.holder = holder;
		this.display = display;
		this.products = products;
	}
	
	public CoinDispencer getCoinDispencer() {
		return this.coinDispencer;
	}
	
	public Holder getHolder() {
		return this.holder;
	}
	
	public Display getDisplay() {
		return this.display;
	}
	
	public List<Product> getProducts(){
		return this.products;
	}
}
