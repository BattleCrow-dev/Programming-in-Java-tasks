package ru.mirea.practice7.printable;

public class Magazine implements Printable{
    private String text;

    public Magazine(String text) {
        this.text = text;
    }

    @Override
    public void print() {
        System.out.println(text);
    }

    public static void printMagazines(Printable[] printables){
        for(Printable printable : printables)
            if(printable instanceof Magazine)
                printable.print();
    }
}
