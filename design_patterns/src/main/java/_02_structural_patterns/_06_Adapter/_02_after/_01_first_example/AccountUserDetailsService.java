package _02_structural_patterns._06_Adapter._02_after._01_first_example;


import _02_structural_patterns._06_Adapter._02_after._01_first_example.security.UserDetails;
import _02_structural_patterns._06_Adapter._02_after._01_first_example.security.UserDetailsService;

/*
 * TODO Adapter
 * - Target 인터페이스를 사용하여 Adaptee 클래스를 클라이언트가 사용할 수 있게 구현한 클래스이다.
 * - UserDetailsService 인터페이스를 사용하여 기존에 있던 AccountService 클래스를 클라이언트
 *   요구에 맞게 사용하는 Adapter 클래스
 * */
public class AccountUserDetailsService implements UserDetailsService {

    private AccountService accountService;

    public AccountUserDetailsService(AccountService accountService) {
        this.accountService = accountService;
    }

    @Override
    public UserDetails loadUser(String username) {
        return new AccountUserDetails(accountService.findAccountByUsername(username));
    }
}
