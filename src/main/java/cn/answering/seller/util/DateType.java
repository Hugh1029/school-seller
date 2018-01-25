package cn.answering.seller.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by zjp on 2018/1/19.
 * QQ：34948062
 * github: https://www.github.com/zjp1029
 * web： http://www.zjp1029.cn
 */
public class DateType {

    /**
     * 时间转换成字符串，用于文件夹的生成
     * @param date
     * @return
     */
    public static String dateToString(Date date){
        SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmm");
        return df.format(date);
    }
}
