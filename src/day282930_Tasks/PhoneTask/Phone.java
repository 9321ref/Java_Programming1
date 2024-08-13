package day282930_Tasks.PhoneTask;

public class Phone {

    private String brand,model,size,color;
    private double price;

    public Phone(String brand,String model,String size,String color,double price){
        setBrand(brand);
        setModel(model);
        setSize(size);
        setColor(color);
        setPrice(price);
    }

    public String getBrand(){
        return brand;
    }

    public void setBrand(String brand) {
        if((brand == null && brand.isEmpty() || brand.isBlank())){
            System.out.println("The 'brand', 'model', and 'color' must not be null, empty, or blank.");
            System.exit(1);
        }
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price < 0){
            System.out.println(" The 'price' must be greater than zero.");
            System.exit(1);
        }
        this.price = price;
    }

    public void call(int phoneNumber){
        System.out.println(getBrand() +"calling the number" + phoneNumber);
    }

    public void text(int phoneNumber){
        System.out.println(getBrand() +" texting to the number " + phoneNumber);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +"{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
/*
Phone Task Requirements:
        1. Create a custom class named 'Phone' with these specifications:
Attributes:
        - brand: String
       - model: String
       - size: String
       - price: double
       - color: String

Encapsulation:
        - All fields must be private with getters and setters.
Conditions for Encapsulation:
        - The 'brand', 'model', and 'color' must not be null, empty, or blank.
        - The 'price' must be greater than zero.

        Constructor:
        - Add a constructor to initialize all fields.

        Actions:
        - call(phoneNumber): Display "calling the number [phoneNumber]".
        - text(phoneNumber): Display "texting to the number [phoneNumber]".
        - toString(): Prints the information of the Phone object.
 */