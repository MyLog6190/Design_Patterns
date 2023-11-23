package _02_structural_patterns._07_bridge._02_after;


import _02_structural_patterns._07_bridge._01_before.Champion;

/*
* -- Bridge Pattern --
*
* Bridge Pattern
* - 객체의 추상적인 것과 구현을 분리하여 연결하는 패턴
*
* Bridge Pattern 필요할 경우
* - 추상화와 구현이 강하게 결합되어 있는 경우, 두 부분을 분리하여 유지보수를 효율적으로 할 수 있으며 확장성을 높일 수 있다.
* - 추상화와 구현을 독립적인 확장이 필요한 경우, 각각 독립적으로 확장할 수 있도록 구현한다.
* - 클래스의 계층 구조를 늘어남에 따라 유지보수가 어려워 지면 브릿지 패턴을 사용해 계층을 줄인다.
*
* 구성 요소
* - Abstraction (추상화)
* - Implementor (구현자)
* - RefinedAbstraction (개선된 추상화)
* - ConcreteImplementor (구체적인 구현자)
*
* 구현 방법
* -
*
* 장점
* - 추상화와 구현을 분리하여 각자 독립적인 확장이 가능하다.
* - 새로운 추상화나, 구현을 추가하기 쉬워 확장에 용이하다.
* - 구현을 분리함으로써 코드의 재사용성이 증가한다.
*
* 단점
* - 클래스가 늘어나면서 복잡성이 증가한다.
* - 추상화와 구현을 분리하기 위한 설계를 신중이 해야한다.
*   제대로 설계하지 않으면 복잡성이 증가할 수 있다.
*
* */

public abstract class App implements Champion {

    public static void main(String[] args) {
        Champion kda아리 = new 아리(new KDA());
        kda아리.skillQ();
        kda아리.skillW();

        Champion poolParty아리 = new 아리(new PoolParty());
        poolParty아리.skillR();
        poolParty아리.skillW();
    }
}
