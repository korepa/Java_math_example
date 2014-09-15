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
        Data data = new Data(1,1,1);

        // вычисляем значение
        int[] a=new int[6];
        Scanner sc=new Scanner(System.in);
        System.out.println("Введите числа...");
        for(int j=0;j<6;j++)
            a[j]=sc.nextInt();
        System.out.println("Полученные значения: ");
        for (int i=0;i<a.length;i++)
            System.out.println(a[i]);

        return data;
    }
}
