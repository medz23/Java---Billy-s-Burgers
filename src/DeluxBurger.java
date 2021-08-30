public class DeluxBurger extends BasicBurger {
    public DeluxBurger() {
        super("Delux Ultra", "2 x Beef + extra bacon", 13.50, "Delux white roll");
        super.addHamburgerAddition1("Drink", 3.02, 1);
        super.addHamburgerAddition2("Fries", 1.1, 1);
    }

    @Override
    public void addHamburgerAddition1(String name, double price, int quantity) {

    }

    @Override
    public void addHamburgerAddition2(String name, double price, int quantity) {

    }

    @Override
    public void addHamburgerAddition3(String name, double price, int quantity) {

    }

    @Override
    public void addHamburgerAddition4(String name, double price, int quantity) {

    }
}
