package com.company;
import java.util.Scanner;

public class Main {

    // задание 2
    public static void main(String[] args) {

        // используемые переменные
        Data data;
        double result;

        // текстовое сообщение
        System.out.println("Пример деления в k-ичной системе счисления");

        // примеры 1
        System.out.println("Первый ввод (1-число, 2-число, разрядность): 1 2 8");
        data = new Data(1,2,8);
        result = data.Calculate();
        System.out.format("Результат дроби a/b: %.2f\n", result);

        // примеры 2
        System.out.println("Второй ввод (1-число, 2-число, разрядность): 1 12 10");
        data = new Data(1,12,10);
        result = data.Calculate();
        System.out.format("Результат дроби a/b: %.2f\n", result);

        // обрабатываем пользовательский ввод
        // ввод 1
        System.out.println("Первый ввод (1-число, 2-число, разрядность) через пробел:");
        data = inputBlock();
        result = data.Calculate();
        System.out.format("Результат дроби a/b: %.2f\n", result);

        // ввод 2
        System.out.println("Второй ввод (1-число, 2-число, разрядность) через пробел:");
        data = inputBlock();
        result = data.Calculate();
        System.out.format("Результат дроби a/b: %.2f\n", result);
    }

    // функция для расчета значения дроби
    public static Data inputBlock() {

        // объявим класс
        Data data;
        int a, b, div;

        // вычисляем значение
        Scanner sc=new Scanner(System.in);

        System.out.println("Введите первое число (делимое)...");
        a=sc.nextInt();
        System.out.println("Введите второе число (делитель)...");
        b=sc.nextInt();
        System.out.println("Введите степень исчисления...");
        div=sc.nextInt();

        // полученные значения
        System.out.format("Полученные значения: %d, %d, %d\n", a,   b,  div );
        data = new Data(a, b, div);
        return data;
    }
}
