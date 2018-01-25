package cn.answering.seller.service.impl;

import cn.answering.seller.dao.UserMapper;
import cn.answering.seller.model.User;
import cn.answering.seller.service.impl.common.BaseServiceImpl;
import cn.answering.seller.service.interf.UserService;

import javax.annotation.Resource;

/**
 * Created by zjp on 2018/1/24.
 * QQ：34948062
 * github: https://www.github.com/zjp1029
 * web： http://www.zjp1029.cn
 */
public class UserServiceImpl extends BaseServiceImpl<User> implements UserService {

    @Resource
    private UserMapper userMapper;

    public User selectUserById(int id) {
        return super.selectByKey(id);
    }

    public int saveUser(User user) {
        return super.save(user);
    }
}
