package Homework3;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Controller {
    public void processUserData(String userData) {
        try {
            String[] fields = userData.split(" ");

            if (fields.length != 6) {
                throw new InvalidDataException(1, "Неверное количество данных");
            }

            String surname = fields[0];
            String name = fields[1];
            String patronymic = fields[2];
            String birthDate = fields[3];
            String phoneNumber = fields[4];
            String gender = fields[5];

            // Проверка формата фамилии, имени и отчества
            if (!isValidName(surname) || !isValidName(name) || !isValidName(patronymic)) {
                throw new InvalidDataException(2, "Неверный формат фамилии, имени или отчества");
            }

            // Проверка формата даты рождения
            if (!isValidDate(birthDate)) {
                throw new InvalidDataException(3, "Неверный формат даты рождения");
            }

            // Проверка формата номера телефона
            if (!isValidPhoneNumber(phoneNumber)) {
                throw new InvalidDataException(4, "Неверный формат номера телефона");
            }

            // Проверка формата пола
            if (!isValidGender(gender)) {
                throw new InvalidDataException(5, "Неверно указан пол");
            }

            // Запись данных в файл
            writeDataToFile(surname, name, patronymic, birthDate, phoneNumber, gender);

            System.out.println("Данные успешно обработаны и записаны в файл.");
        } catch (InvalidDataException e) {
            System.out.println("Ошибка: " + e.getMessage());
            System.out.println("Код ошибки: " + e.getErrorCode());
        }
    }

    private boolean isValidName(String name) {
        return name.matches("[А-Яа-яA-Za-z]+");
    }

    private boolean isValidDate(String date) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        sdf.setLenient(false);
        try {
            sdf.parse(date);
            return true;
        } catch (ParseException e){
            return false;
        }
    }

    private boolean isValidPhoneNumber(String phoneNumber) {
        return phoneNumber.matches("\\d+");
    }

    private boolean isValidGender(String gender) {
        return (gender.equalsIgnoreCase("m") || gender.equalsIgnoreCase("f"));
    }

    public void writeDataToFile(String surname, String name, String patronymic, String birthDate, String phoneNumber, String gender) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(surname + ".txt", true))) {

            writer.write("<" + surname + "><" + name + "><" + patronymic + "><" + birthDate + "><" + phoneNumber + "><" + gender + ">");
            writer.newLine();
        } catch (IOException e) {
            System.err.println("Ошибка при записи в файл: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
