public class Main {
    public static void main(String[] args) {

        //     Переменные которые учавствуют
        //     Текущий баланс клиента - balans
        //     Сумма пополнения - add_rub
        //     Остаток - total
        //     Подарочные минуты - present
        //

        int balans = 1400;
        int addRub = 1125;

        int total;
        int present;

        if (addRub > 1000) {
            present = addRub / 100;
            total = balans + addRub + present;
        } else {
            present = 0;
            total = balans + addRub;
        }

        System.out.println("Текущий баланс: " + balans);
        System.out.println("Сумма пополнения: " + addRub);
        System.out.println("Подарочные минуты: " + present);
        System.out.println("Остаток: " + total);

    }
}