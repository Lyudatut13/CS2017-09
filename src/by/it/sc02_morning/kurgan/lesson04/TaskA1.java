package by.it.sc02_morning.kurgan.lesson04;

/*
Lesson 04. Task A1. Калькулятор.
Напишите программу, которая считывает с клавиатуры два целых числа a и b
после этого выводит через пробел:

сумму, разность, произведение, частное и остаток от деления
этих чисел двух чисел (результат выводится как тип int).

после этого еще раз выводит через пробел
сумму, разность, произведение, частное и остаток от деления
этих чисел двух чисел (но результат выводится как тип double).

Для считывания данных с клавиатуры используйте метод nextInt() объекта класса Scanner.
Создать Scanner можно так:
Scanner sc=new Scanner(System.in);

Требования:
1. В программе необходимо создать объект типа Scanner.
2. Программа должна считывать два числа типа int с клавиатуры.
3. Программа должна дважды выводить в строку пять чисел через пробел.
4. Программа должна выводить int сумму, разность, произведение, частное и отстаток от деления этих чисел двух чисел.
4. Программа должна выводить double сумму, разность, произведение, частное и отстаток от деления этих чисел двух чисел.

Пример:

Ввод:
7 2
Вывод:
9 5 14 3 1
9.0 5.0 14.0 3.5 1.0

 */

import java.util.Scanner;

class TaskA1 {

    public static void main(String[] args) {
        Scanner sc;
        sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = a+b;
        int dif = a-b;
        int prod = a*b;
        int div = a/b;
        int rem = a%b;
        System.out.println(sum + " " + dif + " " + prod + " "+ div + " " + rem);

//        double a1=(double)a;
//        double b1=b;
        double sum1 = a+b;
        double dif1 = a-b;
        double prod1 = a*b;
        double div1 = ((double)a) / ((double)b);
        double rem1 = a%b;
        System.out.println(sum1 + " " + dif1 + " " + prod1 + " "+ div1 + " " + rem1);


    }

}
