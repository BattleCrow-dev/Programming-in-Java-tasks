package ru.mirea.practice21.directory_checker;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> fileList = DirectoryChecker.listFilesInDirectory("C:\\Users\\pashk\\IdeaProjects\\untitled\\src\\ru\\mirea\\practice21\\directory_checker\\files");

        if (fileList.isEmpty()) {
            System.out.println("Каталог пуст");
        } else {
            System.out.println("Первые 5 элементов в каталоге:");
            for (int i = 0; i < Math.min(5, fileList.size()); i++) {
                System.out.println(fileList.get(i));
            }
        }
    }
}
