package test;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * 注解：@XmlRootElement-指定XML根元素名称（可选）
 *
 * @XmlAccessorType-控制属性或方法序列化 ， 四种方案：
 * FIELD-对每个非静态，非瞬变属性JAXB工具自动绑定成XML，除非注明XmlTransient
 * NONE-不做任何处理
 * PROPERTY-对具有set/get方法的属性进行绑定，除非注明XmlTransient
 * PUBLIC_MEMBER -对有set/get方法的属性或具有共公访问权限的属性进行绑定，除非注 明XmlTransient
 * @XmlType-映射一个类或一个枚举类型成一个XML Schema类型
 */

@XmlRootElement(name = "userInfo")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {
        "userName",
        "age"
})
public class UserInfo {

    private String userName;
    private int age;


    public UserInfo(String userName, int age) {
        super();
        this.userName = userName;
        this.age = age;
    }

    public UserInfo() {
        super();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "user name: " + userName + " age: " + age;
    }
}