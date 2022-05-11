public class Hamburger {
    private String name;
    private String breadRollType;
    private String meat;
    private double price;


    private double tomatoPrice;
    private double lettucePrice;
    private double onionPrice;
    private double carrotPrice;


    public Hamburger(String name, String breadRollType, String meat, double price) {
        this.name = name;
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.price = price;
    }

    public void addTomato(double price){
        this.tomatoPrice = price;
        System.out.println("Added Tomato");
    }

    public void addLettuce(double price){
        this.lettucePrice = price;
        System.out.println("Added Lettuce");
    }

    public void addOnion(double price){
        this.onionPrice = price;
        System.out.println("Added Onion");
    }

    public void addCarrot(){
        double priceOfCarrot = 0.5;
        this.price += priceOfCarrot;
        System.out.println("Added Carrot");
    }


}
