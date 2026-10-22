import java.util.InputMismatchException;
import java.util.Scanner;

public class TestMonths {
    static final String[] MONTHS = {
            "Январь", "Февраль", "Март", "Апрель", "Май", "Июнь",
            "Июль", "Август", "Сентябрь", "Октябрь", "Ноябрь", "Декабрь"
    };

    static final int[] DOM = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static void main(String[] args) {

        for (int i = 0; i < MONTHS.length; i++) {
            System.out.println((i + 1) + ". " + MONTHS[i] + " — " + DOM[i] + " дн.");
        }

        Scanner in = new Scanner(System.in);
        System.out.print("\nВведите номер месяца: ");
        int month = 0;

        try {
            month = in.nextInt();
            System.out.println(MONTHS[month - 1] + " — " + DOM[month - 1] + " дн.");
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