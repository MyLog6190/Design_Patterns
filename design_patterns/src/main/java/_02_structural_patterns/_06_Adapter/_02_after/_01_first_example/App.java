package _02_structural_patterns._06_Adapter._02_after._01_first_example;


import _02_structural_patterns._06_Adapter._02_after._01_first_example.security.LoginHandler;
import _02_structural_patterns._06_Adapter._02_after._01_first_example.security.UserDetailsService;

/*
*  Adapter Pattern
*  - 서로 다른 인터페이스를 가진 클래스를 함께 동작하도록 만들기 위한 구조 디자인 패턴
*  - 이미 존재하는 클래스를 변경하지 않고 새로운 인터페이스에 맞게 사용할 수 있도록 구현
*
*  필요한 경우
*  - 기존의 클래스나 라이브러리를 다른 인터페이스와 호환시켜 사용하고 싶을 떼
*  - 서로 다른 라이브러리나 서비스를 통합할 때 Adapter 패턴을 사용
*
*  구성 요소
*  - target : 클라이언트가 사용할 인터페이스
*  - adaptee : 클라이언트가 사용하려는 클래스, 인터페이스가 클리언트가 사용할려는
*              인터페이스랑 맞지 않는 클래스
*  - adapter : Adaptee를 인스턴스로 가지는 클래스, Target 인터페이스를 사용해 Adaptee
*              클래스를 사용할 수 있도록 구현한 클래스
*
*  구현 방법
*  - 기존에 있던 클래스를 클라이언트가 사용할 목적에 맞게 사용할 수 있도록 Target 인터페이스를 설계
*  - 설계한 Target 인터페이스를 사용하여 Adaptee 클래스를 연결할 Adapter 클래스를 구현
*
*  장점
*  - 기존의 클래스를 변경하지 않고 새로운 인터페이스와 연동 할 수 있다.
*  - 기존 코드를 변경하지 않아도 되기 때문에 유연성, 확장성, 재사용성이 높다.
*
*  단점
*  - 클래스와 인터페이스가 늘어나 복잡성이 높아지고 코드 가독성이 떨어진다
*  - Adapter 클래스가 많아 질 수록 유지보수가 어려워 질 수 있다.
*
* */

// TODO Client
public class App {
    public static void main(String[] args) {
        AccountService accountService = new AccountService();
        UserDetailsService userDetailsService = new AccountUserDetailsService(accountService);
        LoginHandler loginHandler = new LoginHandler(userDetailsService);
        String login = loginHandler.login("keesun", "keesun");
        System.out.println(login);
    }
}
