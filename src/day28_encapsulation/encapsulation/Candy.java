package day28_encapsulation.encapsulation;

public class Candy {

    private String brand;
    private int quantity;
    private double price;
    private boolean hasPeanuts;

    public Candy(String brand,int quantity,double price,boolean hasPeanuts){
        this.brand = brand;
        setQuantity(quantity);
        setPrice(price);
        this.hasPeanuts = hasPeanuts;


    }

    public String getBrand(){
        return brand;
    }
    public void setBrand(String Brand){
        this.brand = brand;
    }
    public int getQuantity(){
        return quantity;
    }
    public void setQuantity(int quantity){
        if(quantity <= 0) {
            System.out.println("The quantity of candy cannot be set to zero or a negative value.");
            System.exit(1);
    }
        this.quantity = quantity;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        if( price <= 0){
            System.out.println("The price of candy cannot be set to a negative value");
            System.exit(1);
        }
        this.price = price;
    }

    public boolean getHasPeanuts(){
        return hasPeanuts;
    }

    public void setHasPeanuts(boolean hasPeanuts){
        this.hasPeanuts = hasPeanuts;

    }

    @Override
    public String toString() {
        return "Candy{" +
                "brand='" + brand + '\'' +
                ", quantity=" + quantity +
                ", price=" + (price == 0 ? "zero" : 0) +
                ", hasPeanuts=" + hasPeanuts +
                '}';
    }
}
