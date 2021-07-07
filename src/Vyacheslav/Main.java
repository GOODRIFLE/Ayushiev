package Vyacheslav;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nameV="Вячеслав";
        Scanner in = new Scanner(System.in);
        System.out.println("Введите Ваше имя:");
        String name = in.nextLine();
        if (name.equals(nameV)){
            System.out.println("Привет, Вячеслав");
        } else {
            System.out.println("Нет такого имени");
        }
    }
}
