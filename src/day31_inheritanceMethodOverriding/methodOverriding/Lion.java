package day31_inheritanceMethodOverriding.methodOverriding;

public class Lion extends Animal{

    private boolean isAfricanLion;

    public Lion(String name, String breed, String size, String color, char gender, int age, boolean isAfricanLion) {
        super(name, breed, size, color, gender, age);
         setAfricanLion(isAfricanLion);
    }

    public boolean isAfricanLion() {
        return isAfricanLion;
    }

    public void setAfricanLion(boolean africanLion) {
        isAfricanLion = africanLion;
    }

    @Override
    public void eat() {
        System.out.println("Lion "+ getName()+ "is eating deer");
    }

    //unique method for Lion subclass
    public void roar(){
        System.out.println("Lion "+getName()+" is roaring");
    }

/*
    @Override
    public String toString() {
        return  return getClass().getSimpleName() +"{" +
                "name='" + getName() + '\'' +
                ", breed='" + getBreed() + '\'' +
                ", size='" + getSize()+ '\'' +
                ", color='" + getColor() + '\'' +
                ", gender=" + getGender() +
                ", age=" + getAge() +
                "isAfricanLion=" + isAfricanLion +
                '}';
    } bu sekilde de yazilir get ile yazdik cünkü name age.... bunlar private.
 */

    @Override
    public String toString() {
        return super.toString().replace(" }", "") + // hem parent toStringte hmde isAfricanLion dan sonra  '}' var birini kaldrmak icin
                "isAfricanLion=" + isAfricanLion + '\'' +
                '}';
    } // super. bununla parent classtaki toString cagrilir
}
