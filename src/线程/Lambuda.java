package 线程;
/**
 * 1、匿名内部类创建线程
 * 2、Lambuda表达式创建线程
 * */

public class Lambuda {

    public static void main(String[] args) {
        /**
         * 匿名内部类，此时有主线程和创建的线程
         * */
        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(this.getName() + ":" + i);
                }
            }
        }.start();

        /**
         * 实现Runnable接口的匿名内部类，创建线程
         * */
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName() + ":" + i);
                }
            }
        }).start();

        /**
         * lambuda:接口中方法唯一时用，重写接口唯一方法是关键（关注方法体）
         * 本质是用这用形式代替用原来接口创建对象的过程
         * */
        new Thread(() ->
             {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName() + ":" + i);
                }
            }
        ).start();
    }
}
