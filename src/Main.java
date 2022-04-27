public class Main {
    public static void main(String[] args) {

        int initialScore = 100;
        int refill = 1100 ;

        int bonus;

        if (refill >= 1000) {
            bonus = refill / 100;
        } else {
            bonus = 0;
        }

        int amount = initialScore + refill + bonus;

        System.out.println("Бонус: " + bonus);
        System.out.println("Итоговая сумма на счете: " + amount);

    }
}
