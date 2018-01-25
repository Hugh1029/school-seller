package cn.answering.seller.service.interf;

import cn.answering.seller.model.User;
import cn.answering.seller.service.interf.common.BaseService;

/**
 * Created by zjp on 2018/1/24.
 * QQ：34948062
 * github: https://www.github.com/zjp1029
 * web： http://www.zjp1029.cn
 */
public interface UserService extends BaseService<User> {

    public User selectUserById(int id);

    public int saveUser(User user);
}
