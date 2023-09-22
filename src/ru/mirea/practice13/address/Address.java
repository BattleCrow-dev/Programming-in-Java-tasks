package ru.mirea.practice13.address;

import java.util.StringTokenizer;

public class Address {
    private String country, region, city, street, house, corpus, apartment;

    public void setInfoComma(String address){
        String[] strings = address.replaceAll(" ", "").split(",");

        this.country = strings[0];
        this.region = strings[1];
        this.city = strings[2];
        this.street = strings[3];
        this.house = strings[4];
        this.corpus = strings[5];
        this.apartment = strings[6];
    }

    public void setInfoAny(String address){
        address = address.replaceAll(" ", "");

        StringTokenizer stringTokenizer1 = new StringTokenizer(address, ",");
        StringTokenizer stringTokenizer2 = new StringTokenizer(address, ".");
        StringTokenizer stringTokenizer3 = new StringTokenizer(address, ";");

        StringTokenizer newStringTokenizer = stringTokenizer1.countTokens() > 1 ?  stringTokenizer1 : stringTokenizer2.countTokens() > 1 ? stringTokenizer2 : stringTokenizer3.countTokens() > 1 ? stringTokenizer3 : null;

        assert newStringTokenizer != null;
        this.country = newStringTokenizer.nextToken();
        this.region = newStringTokenizer.nextToken();
        this.city = newStringTokenizer.nextToken();
        this.street = newStringTokenizer.nextToken();
        this.house = newStringTokenizer.nextToken();
        this.corpus = newStringTokenizer.nextToken();
        this.apartment = newStringTokenizer.nextToken();
    }

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", region='" + region + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", house='" + house + '\'' +
                ", corpus='" + corpus + '\'' +
                ", apartment='" + apartment + '\'' +
                '}';
    }
}
