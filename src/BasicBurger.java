public class BasicBurger {
    private String name;
    private String meat;
    private double price;
    private String breadRoll;

    private double aditional1Price;
    private String aditional1Name;
    private int aditional1Quantity;

    private double aditional2Price;
    private String aditional2Name;
    private int aditional2Quantity;

    private double aditional3Price;
    private String aditional3Name;
    private int aditional3Quantity;

    private double aditional4Price;
    private String aditional4Name;
    private int aditional4Quantity;

    public BasicBurger(String name, String meat, double price, String breadRoll) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRoll = breadRoll;
    }

    public void addHamburgerAddition1(String name, double price, int quantity){
        this.aditional1Name = name;
        this.aditional1Price = price;
        this.aditional1Quantity = quantity;
    }

    public void addHamburgerAddition2(String name, double price, int quantity){
        this.aditional2Name = name;
        this.aditional2Price = price;
        this.aditional2Quantity = quantity;
    }

    public void addHamburgerAddition3(String name, double price, int quantity){
        this.aditional3Name = name;
        this.aditional3Price = price;
        this.aditional3Quantity = quantity;
    }

    public void addHamburgerAddition4(String name, double price, int quantity){
        this.aditional4Name = name;
        this.aditional4Price = price;
        this.aditional4Quantity = quantity;
    }

    public double totalPrice(){
        double hamburgerPrice = this.price;
        System.out.println(this.name + " hamburger on a " + this.breadRoll + " roll " + this.meat + " meat at " + hamburgerPrice + " price!");

        if (this.aditional1Name != null){
            hamburgerPrice += (this.aditional1Price * this.aditional1Quantity);
            System.out.println("Extra: \n \t - " + this.aditional1Name + " x " + this.aditional1Quantity);
        }

        if (this.aditional2Name != null){
            hamburgerPrice += (this.aditional2Price * this.aditional2Quantity);
            System.out.println("Extra: \n \t - " + this.aditional2Name + " x " + this.aditional2Quantity);
        }

        if (this.aditional3Name != null){
            hamburgerPrice += (this.aditional3Price * this.aditional3Quantity);
            System.out.println("Extra: \n \t - " + this.aditional3Name + " x " + this.aditional3Quantity);
        }

        if (this.aditional4Name != null){
            hamburgerPrice += (this.aditional4Price * this.aditional4Quantity);
            System.out.println("Extra: \n \t - " + this.aditional4Name + " x " + this.aditional4Quantity);
        }

        return hamburgerPrice;

    }

}
