public class Main {
    public static void main(String[] args) {

        int price = 12000;
        // количество рублей, за которое начисляют 1 бонус/милю
        final int countRub = 20;
        // рассчитываем количество бонусов при помощи целочисленного деления
        int bonus = price / countRub;

        System.out.println("Количество ваших бонусов = " + bonus);

    }
}