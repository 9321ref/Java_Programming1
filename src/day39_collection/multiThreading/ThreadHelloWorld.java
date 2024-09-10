package day39_collection.multiThreading;

public class ThreadHelloWorld extends Thread{

    int threadNumber;

    public ThreadHelloWorld(int threadNumber){
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        for (int i = 1; i < 6; i++) {
            System.out.println("Hello World "+i + " from Thread "+threadNumber);

            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
/*
Muhtar custom thread class neden diyor ?

Bir sınıfa "custom" (özel) denilmesinin nedeni, o sınıfın standart, önceden tanımlanmış sınıflardan
(örneğin, Java'nın kütüphanelerindeki hazır sınıflardan) türetilmiş veya onlara dayalı olarak özelleştirilmiş olmasıdır.
Başka bir deyişle, standart bir sınıfın davranışını genişleterek veya değiştirerek,
belirli bir ihtiyaç veya amacı karşılayacak şekilde yeniden tasarladığınızda, bu sınıfa "custom" sınıf denir.
 */