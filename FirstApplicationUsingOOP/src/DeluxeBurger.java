
public class DeluxeBurger extends Hamburger {

	public DeluxeBurger() {
		super("Deluxe burger", "beef", "brown rye", 19.50);
		super.addHamburgerAddition1("chips", 2.5);
		super.addHamburgerAddition2("drinks", 2.5);
		
	}

	@Override
	public void addHamburgerAddition1(String name, double price) {
		System.out.println("No addition can be made to deluxe burger");
	}

	@Override
	public void addHamburgerAddition2(String name, double price) {
		System.out.println("No addition can be made to deluxe burger");
	}

	@Override
	public void addHamburgerAddition3(String name, double price) {
		System.out.println("No addition can be made to deluxe burger");
	}

	@Override
	public void addHamburgerAddition4(String name, double price) {
		System.out.println("No addition can be made to deluxe burger");
	}



}
