package czy.demo.lang.thread.feature;

/* 线程访问变量测试 */
public class AccessVariableTest {

    private static int age = 10;

    private String name = "张三";

    private Listener listener;

    private Thread thread1;

    private Thread thread2;

    /* 注意，这里不是线程直接访问实例变量，而是通过一个内部类访问实例变量 */
    private void init1(){
        int id = 1;
        listener = new Listener() {
            @Override
            public void onClick() {
                System.out.println("id为："+id);
                System.out.println("name为："+name);
                System.out.println("age为："+age);
            }
        };
        thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                listener.onClick();
            }
        });
    }

    private void init2(){
        int id = 2;
        thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("id为："+id);
                System.out.println("name为："+name);
                System.out.println("age为："+age);
            }
        });
    }

    private void say1(){
        thread1.start();
    }

    private void say2(){
        thread2.start();
    }

    public static void main(String[] args){
        AccessVariableTest test = new AccessVariableTest();
        //test.init1();
        //test.say1();
        test.init2();
        test.say2();
    }


}
