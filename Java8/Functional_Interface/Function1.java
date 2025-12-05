package Functional_Interface;
import java.util.function.Function;

public class Function1 {
    public static void main(String[] args) {
        Function<Integer,Integer> doubleIt = x -> 2*x;
        Function<Integer,Integer> tripleIt = x -> 3*x;
        System.out.println(doubleIt.apply(100));
        System.out.println(tripleIt.apply(100));
        System.out.println(tripleIt.andThen(doubleIt).apply(100));
        System.out.println(tripleIt.compose(doubleIt).apply(100));
    }
}
