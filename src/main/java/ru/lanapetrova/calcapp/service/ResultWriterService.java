package ru.lanapetrova.calcapp.service;

import ru.lanapetrova.calcapp._main._Main;

public class ResultWriterService {
    public static void print(int num1, int num2, int result, String action) {
        System.out.println(num1 + action + num2 + "=" + result);
    }
}
