package neusoft.activiti.com.service;

import neusoft.activiti.com.entity.User;
import org.springframework.stereotype.Service;

public interface UserService {

   public User selectByPrimaryKey(Integer id);
}
