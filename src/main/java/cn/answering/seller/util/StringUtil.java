package cn.answering.seller.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by zjp on 2018/1/19.
 * QQ：34948062
 * github: https://www.github.com/zjp1029
 * web： http://www.zjp1029.cn
 */
public class StringUtil {
    public static Boolean isNull(Object str){
        return (str == null || str.toString().trim() == "");
    }

    /**
     * 判断字符串不为空
     * @param str
     * @return
     */
    public static Boolean isNotNull(Object str){
        if(str!=null){
            if(!("").equals(str.toString().trim()))
                return true;
            else
                return false;
        }else{
            return false;
        }
    }

    /**
     *
     */
    public static String removeSpace(String str){
        if(isNotNull(str)){
            str = str.trim();
        }
        return str;
    }

    public static boolean isNumeric(String str){
        Pattern pattern = Pattern.compile("[0-9]*");
        Matcher isNum = pattern.matcher(str);
        if( !isNum.matches() ){
            return false;
        }
        return true;
    }
}
