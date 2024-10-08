package ru.lanapetrova.calcapp._main;

import ru.lanapetrova.calcapp.service.ResultWriterService;
import ru.lanapetrova.calcapp.util.Calculator;
import java.util.Scanner;

public class _Main {
    public static void main(String[] args) {
        int result = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Type num1");
        int num1 = input.nextInt();
        System.out.println("Type num2");
        int num2 = input.nextInt();
        System.out.println("Type action");
        input.nextLine();
        String action = input.nextLine();
        switch (action){
            case "+":
                result = Calculator.sum(num1,num2);
                break;
            case "-":
                result = Calculator.subtract(num1,num2);
                break;
            case "*":
                result = Calculator.multiply(num1, num2);
                break;
        }
        ResultWriterService.print(num1, num2, result, action);
    }
}
