package cn.answering.seller.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.UUID;

/**
 * Created by zjp on 2018/1/19.
 * QQ：34948062
 * github: https://www.github.com/zjp1029
 * web： http://www.zjp1029.cn
 */
public class RandomNumber {


    /**
     * 短信随机六位验证的生成
     * @return
     */
    public static String getRandNum() {
        String charValue = "";
        for(int i=0;i<6;i++)
        {
            Random rd=new Random();
            charValue+=String.valueOf(rd.nextInt(10));
        }
        return charValue;
    }



    private static String[] chars = new String[] { "a", "b", "c", "d", "e", "f",
            "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s",
            "t", "u", "v", "w", "x", "y", "z", "0", "1", "2", "3", "4", "5",
            "6", "7", "8", "9", "A", "B", "C", "D", "E", "F", "G", "H", "I",
            "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V",
            "W", "X", "Y", "Z" };


    private static String generateShortUuid() {

        StringBuffer shortBuffer = new StringBuffer();
        String uuid = UUID.randomUUID().toString().replace("-", "");
        for (int i = 0; i < 8; i++) {
            String str = uuid.substring(i * 4, i * 4 + 4);
            int x = Integer.parseInt(str, 16);
            shortBuffer.append(chars[x % 0x3E]);
        }
        return shortBuffer.toString();
    }

    /**
     * 随机字符串生成，用于生成订单号等
     * @return
     */
    public static String character(){

        String s=generateShortUuid();
        SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmmssSSSS");
        String dateString = df.format(new Date());

        return s+dateString;
    }
}
