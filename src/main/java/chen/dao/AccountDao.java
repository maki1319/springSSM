package chen.dao;

import chen.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountDao {

    @Select("select * from ssm")
    public List<Account> findAcccount();

    @Insert("insert into ssm(name,money) values (#{name},#{money})")
    void saveAccount(Account account);
}
