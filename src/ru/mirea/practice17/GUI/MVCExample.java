package ru.mirea.practice17.GUI;

public class MVCExample {
    public static void main(String[] args) {
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);
    }
}