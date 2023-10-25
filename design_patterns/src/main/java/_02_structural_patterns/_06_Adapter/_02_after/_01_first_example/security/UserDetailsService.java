package _02_structural_patterns._06_Adapter._02_after._01_first_example.security;

public interface UserDetailsService {

    UserDetails loadUser(String username);

}
