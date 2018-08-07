package czy.demo.util.math.random;

import java.util.Random;

public class RandomTest {

    /* 种子相同、最大值相同情况下，生成随机数序列也是相同的 */
    public static void main(String[] args){

        Random random1 = new Random();
        Random random2 = new Random(1);
        Random random3 = new Random(1);

        say("第一个Random生成5个随机数：");
        for(int i=0;i<5;i++){
            say("生成弟"+(i+1)+"个随机数："+random1.nextInt(10000));
        }

        say("第二个Random生成5个随机数：");
        for(int i=0;i<5;i++){
            say("生成弟"+(i+1)+"个随机数："+random2.nextInt(10000));
        }

        say("第三个Random生成5个随机数：");
        for(int i=0;i<5;i++){
            say("生成弟"+(i+1)+"个随机数："+random3.nextInt(10000));
        }
    }

    public static void say(Object o){
        System.out.println(o);
    }

}
