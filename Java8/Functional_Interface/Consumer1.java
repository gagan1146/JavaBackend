package Functional_Interface;

import java.util.*;
import java.util.function.Consumer;

public class Consumer1 {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1,2,3,4,5,7);
        Consumer<Integer> print = x -> System.out.println(x);
        Consumer<List<Integer>> printList = x -> {
            for(int x1: x){
                print.accept(x1);
            }
        };
        print.accept(10);
        printList.accept(arr);
    }
}
