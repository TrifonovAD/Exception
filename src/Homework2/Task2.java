package Homework2;

// Задание 2. Если необходимо, исправьте данный код
//  try {
//      int d = 0;
//      double catchedRes1 = intArray[8] / d;
//      System.out.println("catchedRes1 = " + catchedRes1);
//      } catch (ArithmeticException e) {
//      System.out.println("Catching exception: " + e);
//      }


public class Task2 {

    public static void main(String[] args) {

        Integer[] intArray = {47, 91, 12, 58, 37, 68, 19, 83, 24, 75};
//        Integer[] intArray = {47, 91, 12, 58, 37, 68, 19, null, 24, 75};

        try {
            int d = 4;

            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Catching exception: " + e);
        } catch (NullPointerException e) {
            System.out.println("Catching exception: " + e);
        }

    }
}
