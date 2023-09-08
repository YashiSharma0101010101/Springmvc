package springmvc.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import springmvc.dao.UserDao;
import springmvc.model.User;
@Service
public class UserService {
    private UserDao userDao;
     
    @Transactional
    public int createUser(User user) {
    	return this.userDao.saveUser(user);
    }
}
