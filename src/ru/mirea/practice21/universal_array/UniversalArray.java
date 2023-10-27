package ru.mirea.practice21.universal_array;

public class UniversalArray<T> {
    private final T[] array;

    public UniversalArray(T[] array) {
        this.array = array;
    }

    public T getElement(int index) {
        return array[index];
    }
}
