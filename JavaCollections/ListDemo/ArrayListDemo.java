import java.util.*;

public class ArrayListDemo {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        AbstractList<Integer> linkedL = new ArrayList<>();
        linkedL.add(100);
        linkedL.add(100);
        linkedL.add(100);
        linkedL.add(100);
        linkedL.add(100);
        System.out.println(linkedL);
    }
}