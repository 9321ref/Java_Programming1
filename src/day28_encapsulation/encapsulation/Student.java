package day28_encapsulation.encapsulation;

public class Student {

    private String name;

    private int age; // if it is private,anyone can not access it code



    public String getName() {

        if(name == null){ // eger isim null ise yani object deil.
            System.err.println("Name has not been set");
            System.exit(1);
        }
        return name;
    }


    public void setName(String name) {

        boolean hasDigit = false, hasSpecialChar = false;

        for (char each : name.toCharArray()) {

            if (Character.isDigit(each)) {
                hasDigit = true;
                break;
            }
        }

            if(hasDigit){
                System.err.println("Invalid name: "+name);
                System.exit(1);
            }

            this.name = name;
        }






    //READ
    public int getAge(){  //--> getter public instance method.used for reading private

        if( age == 0 ){
            System.err.println("Age has not been set");
            System.exit(1);
        }
        return age;
    }

    // WRITE
    public void setAge(int age){ //--> setter public instance method with return type of void.yazdirmak icin method

        if( age < 1 || age > 100){
            System.err.println("Invalid Age: "+age);
             //return; // exiting the method .eger kosul sagliyorsa direk sout return yapar. this.age 0 döner
            System.exit(1); // program gets terminated
        }
        this.age = age; // ikinci age parametrenn yannda ki.instance variable olan age "this.age" assign ettik

    }


}

