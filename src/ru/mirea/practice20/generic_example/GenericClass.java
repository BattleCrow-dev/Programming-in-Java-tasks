package ru.mirea.practice20.generic_example;

public class GenericClass<T, V, K> {
    private final T t;
    private final V v;
    private final K k;

    public GenericClass(T t, V v, K k) {
        this.t = t;
        this.v = v;
        this.k = k;
    }

    public T getT() {
        return t;
    }

    public V getV() {
        return v;
    }

    public K getK() {
        return k;
    }

    public void printClassNames() {
        System.out.println("Тип переменной t: " + t.getClass().getName());
        System.out.println("Тип переменной v: " + v.getClass().getName());
        System.out.println("Тип переменной k: " + k.getClass().getName());
    }
}
