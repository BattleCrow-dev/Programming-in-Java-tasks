package ru.mirea.practice6.string_builder_observable;

class Listener implements OnStringBuilderChangeListener {
    public void onChange(ObservableStringBuilder stringBuilder) {
        System.out.println("CHANGED: " + stringBuilder.toString());
    }
}
