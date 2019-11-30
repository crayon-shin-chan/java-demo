package czy.demo.lang.thread.feature;


import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import java.util.function.Supplier;

/** {@link CompletableFuture}是java8提供的新的{@link java.util.concurrent.Future}实现，提供了通知机制*/
public class CompletableFutureTest {

    public static void main(String[] args)throws Exception{
        //supplier();
        run();

    }

    public static void supplier(){
        Supplier<Integer> supplier = new Supplier<Integer>() {
            @Override
            public Integer get(){
                return 1;
            }
        };
        CompletableFuture future = CompletableFuture.supplyAsync(supplier);
        say(Thread.currentThread().getName());
        future.thenAccept(new Consumer() {
            @Override
            public void accept(Object o) {
                say(Thread.currentThread().getName());
                say(o);
            }
        });
        say("stop");
    }

    public static void run()throws Exception{
        CompletableFuture<Void> future = CompletableFuture.runAsync(new Runnable() {
            @Override
            public void run() {
                try{
                    say("1"+Thread.currentThread().getName());
                    Thread.sleep(2000);
                }catch (Exception e){

                }
            }
        });
        future.thenRun(new Runnable() {
            @Override
            public void run() {
                say("2"+Thread.currentThread().getName());
            }
        });
        Thread.sleep(3000);
    }

    private static void say(Object o){
        System.out.println(o);
    }



}
