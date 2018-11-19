package neusoft.activiti.com.controller;

import neusoft.activiti.com.entity.User;
import neusoft.activiti.com.service.UserService;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.impl.persistence.entity.TestUserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.Id;
import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private UserService userService;

    private RepositoryService repositoryService;

    @RequestMapping("/index")
    public String index(){
        return "Spring boot test!!!";
    }

    @RequestMapping("/getUser")
    public User selectByPrimaryKey(HttpServletRequest request){
        TestUserEntity testUserEntity = repositoryService.selectByPrimaryKey(
                Integer.parseInt(request.getParameter("id")));
        System.out.print("-------------------------"+testUserEntity);
       User user = new User();
        user.setUsername(testUserEntity.getUserName());
        return user;
    }
}
