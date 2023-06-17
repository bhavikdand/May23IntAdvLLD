package collections;

import java.util.*;

public class Client {

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(10);
        integerList.add(20);

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

        int i = Collections.binarySearch(list, 10);
        System.out.println("index=" + i);

        Collections.shuffle(list);
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);

    }
}
