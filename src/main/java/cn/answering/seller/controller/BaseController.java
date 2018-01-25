package cn.answering.seller.controller;

import cn.answering.seller.util.PageEntity;
import cn.answering.seller.util.StringUtil;
import org.slf4j.Logger;
import org.springframework.util.Assert;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by zjp on 2018/1/17.
 * QQ：34948062
 * github: https://www.github.com/zjp1029
 * web： http://www.zjp1029.cn
 *
 * 基础Controller，包含功能如下:
 * 读取与写入Cookie的值
 * 读取与写入Session的值
 */
public class BaseController {
    protected Logger logger;

    /**
     * 得到文件存取的真是路径
     * @param request
     * @param path
     * @return
     */
    public String getApplicationRealPath(HttpServletRequest request, String path){
        Assert.hasLength(path, "\"path\" can not be null or empty");
        Assert.isTrue(path.startsWith("/"), "\"path\" must start with \"\\\" ");
        return request.getSession().getServletContext().getRealPath(path);
    }


    /***********************************将指定的值写入到cookie中****************************************************/
    public void setValueToCookie(HttpServletRequest request, HttpServletResponse response, String name, String value){
        Cookie cookieOrderId = new Cookie(name,value);
        cookieOrderId.setMaxAge(60*30);
        response.addCookie(cookieOrderId);
    }

    /***************************从cookie获取制定的值**************************************************************/
    public String getValueFromCookie(HttpServletRequest request,String name){
        Cookie[] cookies = request.getCookies();
        String value = "";
        if(cookies!=null){
            for (int i = 0; i < cookies.length; i++)
            {
                Cookie c = cookies[i];
                if(c.getName().equalsIgnoreCase(name))
                {
                    value = c.getValue();
                }
            }
        }
        return value;
    }


    /*********************************将值写入session中一个小时*****************************************************/
    public void setValueToSession(String name,String value,HttpServletRequest request){
        HttpSession session = request.getSession();
        session.setMaxInactiveInterval(60*60);
        session.setAttribute(name, value);
    }

    /*********************************从session中获取相应的值*****************************************************/
    public String getSessionValue(String key,HttpServletRequest request){
        HttpSession  session = request.getSession();
        String value = (String) session.getAttribute(key);
        return value;
    }

    /*********************************从session中删除对应的值*****************************************************/
    public void removeValueFromSession(String key,HttpServletRequest request){
        HttpSession  session = request.getSession();
        session.removeAttribute(key);
    }

    /**************************************判断session中是否包含某个值**********************************************/
    public boolean isExistValueInSession(String key,HttpServletRequest request){
        HttpSession  session = request.getSession();
        String value = (String) session.getAttribute(key);
        if(StringUtil.isNotNull(value)){
            return true;
        }else {
            return false;
        }
    }

    /**************************************判断cookie中是否包含某个值**********************************************/

    public boolean isExistValueInCookie(HttpServletRequest request,String name){
        Cookie[] cookies = request.getCookies();
        String value = "";
        if(cookies!=null){
            for (int i = 0; i < cookies.length; i++)
            {
                Cookie c = cookies[i];
                if(c.getName().equalsIgnoreCase(name)){
                    value = c.getValue();
                }
            }
            if(StringUtil.isNotNull(value)){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }

    }


    /*********************************通知api接口发送短信验证码(注册、修改密码)*****************************************/


    /*********************************通知api接口发送下单成功验证码*****************************************/

    /*********************************PageBounds建立*************************************************************/
    /**
     * 无参建立
     * https://my.oschina.net/miemiedev/blog/135516
     * @return
     */


    /**
     * 第几页，一页多少条数据建立
     * @param limit
     * @param page
     * @return
     */


    /******************************查询到的分页数据转换成指定格式json串***********************************************/
    /**
     * 查询到的列表集合转成带总条数的格式
     * total为总条数.rows为查询到的记录
     * @param pageData
     * @return
     */
   /* public String buildPageData(List pageData){
        if(pageData instanceof PageList){
            PageList data = (PageList)pageData;
            PageEntity pe = new PageEntity(data.getPaginator().getTotalCount(),data);
            return JSON.toJSONString(pe);
        }else{
            PageEntity pe = new PageEntity(pageData.size(),pageData);
            return JSON.toJSONString(pe);
        }

    }

    public String buildPageData(PageEntity pageEntity){
        return JSON.toJSONString(pageEntity);
    }*/


}
