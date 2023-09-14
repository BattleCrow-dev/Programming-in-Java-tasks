package ru.mirea.practice6.string_builder_command;

import java.util.Stack;

public class UndoableStringBuilder {
    private interface Action{
        void undo();
    }
    private final StringBuilder stringBuilder;
    private final Stack<Action> actions = new Stack<>();
    public UndoableStringBuilder() {
        stringBuilder = new StringBuilder();
    }

    public void reverse() {
        stringBuilder.reverse();
        Action action = stringBuilder::reverse;
        actions.add(action);
    }

    public void append(String str) {
        stringBuilder.append(str);
        Action action = () -> stringBuilder.delete(stringBuilder.length() - str.length(), stringBuilder.length());
        actions.add(action);
    }

    public void delete(int start, int end) {
        String deleted = stringBuilder.substring(start, end);
        stringBuilder.delete(start, end);
        actions.add(() -> stringBuilder.insert(start, deleted));
    }

    public void deleteCharAt(int index) {
        char deleted = stringBuilder.charAt(index);
        stringBuilder.deleteCharAt(index);
        actions.add(() -> stringBuilder.insert(index, deleted));
    }

    public void replace(int start, int end, String str) {
        String deleted = stringBuilder.substring(start, end);
        stringBuilder.replace(start, end, str);
        actions.add(() -> stringBuilder.replace(start, start + str.length(), deleted));
    }

    public void insert(int offset, String str) {
        stringBuilder.insert(offset, str);
        actions.add(() -> stringBuilder.delete(offset, offset + str.length()));
    }

    public void undo(){
        if(!actions.isEmpty()){
            actions.pop().undo();
        }
    }

    public String toString() {
        return stringBuilder.toString();
    }
}
