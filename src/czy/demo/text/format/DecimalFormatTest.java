package czy.demo.text.format;

import java.text.DecimalFormat;
import java.util.logging.Logger;

public class DecimalFormatTest {

    private static final Logger logger = Logger.getLogger(DecimalFormatTest.class.getName());

    public static void main(String[] args){
        /* 可以将数字格式化为指定位数 */
        DecimalFormat format = new DecimalFormat("#.00");
        logger.info(format.format(12));
        logger.info(format.format(12.1));
        logger.info(format.format(12.1213));
    }

}
