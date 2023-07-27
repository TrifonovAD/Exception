package Homework2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ваше имя: ");
        try {
            String inputText = scanner.nextLine();
            if (inputText.isEmpty())
                throw new Exception("Пустые строки вводить нельзя!");
            System.out.println(inputText);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
