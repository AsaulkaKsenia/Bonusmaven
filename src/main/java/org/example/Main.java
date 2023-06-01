package org.example;

public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();

        System.out.println(service.calculate(1000, true));

        System.out.println(service.calculate(1_000_000, true));
    }
}