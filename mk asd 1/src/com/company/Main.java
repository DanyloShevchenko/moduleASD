package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private final static Scanner in = new Scanner(System.in);


    public static void main(String[] args) {
        System.out.println("Введіть номер завдання : ");
        int num = in.nextInt();

        boolean error = false;
        switch (num) {
            case 1:
                do {
                    try {

                        task_1 Task1 = new task_1();
                        Task1.a();
                    } catch (InputMismatchException e) {
                        error = true;
                        System.out.println("Ошибка");
                        in.next();
                    }
                } while (error);
                break;
            case 2:
                do {
                    try {
                        error = false;
                        task_2 Task2 = new task_2();
                        Task2.b();
                    } catch (InputMismatchException e) {
                        error = true;
                        System.out.println("Ошибка");
                        in.next();
                    }
                } while (error);
                break;
        }
    }
}