import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // объявляем переменную типа Scanner для считывания с консоли ввода пользователя
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите стоимость билета: ");
        int price = sc.nextInt(); // считываем ввод пользователя
        // количество рублей, за которое начисляют 1 бонус/милю
        final int countRub = 20;
        // рассчитываем количество бонусов при помощи целочисленного деления
        int bonus = price / countRub;

        System.out.println("Количество ваших бонусов = " + bonus);

    }
}