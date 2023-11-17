package _02_structural_patterns._06_Adapter._02_after._01_first_example.security;

/*
* TODO Target Interface
* - 클라이언트가 사용할 인터페이스를 정의
* - Acount 클래스를 클라이언트에 목적에 맞게 사용하기 위해 정의한 인터페이스
* */
public interface UserDetails {

    String getUsername();

    String getPassword();

}
