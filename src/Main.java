public class Main {
    public static void main(String[] args) {

        int balans = 100; //начальный счет
        int deposit = 1100; // сумма пополнения
        int bonus; // бонусы
        int finalBalans; // итог

        if (deposit > 1000) {
            bonus = deposit / 100;
        } else {
            bonus = 0;
        }
        finalBalans = balans + deposit + bonus;
        System.out.println("Итоговый баланс " + finalBalans);
        System.out.println("Бонусы " + bonus);
    }
}
