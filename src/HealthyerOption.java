public class HealthyerOption extends BasicBurger{
    private String healthyName1;
    private double healthyPrice1;

    private String healthyName2;
    private double healthyPrice2;

    public HealthyerOption(String meat, double price) {
        super("Healthy Burger", meat, price, "Whole gains Bread");

    }

    public void addHealthyAditional1(String name, double price) {
        this.healthyName1 = name;
        this.healthyPrice1 = price;

    }

    public void addHealthyAditional2(String name, double price) {
        this.healthyName2 = name;
        this.healthyPrice2 = price;

    }

    @Override
    public double totalPrice() {
        double hamburgerPrice =  super.totalPrice();
        if (this.healthyName1 != null){
            hamburgerPrice += this.healthyPrice1;
            System.out.println("Extra: \n \t - " + this.healthyName1);
        }

        if (this.healthyName2 != null){
            hamburgerPrice += this.healthyPrice2;
            System.out.println("Extra: \n \t - " + this.healthyName2);
        }
        return hamburgerPrice;
    }
}
