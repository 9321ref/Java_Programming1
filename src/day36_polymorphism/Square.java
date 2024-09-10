package day36_polymorphism;

public class Square {

    private double side;

    public Square(double side) {
        this.side = side;
    }

    //Equal method used for comparing all the Object
    @Override
    public boolean equals(Object obj) { //equals() metodunda bu kontrol, obj nesnesinin gerçekten Square sınıfına ait olup olmadığını anlamamızı sağlar.

        if(!(obj instanceof Square)){   //instanceof operatörü: Bu, verilen obj nesnesinin Square sınıfından olup olmadığını kontrol eder.
            System.err.println("Invalid Object, Object must be square");
            System.exit(1);
        }

        if(side == ((Square)obj).side ){ // down casting
            return true;
        }
        return false;
    }
}

