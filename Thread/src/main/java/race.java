public class race {
    public static void main(String[] args) {
        startrace startrace=new startrace();
        new Thread(startrace,"兔子").start();
        new Thread(startrace,"乌龟").start();
    }
}
class startrace implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            if(Thread.currentThread().getName()=="兔子"&&i%10==0){
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName()+"跑了"+i);
        }
        System.out.println(Thread.currentThread().getName()+"跑完了");
    }
}
