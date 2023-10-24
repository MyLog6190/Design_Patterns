package _01_createional_patterns._05_prototype._02_after;

public class App {

    public static void main(String[] args) throws CloneNotSupportedException {
        GithubRepository repository = new GithubRepository();
        repository.setUser("whiteship");
        repository.setName("live-study");

        GithubIssue githubIssue = new GithubIssue(repository);
        githubIssue.setId(1);
        githubIssue.setTitle("1주차 과제: JVM은 무엇이며 자바 코드는 어떻게 실행하는 것인가.");

        String url = githubIssue.getUrl();
        System.out.println(url);

        /*
            clone
            - clone은 Object에 정의 되어 있다.
            - clone은 접근제어자가 protected로 되어있기 떄문에 사용하려면
              복제할 클래스에 Cloneable를 상속 받아 사용 한다.

            GithubIssue clone = (GithubIssue) githubIssue.clone()
            - githubIssue와 clone은 다른 객체지만 같은 얕은 복사로 만들 경우
              같은 repository객체를 공유한다.
            - 이런 일을 방지 하기 위해 clone메소드를 깊은 복사로 재정의하여 사용한다.
        */

        GithubIssue clone = (GithubIssue) githubIssue.clone();
        System.out.println(clone.getUrl());

        repository.setUser("Keesun");
        System.out.println(clone != githubIssue);
        System.out.println(clone.equals(githubIssue));
        System.out.println(clone.getClass() == githubIssue.getClass());
        System.out.println(clone.getRepository() == githubIssue.getRepository());

        System.out.println(clone.getUrl());
        System.out.println(githubIssue.getUrl());
    }

}
