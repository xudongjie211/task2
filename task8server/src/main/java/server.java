import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Maibenben on 2018/11/3.
 */
public class server {
    public static void main(String[] args) {
//        System.setProperty("java.rmi.server.hostnam","127.0.0.1");
        new ClassPathXmlApplicationContext("applicationContext.xml");
    }
}
