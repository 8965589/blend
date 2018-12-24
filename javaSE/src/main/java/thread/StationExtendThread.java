package thread;

/**
 * @Date 2018/12/10 14:05.
 * 模拟三个售票窗口同时出售20张票
 */
public class StationExtendThread {
    public static void main(String[] args) {
        StationExtend s1 = new StationExtend("窗口1");
        StationExtend s2 = new StationExtend("窗口2");
        StationExtend s3 = new StationExtend("窗口3");
        s1.start();
        s2.start();
        s3.start();
    }
}

class StationExtend extends Thread {
    //通过构造方法 给 线程 名字 赋值
    public StationExtend(String threadName) {
        super(threadName);
    }

    //为保持票数一致,票数要静态

    static int tick = 20;

    //创建一个静态钥匙

    static Object ob = "aa";

    //重写run方法
    @Override
    public void run() {
        while (tick > 0) {
            synchronized (ob) {
                if (tick > 0) {
                    System.out.println(getName() + "卖出了第" + tick + "张票");
                    tick--;
                } else {
                    System.out.println("票卖完了");
                }
            }

            try {
                sleep(1000L);//休息一秒钟
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }
}