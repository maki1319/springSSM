package chen.services.impl;

import chen.dao.AccountDao;
import chen.domain.Account;
import chen.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("accountService")
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao dao;
    @Override
    public List<Account> findAcccount() {
        System.out.println("查询所有用户");
        return dao.findAcccount();
    }

    @Override
    public void saveAccount(Account account) {
         dao.saveAccount(account);
        System.out.println("保存用户");
    }
}
