import java.util.*;
import java.util.stream.Collectors;

public class ListQue1 {

    public static void main(String[] args) {
        // using map in a new arraylist
        List<Integer> list = Arrays.asList(5, 10, 15, 20, 25);
        // even list
        List<Integer> evenList = list.stream().filter(i -> i > 2).filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(evenList);
        int sum = list.stream().reduce(0, (a, b) -> a + b);
        System.out.println("sum of the list : " + sum);
        int max = evenList.stream().reduce(0, (a, b) -> a > b ? a : b);
        System.out.println("max of list : " + max);
    }
}