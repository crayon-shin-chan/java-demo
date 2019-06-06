package czy.demo.util.structure.list;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/* 数组列表与链表的比较 */
public class ArrayAndLink {

    public static void main(String[] args){

        /* 目前ArrayList性能要好于LinkedList，规律有些乱 */
        List<String> list1 = new ArrayList<>();

        System.out.println("插入数组列表");
        batchInsert(list1);
        batchInsert(list1);
        batchInsert(list1);

        List<String> list2 = new LinkedList<>();

        System.out.println("插入链表");
        batchInsert(list2);
        batchInsert(list2);
        batchInsert(list2);
    }

    public static void batchInsert(List<String> list){
        Date date1 = new Date();
        for(int i=0;i<1000000;i++){
            list.add("字符串"+i+date1.toString());
        }
        Date date2 = new Date();
        System.out.println("本次插入耗时："+(date2.getTime()-date1.getTime())+"毫秒");
    }



}




