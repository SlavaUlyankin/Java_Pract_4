import java.util.InputMismatchException;
import java.util.Scanner;

public class TestMonthsLeapYear {
    static final String[] MONTHS = {
            "Январь", "Февраль", "Март", "Апрель", "Май", "Июнь",
            "Июль", "Август", "Сентябрь", "Октябрь", "Ноябрь", "Декабрь"
    };

    static final int[] DOM = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};


    public static boolean isLeapYear(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }


    public static int getDaysInFebruary(int year) {
        return isLeapYear(year) ? 29 : 28;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите номер месяца (1–12): ");
        int month = 0;

        try {
            month = in.nextInt();

            if (month == 2) {
                System.out.print("Выбран февраль. Введите год: ");
                int year = in.nextInt();
                System.out.println(MONTHS[1] + " " + year + " г. — "
                        + getDaysInFebruary(year) + " дн.");
                System.out.println("Год " + year + " високосный: " + isLeapYear(year));
            } else {
                System.out.println(MONTHS[month - 1] + " — " + DOM[month - 1] + " дн.");
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Исключение: " + e);
            System.out.println("Некорректный номер месяца: " + month
                    + ". Допустимый диапазон: 1–12.");
        } catch (InputMismatchException e) {
            System.out.println("Введено не целое число.");
        } finally {
            System.out.println("Работа программы завершена.");
            in.close();
        }
    }
}