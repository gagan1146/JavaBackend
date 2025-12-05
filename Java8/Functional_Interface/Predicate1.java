package Functional_Interface;
import java.util.function.Predicate;
public class Predicate1 {
    public static void main() {
        Predicate<Integer> isEven = x -> x%2==0;
        Predicate<String> stringStartsWithA = x -> x.toLowerCase().startsWith("a");
        Predicate<String> stringEndsWithT = x -> x.toLowerCase().endsWith("t");
        Predicate<String> stringStartsWithAandEndsWithT = stringStartsWithA.and(stringEndsWithT);
        System.out.println(isEven.test(100));
        System.out.println(isEven.test(101));
        System.out.println(stringStartsWithA.test("Gagan Sharma"));
        System.out.println(stringStartsWithA.test("Anant"));
        System.out.println(stringStartsWithAandEndsWithT.test("Anant"));
    }
}
