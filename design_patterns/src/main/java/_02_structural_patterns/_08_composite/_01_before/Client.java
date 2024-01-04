package _02_structural_patterns._08_composite._01_before;

/*
* Composite Pattern
* - 객체의 구조를 트리 구조로 구성하여 객체의 그룹에 속한 개별 객체들이
*   동일한 방법으로 처리할 수 있도록 하는 디자인 패턴
*
* Composite Pattern이 필요한 경우
* 동일 인터페이스로 단일 객체 및 객체 그룹을 처리할 때
* - 예를 들어 파일 시스템 구조에서 디렉토리와 파일이라는 서로 다른 객체들을 동일한 방식으로 다루고 싶을 때 사용
*
* 클라이언트 코드를 단순화하고 일돠성 유지
* - 클라이언트는 복합 객체와 단일 객체에 대해 동일한 메소드를 호출할 수 있기 때문에
*   클라이언트 코드가 단순화되고 일관성을 유지 핤 수 있다.
*
* - 재귀적인 동작이 필요한 경우
*   - Composite 패턴을 내부적으로 자식 요소들을 가질 수 있어 계층적인 구조에서 재귀적인 동작을 구현할 수 있다.
*
* 구현
* - Component: 공통으로 사용되는 인터페이스를 정의한다.
* - Leaf(단일 객체), Composite(복합 객체)를 동일한 인터페이스를 사용하여 구현 및 관리를 한다.
*
* 장점
* - 복잡한 트리 구조를 편리하게 사용할 수 있다.
* - 클라이언트 코드를 변경하지 않고 새로운 엘리먼트 타입을추가할 수 있다.ㄴ
*
* 단점
* - 공통된 인터페이스를 사용해야 하기 때문에 억지로 일반화 시켜야 하는 경우가 있다.
*
* 현재 코드의 문제점
* - 클라이언트가 많은 걸 알아야 하기 때문에 클라이언트가 복잡해 진다.
* - 
*
* */

public class Client {

    public static void main(String[] args) {
        Item doranBlade = new Item("도란검", 450);
        Item healPotion = new Item("체력 물약", 50);

        Bag bag = new Bag();
        bag.add(doranBlade);
        bag.add(healPotion);

        Client client = new Client();
        client.printPrice(doranBlade);
        client.printPrice(bag);
    }

    private void printPrice(Item item) {
        System.out.println(item.getPrice());
    }

    private void printPrice(Bag bag) {
        int sum = bag.getItems().stream().mapToInt(Item::getPrice).sum();
        System.out.println(sum);
    }

}
