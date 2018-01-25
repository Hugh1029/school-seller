package cn.answering.seller.service.impl.common;

import cn.answering.seller.service.interf.common.BaseService;
import com.github.pagehelper.PageHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import tk.mybatis.mapper.common.Mapper;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by zjp on 2018/1/19.
 * QQ：34948062
 * github: https://www.github.com/zjp1029
 * web： http://www.zjp1029.cn
 */
public class BaseServiceImpl<T> implements BaseService<T> {

    protected Logger logger = LoggerFactory.getLogger(this.getClass());

    @Resource
    protected Mapper<T> mapper;

    public T selectByKey(Object key) {
        return mapper.selectByPrimaryKey(key);
    }

    public int save(T entity) {
        return mapper.insert(entity);
    }

    public int deleteByKey(Object key) {
        return mapper.deleteByPrimaryKey(key);
    }

    public int updateAll(T entity) {
        return mapper.updateByPrimaryKey(entity);
    }

    public int updateNotAll(T entity) {
        return mapper.updateByPrimaryKeySelective(entity);
    }

    public List<T> selectPageList(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return mapper.select(null);
    }


}
