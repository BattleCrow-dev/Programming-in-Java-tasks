package ru.mirea.practice13.telephone;

public class Telephone {
    public String parseNumber(String number){
        StringBuilder newString = new StringBuilder("+");
        if(number.startsWith("+")){
            newString.append(number, 1, number.length() - 10);
            newString.append(number, number.length() - 10, number.length() - 7);
            newString.append('-');
            newString.append(number, number.length() - 7, number.length() - 4);
            newString.append('-');
            newString.append(number, number.length() - 4, number.length());
        }
        else{
            newString.append(number.charAt(0));
            newString.append(number, 1, 4);
            newString.append('-');
            newString.append(number, 4, 7);
            newString.append('-');
            newString.append(number, 7, 11);
        }
        return newString.toString();
    }
}
