package czy.demo.thread.executor;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.logging.Logger;

/* 执行多Runnable任务示例 */
public class ExecuteManyRunnableTest {

    private static final Logger logger = Logger.getLogger(ExecuteManyRunnableTest.class.getName());

    private static final Integer[] arr = {0,1,2,3,4,5,6,7,8,9,10};


    public static void main(String[] args)throws Exception{
        ExecutorService executor = Executors.newSingleThreadExecutor();

        Object[] callables = Arrays.stream(arr).map((final Integer i)->new Callable<Integer>() {
                    @Override
                    public Integer call() throws Exception {
                        return i;
                    }
                }
        ).toArray();

        List<Callable<Integer>> list = new ArrayList<>();

        for(Object callable:callables){
            list.add((Callable<Integer>)callable);
        }

        List<Future<Integer>> results = executor.invokeAll(list);

        for(Future<Integer> future: results){
            logger.info("结果为："+future.get());
        }
    }

}
