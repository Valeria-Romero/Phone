package com.phones.tester;
import com.phones.brands.Galaxy;
import com.phones.brands.Iphone;

public class PhoneTester {
    public static void main(String[] args) {
        Galaxy s9 = new Galaxy("S9", 75, "Movistar","ROOONG RUUUNG");
        Iphone iPhone10 = new Iphone("X", 99, "Claro", "Tiru Tiru");
        s9.displayInfo();
        System.out.println(s9.ring());
        System.out.println(s9.unlock());
        iPhone10.displayInfo();
        System.out.println(iPhone10.ring());
        System.out.println(iPhone10.unlock());
    }
}
