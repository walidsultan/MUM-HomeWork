package lesson7.lecture.interfacestatic;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
public class Main {

	public static void main(String[] args) {
		Item item1 = new Item(15.00, .07, "Tissue");
		Item item2 = new Item(11.25, .07, "Nuts");
		Item item3 = new Item(13.10, .07, "Oranges");
		Item item4 = new Item(25.00, .07, "Tea");
		Item item5 = new Item(17.60, .07, "Tofu");
		
		List<Item> ordinary = new ArrayList<>();
		ordinary.add(item1);
		ordinary.add(item2);
		ordinary.add(item3);
		
		List<Item> gold = new ArrayList<>();
		gold.add(item4);
		gold.add(item5);
		
		ShoppingCart cartOrd 
		   = new ShoppingCartOrdinary("Joe Ordinary", ordinary,
		      LocalDate.of(2015, 6, 10));
		ShoppingCart cartGold 
		   = new ShoppingCartGoldMember("Jim Special", gold,
		      LocalDate.of(2015, 6, 10), .05);
		System.out.println(cartOrd.printReceipt());
		System.out.println(cartGold.printReceipt());
	}

}
