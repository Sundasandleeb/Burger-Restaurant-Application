
public class main {

	public static void main(String[] args) {
	Hamburger hamburger = new Hamburger("Large size", "chicken", "White rye", 15.0);
	double price = hamburger.itemizeHamburger();
	hamburger.addHamburgerAddition1("Onion", 1.5);
	hamburger.addHamburgerAddition2("Tomato", 1.0);
	hamburger.addHamburgerAddition3("Cheese", 2.0);
	hamburger.addHamburgerAddition4("Lettuce", 1.30);
	
	
	System.out.println("Total Burger price is " + hamburger.itemizeHamburger());
	
	HealthyBurger healthyburger = new HealthyBurger("Basic burger", 12);
	healthyburger.addHamburgerAddition1("Sausages", 2.0);
	healthyburger.addHamburgerAddition2("Sauce", 1.5);
	System.out.println("total price for burger "+healthyburger.itemizeHamburger());
	
	DeluxeBurger deluxeburger = new DeluxeBurger();
	deluxeburger.addHamburgerAddition1("chips", 2.0);
	deluxeburger.addHamburgerAddition2("drinks", 2.5);
	deluxeburger.addHamburgerAddition3("cheese", 1.5);
	System.out.println("total price for deluxeburger "+deluxeburger.itemizeHamburger());
	}
	
}
