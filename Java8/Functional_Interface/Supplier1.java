package Functional_Interface;

import java.util.function.Supplier;

public class Supplier1 {
     public static void main(String[] args) {
        Supplier<String> giveHelloWorld = () -> "Hello World";
        System.out.println(giveHelloWorld.get());
    }
}
