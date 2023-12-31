package _02_structural_patterns._06_Adapter._02_after._01_first_example;


import _02_structural_patterns._06_Adapter._02_after._01_first_example.security.UserDetails;

/*
 *  Adapter
 *  - Target 인터페이스를 사용하여 Adaptee 클래스를 클라이언트가 사용할 수 있게 구현한 클래스이다.
 *  - UserDetails 인터페이스를 사용하여 기존에 있던 Account 클래스를 클라이언트 요구에 맞게 사용하는 Adapter 클래스
 * */
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
