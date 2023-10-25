package _02_structural_patterns._06_Adapter._02_after._01_first_example;


import _02_structural_patterns._06_Adapter._02_after._01_first_example.security.LoginHandler;
import _02_structural_patterns._06_Adapter._02_after._01_first_example.security.UserDetailsService;

public class App {

    public static void main(String[] args) {
        AccountService accountService = new AccountService();
        UserDetailsService userDetailsService = new AccountUserDetailsService(accountService);
        LoginHandler loginHandler = new LoginHandler(userDetailsService);
        String login = loginHandler.login("keesun", "keesun");
        System.out.println(login);
    }
}
