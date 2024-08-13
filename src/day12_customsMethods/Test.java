package day12_customsMethods;

public class Test {

    public static void main(String[] args) {

        int  number = 300;

        CustomMethodsWithParameter.oddOrEven(300); // 300 is even number -> eski olusturdugumuz methodu bska class dan getirdi.bir daha if statement yazmadik


        String firstName = "Vasyl",
                lastName = "Murodova";

        CustomMethodsWithParameter.initial(firstName, lastName);

    }

}
