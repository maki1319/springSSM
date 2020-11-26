package chen.test;

import chen.services.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class springTest {

    @Test
    public void Test(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
        AccountService as= (AccountService) ac.getBean("accountService");
        as.findAcccount();
    }
}
