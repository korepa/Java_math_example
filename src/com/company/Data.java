package com.company;

// класс с данными
public class Data {
    int first;
    int second;
    int division;

    // конструктор
    public Data(int _a, int _b, int _div){
        first = _a;
        second = _b;
        division = _div;
    }

    // функция для расчета значения дроби
    public double Calculate() {
        // вычисляем значение
        double result = ((double)first)  / second;
        return result;
    }
}
