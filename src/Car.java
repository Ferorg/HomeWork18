import java.util.concurrent.Semaphore;

public class Car extends Thread {

    private Semaphore semaphore;

    public Car( String name,Semaphore semaphore) {
        super(name);
        this.semaphore=semaphore;
    }
    public void run() {
        for (int i = 1; i <= 5; i++) {
            checkEmptySlot(i);
        }
    }





    private void checkEmptySlot(int i)  {
        try {
            if ((i == 3)) {
                semaphore.acquire();
                getStatus(i);
                semaphore.release();
            }else {
                System.out.println(getName() + " проехал " + i + " км.");
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    private void getStatus(int i){
        System.out.println(getName() + " остановился на остановке на  " + i + " км.");
        for (int j = 0; j < 5; j++) {
            System.out.println(getName() + " стоит на стоянке");
        }
        System.out.println(getName() + " продолжил путь");
    }
}

