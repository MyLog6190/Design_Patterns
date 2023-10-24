package _02_structural_patterns._06_Adapter._01_before.security;

public interface UserDetailsService {

    UserDetails loadUser(String username);

}
