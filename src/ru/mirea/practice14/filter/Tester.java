package ru.mirea.practice14.filter;

import java.util.ArrayList;
import java.util.Arrays;

public class Tester {
    private interface Filter{
        boolean apply(Object o);
    }
    public static <T> T[] filter(T[] array, Filter filter) {
        int offset = 0;

        for (int i = 0; i < array.length; i++) {
            if (!filter.apply(array[i]))
                offset++;
            else
                array[i - offset] = array[i];
        }

        return Arrays.copyOf(array, array.length - offset);
    }


    public static void main(String[] args) {
        Object[] array = new Object[]{"12345", new ArrayList<>(), new int[3], "qffsafs", "wgsasfg", new double[6], "wsdg", "fsuhgfuih"};
        System.out.println(Arrays.toString(array));

        Object[] newArray = filter(array, new Filter() {
            @Override
            public boolean apply(Object o) {
                return o instanceof String;
            }
        });

        System.out.println(Arrays.toString(newArray));
    }
}
