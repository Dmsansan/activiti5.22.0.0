package neusoft.activiti.com.service.impl;

import neusoft.activiti.com.dao.UserMapper;
import neusoft.activiti.com.entity.User;
import neusoft.activiti.com.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("UserService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public User selectByPrimaryKey(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }
}
