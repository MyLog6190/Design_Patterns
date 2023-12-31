package _02_structural_patterns._06_Adapter._02_after._02_second_example;


import _02_structural_patterns._06_Adapter._02_after._02_second_example.security.UserDetails;


// Adepter 없이 직접 구현
public class AccountUserDetails implements UserDetails {

    private Account account;

    public AccountUserDetails(Account account) {
        this.account = account;
    }

    @Override
    public String getUsername() {
        return account.getName();
    }

    @Override
    public String getPassword() {
        return account.getPassword();
    }
}
