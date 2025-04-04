package com.luxury.Gold;

class GoldRunner {
    public static void main (String[] args){
        Gold gold = new Gold();
        Jewelry jewelry = new Jewelry(gold);
        jewelry.bangle();

    }
}
