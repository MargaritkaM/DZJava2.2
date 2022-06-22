public class main {
    public static void main(String[] args) {
        int balance = 100;
        int transfer = 1350;
        boolean isLimitTransfer = (transfer > 1000);
        int bonus;
        if (isLimitTransfer) {
            bonus = transfer / 100;
        } else {
            bonus = 0;
        }
        System.out.println("Итоговый баланс счета: " + (balance + transfer + bonus));
        System.out.println("Бонус: " + bonus);
    }
    }