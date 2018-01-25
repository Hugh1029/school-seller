package cn.answering.seller.util;

import com.github.qcloudsms.SmsSingleSender;
import com.github.qcloudsms.SmsSingleSenderResult;
import com.github.qcloudsms.httpclient.HTTPException;

import java.io.IOException;

/**
 * Created by zjp on 2018/1/17.
 * QQ：34948062
 * github: https://www.github.com/zjp1029
 * web： http://www.zjp1029.cn
 *
 * 该类为利用腾讯云发送短信功能
 */
public class SendMessage {
    /*
    * 必备参数
    * appid: 短信应用的AppID
    * aappkey: 短信应用的Appkey
    * phone: 发送短信的手机号
    * templateId：短信模板
    * */

    private static int appid = 1400062806;
    private static String appkey = "4fc68e679a46d8f95b7a144f558f7c2d";
    private static SmsSingleSender sender = new SmsSingleSender(appid, appkey);
    private static int templateId1 = 78013;     //注册短信模板,一个参数[短信验证码]
    private static int templateId2 = 78017;     //动态登录短信模板，一个参数[短信验证码]
    private static int templateId3 = 78020;     //普通验证码短信模板，2个参数,

    public static void sendRegisterCode(String phone, String code) {
        sendMessage(templateId1, phone, new String[] {code});
    }

    public static void sendLoginCode(String phone, String code) {
        sendMessage(templateId2, phone, new String[] {code});
    }

    public static void sendNormalCode(String phone, String info,  String code) {
        sendMessage(templateId3, phone, new String[] {info, code});
    }

    /**
     * 发送单条短信
     * @param tenplateId 模板ID
     * @param phone 手机号
     * @param params 参数列表
     */
    public static void sendMessage(int tenplateId, String phone, String[] params) {
        try {
            SmsSingleSenderResult result = sender.sendWithParam("86",phone,tenplateId,params,"","","");
            System.out.println(result);
        } catch (HTTPException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
