package cn.answering.seller.service.interf.common;


import java.util.List;
import java.util.Map;

/**
 * Created by zjp on 2018/1/18.
 * QQ：34948062
 * github: https://www.github.com/zjp1029
 * web： http://www.zjp1029.cn
 */
public interface BaseService<T> {

    public T selectByKey(Object key);

    public int save(T entity);

    public int deleteByKey(Object key);

    public int updateAll(T entity);

    public int updateNotAll(T entity);

    public List<T> selectPageList(int pageNum, int pageSize);

    //public List<T> getPageList(Class<?> mapperClass, String sqlId, Map params, PageBounds pageBounds);


}
