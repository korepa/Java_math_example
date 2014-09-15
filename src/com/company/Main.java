package com.company;
import java.util.Scanner;

public class Main {

    // задание 2
    public static void main(String[] args) {

        // используемые переменные
        Data data;
        String result;

        // текстовое сообщение
        System.out.println("Пример деления в k-ичной системе счисления");

        // примеры 1
        System.out.println("Первый ввод (1-число, 2-число, разрядность): 1 2 8");
        data = new Data(1,2,8);
        result = data.Calculate();
        System.out.format("Результат дроби a/b: %s\n", result);

        // примеры 2
        System.out.println("Второй ввод (1-число, 2-число, разрядность): 1 12 10");
        data = new Data(1,12,10);
        result = data.Calculate();
        System.out.format("Результат дроби a/b: %s\n", result);

        // обрабатываем пользовательский ввод
        // ввод 1
        System.out.println("Первый ввод (1-число, 2-число, разрядность) через пробел:");
        data = inputBlock();
        result = data.Calculate();
        System.out.format("Результат дроби a/b: %s\n", result);

        // ввод 2
        System.out.println("Второй ввод (1-число, 2-число, разрядность) через пробел:");
        data = inputBlock();
        result = data.Calculate();
        System.out.format("Результат дроби a/b: %s\n", result);
    }

    // функция для расчета значения дроби
    public static Data inputBlock() {

        // объявим класс
        Data data;
        int a, b, div;

        // вычисляем значение
        Scanner sc=new Scanner(System.in);

        System.out.println("Введите первое число (делимое)...");
        a=getInt(sc);
        System.out.println("Введите второе число (делитель)...");
        b=getInt(sc);
        System.out.println("Введите степень исчисления...");
        div=getInt(sc);

        // полученные значения
        System.out.format("Полученные значения: %d, %d, %d\n", a,   b,  div );
        data = new Data(a, b, div);
        return data;
    }

    private static int getInt(Scanner sc)
    {
        for (;;) {
            if (!sc.hasNextInt()) {
                System.out.println("Вводите только целые числа больше 0!");
                sc.next();
                continue;
            }
            int value = sc.nextInt();
            if (value >= 0) {
                return value;

            } else {
                System.out.print("Некорректный ввод!");

            }
            break;
        }

        return 0;
    }
}
