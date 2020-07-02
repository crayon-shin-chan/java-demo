package czy.demo.util.date.date;

import java.util.Date;

public class DateTest {

	public static void main(String[] args) {

		/*无参构造函数,内部使用当前unix时间戳构造Date对象,返回当前时间*/
		Date date1 = new Date();
		/*打印时间为本地时间*/
		System.out.println("当前时间为:"+date1);
		System.out.println("当前unix时间戳为:"+System.currentTimeMillis());
		
		Date date2 = new Date(System.currentTimeMillis()-3600*1000);
		System.out.println("一小时之前时间为:"+date2);
		System.out.println("一小时之前unix时间戳为:"+date2.getTime());
		
		Date date3 = new Date(118,2,20);
		System.out.println("年月日构造时间为:"+date3);
		System.out.println("年月日构造时间的unix时间戳为:"+date3.getTime());
		
		Date date4 = new Date(118,2,20,12,20,40);
		System.out.println("年月日时分秒构造时间为:"+date4);
		System.out.println("年月日时分秒构造时间的unix时间戳为:"+date4.getTime());
		
		/*这个字符串构造Date没用对*/
		Date date5 = new Date("Sun Jul 01 14:37:41 CST 2018");
		System.out.println("字符串构造时间为:"+date5);
		System.out.println("字符串构造时间的unix时间戳为:"+date5.getTime());
		
		System.out.println("date1是否在date2之前:"+date1.before(date2));
		System.out.println("date1是否在date2之后:"+date1.after(date2));
		
		System.out.println("date1的哈希码为:"+date1.hashCode());
		/*得到的是分钟值,如当前东八区,返回-480,即减去480分钟即为0时区时间*/
		System.out.println("date1的时区偏移为:"+date1.getTimezoneOffset());
		/*格式为Sun Jul 01 14:37:41 CST 2018*/
		System.out.println("date1字符串格式为:"+date1.toString());
		/*locale格式为2018-7-1 14:37:41*/
		System.out.println("date1的locale字符串格式为:"+date1.toLocaleString());
		/*格式为1 Jul 2018 06:37:41 GMT*/
		System.out.println("date1的GMT格式字符串为:"+date1.toGMTString());
		/*年份为1900年之后的增量,如当前2018年,返回值为118*/
		System.out.println("当前年份为:"+date1.getYear());
		/*月份为6*/
		System.out.println("当前月份为:"+date1.getMonth());
		/*getDay返回的日期为一个星期当中的日期,从星期天到星期六分别为0到6*/
		System.out.println("当前日期为:"+date1.getDay());
		/*getDate返回的日期为一个月中的日期数*/
		System.out.println("当前月日期为:"+date1.getDate());
		System.out.println("当前小时为:"+date1.getHours());
		System.out.println("当前分钟为:"+date1.getMinutes());
		System.out.println("当前秒为:"+date1.getSeconds());
	}

}
