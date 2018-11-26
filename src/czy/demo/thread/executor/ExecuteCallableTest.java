package czy.demo.thread.executor;


import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.logging.Logger;

/* 执行Callable任务示例 */
public class ExecuteCallableTest {

    private static final Logger logger = Logger.getLogger(ExecuteCallableTest.class.getName());

    public static void main(String[] args)throws Exception{
        ExecutorService executor = Executors.newSingleThreadExecutor();

        Future<Integer> future = executor.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return 1;
            }
        });

        logger.info("任务执行返回结果为："+future.get());
    }


}
