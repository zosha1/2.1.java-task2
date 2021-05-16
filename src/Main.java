public class Main {
    public static void main(String[] args) {
        double amount = 100;
        double income = 1100;
        int coefficient = 100;
        int limit = 1000;
        int bonus = 0;
        if (income > limit) {
            bonus = (int) income / coefficient;
        }
        amount = amount + income + bonus;
        System.out.println(amount);
    }
}
