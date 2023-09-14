package ru.mirea.practice6.string_builder_observable;

import ru.mirea.practice6.string_builder_command.UndoableStringBuilder;

public class ObservableStringBuilder {
    private OnStringBuilderChangeListener onChangeListener;
    private final UndoableStringBuilder stringBuilder;

    public void setOnChangeListener(OnStringBuilderChangeListener onChangeListener) {
        this.onChangeListener = onChangeListener;
    }

    public ObservableStringBuilder() {
        stringBuilder = new UndoableStringBuilder();
    }

    private void notifyOnStringBuilderChangeListener(){
        if(onChangeListener != null){
            onChangeListener.onChange(this);
        }
    }
    public void reverse() {
        stringBuilder.reverse();
        notifyOnStringBuilderChangeListener();
    }

    public void append(String str) {
        stringBuilder.append(str);
        notifyOnStringBuilderChangeListener();
    }

    public void delete(int start, int end){
        stringBuilder.delete(start, end);
        notifyOnStringBuilderChangeListener();
    }

    public void deleteCharAt(int index) {
        stringBuilder.deleteCharAt(index);
        notifyOnStringBuilderChangeListener();
    }

    public void replace(int start, int end, String str) {
        stringBuilder.replace(start, end, str);
        notifyOnStringBuilderChangeListener();
    }

    public void insert(int index, String str) {
        stringBuilder.insert(index, str);
        notifyOnStringBuilderChangeListener();
    }

    public void undo(){
        stringBuilder.undo();
        notifyOnStringBuilderChangeListener();
    }

    public String toString() {
        return stringBuilder.toString();
    }
}

