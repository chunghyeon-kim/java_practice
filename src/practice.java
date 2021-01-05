import java.util.*;

public class practice {
	public static void main(String[] args) {



<<<<<<< HEAD
		int[][] arr = {
				{1,2,3,4,5},
				{1,2,1,1,1},
				{1,1,3,4,5}
		};
        
		int[][] arr2 = arr.clone();
		
		System.out.println(Arrays.deepToString(arr2));
		
    }   //end of main

}  //end of class

=======
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
>>>>>>> ce0f59cbf9a52dbc9845ca48359eb7b0404f1d35
