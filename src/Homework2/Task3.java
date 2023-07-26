package Homework2;

// Задание 3. Дан следующий код, исправьте его там, где требуется.
public class Task3 {
    public static void main(String[] args) throws Exception {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = {1, 2};
            abc[3] = 9;
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (ArithmeticException ex) {
            System.out.println("Нельзя делить на ноль!");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");

        }
    }

    public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }

}
