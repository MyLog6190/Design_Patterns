package _02_structural_patterns._06_Adapter._02_after._02_second_example;


import _02_structural_patterns._06_Adapter._02_after._02_second_example.security.UserDetails;
import _02_structural_patterns._06_Adapter._02_after._02_second_example.security.UserDetailsService;

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
