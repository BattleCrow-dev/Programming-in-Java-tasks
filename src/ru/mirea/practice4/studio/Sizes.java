package ru.mirea.practice4.studio;

public enum Sizes {
    XXS(32),
    XS(34),
    S(36),
    M(38),
    L(40);

    private int euroSize;

    Sizes(int euroSize) {
        this.euroSize = euroSize;
    }

    public String getDescription(){
        if(this == Sizes.XXS)
            return "Детский размер";

        return "Взрослый размер";
    }
}
