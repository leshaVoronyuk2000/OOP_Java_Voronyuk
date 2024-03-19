import Service.*;
import Domain.*;
import java.util.List;
import java.util.ArrayList;

public class MainProgram {

	public static void main(String[] args) {
		CoinDispencer coinDispencer = new CoinDispencer();
		Holder holder = new Holder();
		Display display = new Display();
		List<Product> products = new ArrayList<>();
		
		Product item1 = new Product("Lays",80,1);
		Product item2 = new Product("Mars",65,2);
		Product item3 = new Product("Twix",59,3);
		Product item4 = new Bottle("Bonaqua",40,4,0.5f);
		Product item5 = new HotDrink("tea",30,5,39);
		Product item6 = new HotDrink("coffee",35,6,39);
		
		
		products.add(item1);
		products.add(item2);
		products.add(item3);
		products.add(item4);
		products.add(item5);
		products.add(item6);
		
		VendingMachine vm = new VendingMachine(coinDispencer,holder,display,products);
		
		for(Product prod : vm.getProducts()) {
			System.out.println(prod);
		}
				
	}

}
