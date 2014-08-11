package dessignPatterns.visitor.dzone;

import java.util.ArrayList;

public class ShoppingCart {
	// normal shopping cart stuff
	public Visitable[] items;

	public double calculatePostage() {
		// create a visitor
		PostageVisitor visitor = new PostageVisitor();
		// iterate through all items
		for (Visitable item : items) {
			item.accept(visitor);
		}
		double postage = visitor.getTotalPostage();
		return postage;

	}

	public static void main(String[] args) {
		Visitable[] items = new Visitable[2];
		Book book = new Book();
		book.setPrice(3d);
		book.setWeight(11d);
		items[0] = book;
		
		CD cd = new CD();
		cd.setPrice(3d);
		cd.setWeight(11d);
		items[1] = cd;
		
		ShoppingCart cart = new ShoppingCart();
		cart.items = items;
		
		System.out.println("Visitor result: " + cart.calculatePostage());
		
	}

}