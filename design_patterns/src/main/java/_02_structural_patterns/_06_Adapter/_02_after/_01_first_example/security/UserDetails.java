package _02_structural_patterns._06_Adapter._02_after._01_first_example.security;

/*
 * TODO Target Interface
 *  - 클라이언트가 사용하기 위해 정의된 인터페이스
 *  - 사용하던 인터페이스가 기존에 사용하던 클래스(Adaptee)와 호환이 안 된다면
 *    호환 가능하도록 새로운 인터페이스를 설계
 *  - UserDetails는 기존에 있던 클래스(Adaptee)와 호환이 되므로 따로 설계할 필요는 없다.
 *  - 인터페이스를 rmeofh 사용하여 클래스(Adapter)를 구현한다.
 * */
public interface UserDetails {

    String getUsername();

    String getPassword();

}
