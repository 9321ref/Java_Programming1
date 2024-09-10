package day39_collection.multiThreading;

public class TestMultiThreading {
    public static void main(String[] args) {

        //Those multi thread are being executed at the same time,that is multi tread means(look console)
        ThreadHelloWorld thread1 = new ThreadHelloWorld(1);
        ThreadHelloWorld thread2 = new ThreadHelloWorld(2);
        ThreadHelloWorld thread3 = new ThreadHelloWorld(3);
        ThreadHelloWorld thread4 = new ThreadHelloWorld(4);

        thread1.start(); // run method executed with start method at the same time
        thread2.start();
        thread3.start();
        thread4.start();
/*
        thread1.run(); //
        thread2.run();
        thread3.run();
        thread4.run();

 */
    }
}
