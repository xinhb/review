package 线程;
/**
 * 创建线程的方法一:继承Thread类,覆盖run方法
 *
 * */
public class MyThread extends Thread {
    private int i;
    @Override
    public void run() {
        for ( ; i < 20 ; i++) {
            System.out.println(this.getName()+":" + i);
        }
    }
    public static void main(String[] args) {
        for (int i = 0; i < 1000 ; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
            /**
             * 1、用匿名对象是因为该对象只在启动一个线程时用
             * 2、start方法只能保证线程处于就绪态，能否运行需要与其它线程抢cpu时间片
             * */
            if (i == 20) {
                new MyThread().start();
                new MyThread().start();
            }
        }
    }
}
