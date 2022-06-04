public class Main {
    public static void main(String[] args) {

        int start = 1500;
        int add = 2200;

        int bonus = 0;
        if (add > 1000) {
            bonus = add / 100;
        }
        // int bonus = add > 1000 ? add / 100 : 0;

        int and = start + add + bonus;
        System.out.println("Итоговый счет: " + and);
        System.out.println("Бонус: " + bonus);
    }
}
