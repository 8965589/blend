package thread;

/**
 * @Date 2018/12/10 14:57.
 */
public class StationImplementRunnable {
    public static void main(String[] args) {
        Station station = new Station(new Object(),20 );//窗口类
        new Thread(station,"窗口1").start();
        new Thread(station,"窗口2").start();
        new Thread(station,"窗口3").start();
    }
}

class Station implements Runnable {
    private Object object;

    private int ticketNum;

    public Station(java.lang.Object object, int ticketNum) {
        this.object = object;
        this.ticketNum = ticketNum;
    }

    @Override
    public void run() {
        while (ticketNum > 0) {
            synchronized (object) {
                if (ticketNum <= 0) {
                    System.out.println(Thread.currentThread().getName() + "没有票了");
                } else {
                    System.out.println(Thread.currentThread().getName() + "卖出了一张票，剩余" + --ticketNum + "张票");
                    try {
                        Thread.sleep(1000L);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }


}