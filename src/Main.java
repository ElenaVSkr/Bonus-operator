public class Main {
    public static void main(String[] args) {
        int check = 100; // начальный счет
        int put = 300; //сумма пополнения
        int total = check + put; //итоговая сумма
        int unit = 100; // фиксированная единица
        if (put >= 1000) {
            System.out.println((put / unit) + " количество бонусов");
            System.out.println((check + put + put / unit) + " итоговая сумма");
        } else {
            System.out.println("бонусов нет");
            System.out.println((total) + " итоговая сумма");
        }
    }
}