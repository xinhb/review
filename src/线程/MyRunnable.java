package 线程;
/**
 * 实现Runnable接口的方式创建线程
 * */

public class MyRunnable implements Runnable {
    private int i;

    @Override
    public void run() {
        for (; i < 20; i++) {
            System.out.println(Thread.currentThread().getName() +":"+ i);
        }
    }
    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            System.out.println(Thread.currentThread().getName()+":"+ i);
            if (i == 100) {
                new Thread(new MyRunnable()).start();
                new Thread(new MyRunnable()).start();
            }
        }
    }
}
