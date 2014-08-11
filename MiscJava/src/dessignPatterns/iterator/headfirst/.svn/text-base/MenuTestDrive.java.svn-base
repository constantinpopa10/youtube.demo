package dessignPatterns.iterator.headfirst;

import java.util.ArrayList;

public class MenuTestDrive {

	@SuppressWarnings("serial")
	public static void main(String args[]) {
		final Menu pancakeHouseMenu = new PancakeHouseMenu();
		final Menu dinnerMenu = new DinnerMenu();

		Waitress waitress = new Waitress(new ArrayList<Menu>() {			

			{
				add(pancakeHouseMenu);
				add(dinnerMenu);
			}
		});
		waitress.printMenu();
	}
}
