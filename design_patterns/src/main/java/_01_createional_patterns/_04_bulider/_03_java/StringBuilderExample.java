package _01_createional_patterns._04_bulider._03_java;

public class StringBuilderExample {

    public static void main(String[] args) {
        // StringBuilder
        // Synchronize를 사용하지 않는 api

        // StringBuffer
        // Synchronize를 사용하는 api

        StringBuilder stringBuilder = new StringBuilder();
        String result = stringBuilder.append("whiteship").append("keesun").toString();
        System.out.println(result);
    }
}
