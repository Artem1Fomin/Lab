package lab21;

import java.util.ArrayList;

public class Tester {
    public static void main(String[] args) {
        Number[] array1 = {2389,2134,566,99,224,667,43,76,34,78,2,5345,657,24,645};
        Number[] array2 = {234.5, -23234.4242, -235435.1212, 0};
        String[] array3 = {"dhfdghfhfghfgh", "wrwejkk", "asdsdfg", "hrergerasdfsdfsfdgfdweewrert"};

        ArrayList<Number> list1 = toList(array1);
        ArrayList<Number> list2 = toList(array2);
        ArrayList<String> list3 = toList(array3);

        System.out.println(list1.toString() + "\t" + list1.getClass());
        System.out.println(list2.toString() + "\t" + list2.getClass());
        System.out.println(list3.toString() + "\t" + list3.getClass());

        Array<Number> test = new Array<>(array1.length);
        test.setAll(array1);
        System.out.println(test.get(3));
    }

    public static <T> ArrayList<T> toList(T[] array) {
        ArrayList<T> list = new ArrayList<>();

        for (T element : array) {
            list.add(element);
        }

        return list;
    }
}