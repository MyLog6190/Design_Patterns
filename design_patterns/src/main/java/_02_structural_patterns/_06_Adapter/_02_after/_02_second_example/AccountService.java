package _02_structural_patterns._06_Adapter._02_after._02_second_example;

import _02_structural_patterns._06_Adapter._02_after._02_second_example.security.UserDetails;
import _02_structural_patterns._06_Adapter._02_after._02_second_example.security.UserDetailsService;

// Adepter 없이 직접 구현
public class AccountService implements UserDetailsService {

    public Account findAccountByUsername(String username) {
        Account account = new Account();
        account.setName(username);
        account.setPassword(username);
        account.setEmail(username);
        return account;
    }

    public void createNewAccount(Account account) {

    }

    public void updateAccount(Account account) {

    }

    @Override
    public UserDetails loadUser(String username) {
        return findAccountByUsername(username);
    }
}
