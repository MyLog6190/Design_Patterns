package _02_structural_patterns._06_Adapter._02_after._01_first_example;

/*
 *  Adaptee
 *  - 기존에 있던 클래스
 * */

public class AccountService {

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

}
