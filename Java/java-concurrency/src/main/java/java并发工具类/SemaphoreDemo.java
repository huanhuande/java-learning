package java并发工具类;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class SemaphoreDemo {
    private static Semaphore semaphore=new Semaphore(5);


    public static void main(String[] args) {
        ExecutorService service=Executors.newFixedThreadPool(10);
        for (int i = 0; i <10; i++) {
            service.execute(() ->{
                try {
                    System.out.println(Thread.currentThread().getName()+"同学准备获取笔.....");
                    semaphore.acquire();
                    System.out.println(Thread.currentThread().getName()+"同学获取到笔.....");
                    System.out.println(Thread.currentThread().getName()+"填写表格中.....");
                    TimeUnit.SECONDS.sleep(3);
                    semaphore.release();
                    System.out.println(Thread.currentThread().getName()+"填完表格了归还笔");

                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            });
        }
        service.shutdown();
    }


}
