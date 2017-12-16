package test;

import javax.jws.WebService;



public interface UserService {
    public UserInfo getUserInfo(String userName, int age);
}