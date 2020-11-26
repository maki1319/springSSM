package chen.test;

import chen.dao.AccountDao;
import chen.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MybatisTest {
    @Test
    public void test1() throws Exception {
        InputStream in=Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory factory= new SqlSessionFactoryBuilder().build(in);
        SqlSession session=factory.openSession();
       AccountDao dao= session.getMapper(AccountDao.class);
      List<Account> list= dao.findAcccount();
      for(Account account:list){
          System.out.println(account);
      }
       session.close();
       in.close();
    }

    @Test
    public void test2() throws Exception {
        Account account=new Account();
        account.setName("chenbo");
        account.setMoney(100d);
        InputStream in=Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory factory= new SqlSessionFactoryBuilder().build(in);
        SqlSession session=factory.openSession();
        AccountDao dao= session.getMapper(AccountDao.class);

        dao.saveAccount(account);
         session.commit();
        session.close();
        in.close();
    }
}
