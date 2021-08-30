public class Main {
    public static void main (String[] args){
        BasicBurger basicBurger = new BasicBurger("Hamburger", "Beef", 4.9, "Basic");
        basicBurger.addHamburgerAddition1("Tomato", 0.5, 2);
        basicBurger.addHamburgerAddition2("Bacon", 0.9, 3);
        basicBurger.addHamburgerAddition3("Onion", 0.2, 1);
        basicBurger.addHamburgerAddition4("Souce", 0.2, 3);
        System.out.println(basicBurger.totalPrice());

        HealthyerOption healthyerOption = new HealthyerOption("Grilled Chicken", 10.2);
        healthyerOption.addHealthyAditional1("Tomato", 0.5);
        healthyerOption.addHealthyAditional2("Special Souce", 0.9);
        System.out.println(healthyerOption.totalPrice());

        DeluxBurger deluxBurger = new DeluxBurger();
        System.out.println(deluxBurger.totalPrice());
    }
}
