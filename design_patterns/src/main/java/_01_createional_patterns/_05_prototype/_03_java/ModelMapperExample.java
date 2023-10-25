package _01_createional_patterns._05_prototype._03_java;


import _01_createional_patterns._05_prototype._02_after.GithubIssue;
import _01_createional_patterns._05_prototype._02_after.GithubRepository;
import org.modelmapper.ModelMapper;

public class ModelMapperExample {

    public static void main(String[] args) {
        GithubRepository repository = new GithubRepository();
        repository.setUser("whiteship");
        repository.setName("live-study");

        GithubIssue githubIssue = new GithubIssue(repository);
        githubIssue.setId(1);
        githubIssue.setTitle("1주차 과제: JVM은 무엇이며 자바 코드는 어떻게 실행하는 것인가.");

        /*
        * TODO ModelMapper
        * - 객체 간의 데이터를 맵핑 시켜 데이터를 전환, 데이터 전송을 단순화하기 위해 사용
        *
        * githubIssue객체를 githubIssueData에 맞게 변환 시켜 복사 하는 코드
        * */

        ModelMapper modelMapper = new ModelMapper();
        GithubIssueData githubIssueData = modelMapper.map(githubIssue, GithubIssueData.class);
        System.out.println(githubIssueData);
    }
}
