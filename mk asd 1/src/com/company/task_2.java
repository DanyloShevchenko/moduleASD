package com.company;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;




public class task_2 {

    private final static Scanner in = new Scanner(System.in);

    public void  b() {


        int[] arr;
        int x;
        System.out.println("Введіть кількість ігор :\n");
        x = in.nextInt();
        arr = new int[x];
        System.out.println("Автозаповнення / Ручне заповнення (1/2) : ");
        int num = in.nextInt();

        boolean error = false;
        switch (num) {
            case 1:
                do {
                    try {
                        System.out.println("Результати оцінювання:");
                        error = false;
                        for (int i = 0; i < x; i++) {
                            arr[i] = (int) (Math.random() * 1000 + 1);
                            System.out.println(" " + arr[i]);
                        }

                    } catch (InputMismatchException e) {
                        error = true;
                        System.out.println("Помилка");
                        in.next();
                    }
                } while (error);
                break;
            case 2:
                do {
                    try {
                        System.out.println("Введіть результати оцінювання");
                        error = false;
                        for (int i = 0; i < x; i++) {
                            arr[i] = in.nextInt();
                        }

                    } catch (InputMismatchException e) {
                        error = true;
                        System.out.println("Помилка");
                        in.next();
                    }
                } while (error);
                break;
        }

        int b = 1;
        int w = arr[0] ;
        for ( int i = 0 ; i < x ; i++ ) {
            if (arr[i] >= b) {
                b = arr[i];
            } else if (arr[i] <= w) {
                w = arr[i];
            }

            System.out.println("\nГра №" + (i + 1));
            System.out.println("Результат " + arr[i]);
            System.out.println("Найкращий результат " + b);
            System.out.println("Найгірший результат " + w);
        }
     }
  }









