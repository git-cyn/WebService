import test.UserInfo;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

/**
 * Created by admin on 2017/12/11.
 */
public class UserInfoTest {

    public static void main(String[] args) throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(UserInfo.class);
        Marshaller marshaller = jaxbContext.createMarshaller();
        // 用来指定是否使用换行和缩排对已编组XML数据进行格式化的属性名称
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        // 用来指定将放置在已编组 XML 输出中的 xsi:schemaLocation 属性值的属性名称
        marshaller.setProperty(Marshaller.JAXB_SCHEMA_LOCATION, "s");
        // 用来指定将放置在已编组 XML 输出中的 xsi:noNamespaceSchemaLocation 属性值的属性名称
        marshaller.setProperty(Marshaller.JAXB_NO_NAMESPACE_SCHEMA_LOCATION, "w");
        UserInfo userInfo = new UserInfo();
        userInfo.setAge(10);
        userInfo.setUserName("zhangsan");
        marshaller.marshal(userInfo,System.out);
    }
}
