public class Main {
    public static void main(String[] args) {

        //     Переменные которые учавствуют
        //     Текущий баланс клиента - balans
        //     Сумма пополнения - add_rub
        //     Остаток - total
        //     Подарочные минуты - present
        //

        int balans = 1400;
        int add_rub = 1125;

        int total;
        int present;

        if(add_rub > 1000) {
            present = add_rub / 100;
            total = balans + add_rub + present;
        } else {
            present = 0;
            total = balans + add_rub;
        }



        System.out.println("Текущий баланс: " + balans);
        System.out.println("Сумма пополнения: " + add_rub);
        System.out.println("Подарочные минуты: " + present);
        System.out.println("Остаток: " + total);

    }
}