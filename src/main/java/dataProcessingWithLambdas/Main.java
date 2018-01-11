package dataProcessingWithLambdas;

public class Main {
    public static void main(String[] args) {
        Predicate<String> p = s -> s.length() < 20;

        boolean b = p.test("aa");
        System.out.println(b);
    }
}
