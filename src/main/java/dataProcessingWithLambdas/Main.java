package dataProcessingWithLambdas;

public class Main {
    public static void main(String[] args) {
        Predicate<String> p1 = s -> s.length() < 20;
        Predicate<String> p2 = s -> s.length() > 5;

        boolean b = p1.test("aa");
        System.out.println(b);

        Predicate<String> p3 = p1.and(p2);
        Predicate<String> p4 = p1.or(p2);

        Predicate<String> p5 = Predicate.isEqualTo("Yes");

    }
}
