package czy.demo.lang.thread.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.logging.Logger;

public class ExecuteRunnableTest {


    private static final Logger logger = Logger.getLogger(ExecuteRunnableTest.class.getName());

    private static Integer result = 1;

    public static void main(String[] args)throws Exception{

        /* 单线程执行器，执行任务与运行一个线程效果是一样的 */
        ExecutorService executor = Executors.newSingleThreadExecutor();

        /* 运行Runnable时也可以返回Future，此时只代表一个任务完成占位符，不返回任何结果 */
        Future<?> future = executor.submit(new Runnable() {
            @Override
            public void run() {
                logger.info("这是线程内部");
            }
        });

        logger.info("准备阻塞等待结果");

        /* get方法会一直阻塞到任务执行完成才返回 */
        future.get();
        logger.info("这是线程外部");

        /* 执行Runnable任务也可以有返回值，不过这个返回值是固定的，而不是由任务生成的，此处返回1 */
        Future<Integer> future1 = executor.submit(new Runnable() {
            @Override
            public void run() {
                result = 2;
            }
        }, result);

        logger.info("执行结果为："+future1.get());
    }


}
