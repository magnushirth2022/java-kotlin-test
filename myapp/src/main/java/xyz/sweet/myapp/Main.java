package xyz.sweet.myapp;

import xyz.sweet.mylib.JLib;
import xyz.sweet.mylib.KLib;
import xyz.sweet.mylib.GreetingsKt;

public class Main {
    public static void main(String[] args) {
        System.out.println(GreetingsKt.welcome("Java", "Kotlin"));
        System.out.println(GreetingsKt.question());
        System.out.printf("JLib: %s%n", new JLib("Java Record"));
        System.out.printf("KLib: %s%n", new KLib("Kotlin Data Class"));
        System.out.println(GreetingsKt.goodbye());
    }
}