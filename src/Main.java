
import java.util.concurrent.Semaphore;


public class Main {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(2);
        Car car1 = new Car( "Автобус 1",semaphore);
        Car car2 = new Car( "Автобус 2",semaphore);
        Car car3 = new Car( "Автобус 3",semaphore);
        Car car4 = new Car( "Автобус 4",semaphore);
        Car car5 = new Car( "Автобус 5",semaphore);
        Car car6 = new Car( "Автобус 6",semaphore);
        Car car7 = new Car( "Автобус 7",semaphore);
        Car car8 = new Car( "Автобус 8",semaphore);
        goCar(car1,car2,car3,car4,car5,car6,car7,car8);
    }



    public static void goCar(Car car1, Car car2,Car car3,Car car4,Car car5,Car car6,Car car7,Car car8) {
        car1.start();
        car2.start();
        car3.start();
        car4.start();
        car5.start();
        car6.start();
        car7.start();
        car8.start();
    }
}