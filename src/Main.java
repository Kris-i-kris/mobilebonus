public class Main {

    public static void main(String[] args) {
        int accout = 56;
        int deposit = 1925;

        int bonus;
        if (deposit >= 1000) {
            bonus = deposit / 100;
        } else {
            bonus = 0;
        }

        int onAccout = accout + deposit + bonus;

        System.out.println("Бонус(ов): " + bonus);
        System.out.println("Итоговый счет: " + onAccout);
    }
}