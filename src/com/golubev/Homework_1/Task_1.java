package com.golubev.Homework_1;

/*
Пока решение не оптимальное
Попробуй так - определи положительное или отрицательное. Отрицательное можно умножить на -1 и затем посчитать кол-во знаков
*/
public class Task_1 {
    public static void main (String [] args){
        // имена переменных с маленькой буквы -> number
        int Number=- 120;

        if(Number>=0) {
            if ((Number % 10) == Number) {
                System.out.print("Однозначное положительное число");
            }
            else {
                if ((Number % 100) == Number) {
                    System.out.print("Двухзначное положительное число");
                }
                System.out.print("Трехзначное положительное число");
            }
        }
        else {
            if ((Number % 10) == Number) {
                System.out.print("Однозначное отрицательное число");
            }
            else {
                if ((Number % 100) == Number) {
                    System.out.print("Двухзначное отрицательное число");
                }
                System.out.print("Трехзначное отрицательное число");
            }

        }

        }
    }

