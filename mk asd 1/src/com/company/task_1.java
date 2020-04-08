package com.company;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class task_1  {
    private final static Scanner in = new Scanner(System.in);
    private ArrayList<Integer> marks;

    public void a() {
        this.marks = new ArrayList<>();
        inputMarks();
        System.out.println("|------|------------|------------|");
        System.out.printf("|%6s|%12s|%12s|\n", "Номер", "Оцінка", "Результат ");
        System.out.println("|------|------------|------------|");
        for (int i = 0; i < marks.size(); i++) {
            Integer mark = marks.get(i);
            System.out.printf("|% 6d|% 12d|% 12d|\n", i, mark, roundMark(mark));
        }
        System.out.println("|------|------------|------------|");
    }

    private void inputMarks() {
        int counter = 1;
        System.out.println("Введіть оцінку від 0 до 100: ");
        do {
            try {
                System.out.print(counter + ". ");
                int nextMark = in.nextInt();
                if (nextMark < 0 || nextMark > 100) {
                    throw new InputMismatchException();
                }
                marks.add(nextMark);
                System.out.print("Продовжити? ");
                String answer = in.next();
                if (answer.equalsIgnoreCase("ні")) {
                    break;
                }
                counter++;
            } catch (InputMismatchException e) {
                System.out.println("Помилка");
                in.next();
            }
        } while (true);
    }

    private int roundMark(Integer mark) {
        if(mark < 37) {
            return mark;
        }
        int dozens = mark / 10;
        int ones = mark % 10;
        if (ones <= 2) {
            ones = 0;
        } else if (ones <= 6) {
            ones = 5;
        } else {
            ones = 10;
        }
        return dozens * 10 + ones;
    }
}