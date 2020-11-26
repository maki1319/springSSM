package chen.services;

import chen.domain.Account;
import org.springframework.stereotype.Service;

import java.util.List;


public interface AccountService {
    public List<Account> findAcccount();
    void saveAccount(Account account);
}
