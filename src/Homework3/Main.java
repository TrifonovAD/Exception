package Homework3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        Scanner scanner = new Scanner(System.in);
        String input;
        do {
            System.out.println("Введите данные (Фамилия Имя Отчество Дата_рождения Номер_телефона Пол):");
            input = scanner.nextLine();

            controller.processUserData(input);

            System.out.println("Хотите ввести еще данные? (y/n)");
            input = scanner.nextLine();

        } while (input.equalsIgnoreCase("y") );



    }
}
