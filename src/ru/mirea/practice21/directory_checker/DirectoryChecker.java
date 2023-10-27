package ru.mirea.practice21.directory_checker;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DirectoryChecker {
    public static List<String> listFilesInDirectory(String directoryPath) {
        List<String> fileList = new ArrayList<>();
        File directory = new File(directoryPath);

        if (directory.exists() && directory.isDirectory()) {
            File[] files = directory.listFiles();

            if (files != null) {
                Arrays.sort(files);
                for (File file : files) {
                    fileList.add(file.getName());
                }
            } else {
                System.err.println("Не удалось получить содержимое каталога.");
            }
        } else {
            System.err.println("Указанный путь не является каталогом или не существует.");
        }

        return fileList;
    }
}
