package ru.mirea.practice13.address;

public class Tester {
    public static void main(String[] args) {
        String s1 = "Россия, Краснодарский_край, Краснодар, Ленина, 101, 2, 47";
        String s2 = "Россия. Краснодарский_край. Краснодар. Ленина. 101. 2. 47";
        String s3 = "Россия; Краснодарский_край; Краснодар; Ленина; 101; 2; 47";

        Address a1 = new Address();
        Address a2 = new Address();
        Address a3 = new Address();
        Address a4 = new Address();

        a1.setInfoComma(s1);
        a2.setInfoAny(s1);
        a3.setInfoAny(s2);
        a4.setInfoAny(s3);

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a4);
    }
}
