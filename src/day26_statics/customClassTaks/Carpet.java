package day26_statics.customClassTaks;

public class Carpet {

    public double width,length;
    public double unitPrice;
    public boolean isPersian = true;

    public Carpet(double width,double length,double unitPrice, boolean isPersian) {
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
    }

    public double calcCost(){
        // double area = width * length;
        // double totalCost = area * unitPrice;
        double totalCost = width * length * unitPrice;
        return totalCost + ((isPersian )? 200 : 0);
    }

    @Override
    public String toString() {
      /*
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice=" + unitPrice +
                ", isPersian=" + isPersian +
                '}';

       */
        return "Your " + (isPersian ? "persian " : "") + "carpet that is " + width + " x " + length + " and a unit price of $" + unitPrice + " costs a total of $" + calcCost();
    }//  eger persian ise "persian" yaz ve calcCost islemini ekle (200$) ekle degilse hic bi sey ekleme
}


/*
2. Create a custom class named Carpet with the following specifications:

    Attributes:
   			width
   			length
   			unitPrice
   			isPersian (boolean)

    Actions:
		calcCost(): calculate the total cost of the carpet and return it as a double.
   		toString(): display all the info of the carpet, including the total cost of the carpet as calculated by calcCost()

   Price calculation formula:
   		Total price of carpet = (width * length) * unitPrice
   		If the carpet is Persian, add $200 to the totalPrice

    Create another class named CarpetClients, create multiple carpet objects, and test each function of the carpet object.
 */