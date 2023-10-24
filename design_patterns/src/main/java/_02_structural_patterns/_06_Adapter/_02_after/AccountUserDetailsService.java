package _02_structural_patterns._06_Adapter._02_after;


import _02_structural_patterns._06_Adapter._02_after.security.UserDetails;
import _02_structural_patterns._06_Adapter._02_after.security.UserDetailsService;

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
