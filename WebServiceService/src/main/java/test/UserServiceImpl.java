package test;

import javax.jws.WebService;

@WebService//切记 别丢了！
public class UserServiceImpl implements UserService {


    public UserInfo getUserInfo(String userName, int age) {

        return new UserInfo(userName, age);
    }
}