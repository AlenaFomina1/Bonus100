public class Main {
    public static void main(String[] args) {

// входные данные
        int account = 100;
        int depositAmount = 1500;
        int sum = account + depositAmount;

        System.out.println("Итоговый счет:");
        System.out.println(sum);
        System.out.println("Количество бонусных рублей:");
        if (depositAmount > 1000) {
            int bonus = depositAmount / 100 * 1;
            System.out.println(bonus);
            int totalAmount = account + depositAmount + bonus;
            System.out.println("Итоговая сумма:");
            System.out.println(totalAmount);
        }
    }
}