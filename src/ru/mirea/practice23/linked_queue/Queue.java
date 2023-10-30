package ru.mirea.practice23.linked_queue;

public interface Queue<T> {
    void enqueue(T item);
    T dequeue();
    T front();
    int size();
    boolean isEmpty();
    void clear();
}
