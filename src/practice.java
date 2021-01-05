import java.util.*;

public class practice {
	public static void main(String[] args) {



	}  //end of main
} //end of class

class Customer {
	public void order(String menuName, Menu menu, Barista barista) {
		Menuitem menuItem = menu.choose(menuName);
		Coffee coffee = barista.makeCoffee(menuItem);

	}
}

public class MenuItem{
	private String name;
	private int price;

	public MenuItem(String name int price) {
		this.name = name;
		this.price = price;
	}
	public int cost() {
		return price;
	}
	public String getName() {
		return name;
	}
}

class Menu{
	private List<MenuItem> items;

	public Menu(List<MenuItem> items){
		this.items = items;
	}

	public MenuItem choose(String name) {
		for(MenuItem each : items) {
			if(each.getName().equals(name)) {
				return each;
			}
		}
		return null;
	}
}  //end of class Menu

class Barista {
	public Coffee makeCoffee(MenuItem menuItem) {
		Coffee coffee = new Coffee(menuItem);
		return coffee;
	}
}

class Coffee {
	private String name;
	private int price;

	public Coffee(MenuItem menuItem) {
		this.name = menuItem.getName();
		this.price = menuItem.cost();
	}
}