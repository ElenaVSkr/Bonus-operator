//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int a = 100; // начальный счет
        int b = 300; //сумма пополнения
        int c = a + b; //итоговая сумма
        int d = 100; // фиксированная единица
        if (b >= 1000) {
            System.out.println((b / d) + " количество бонусов");
            System.out.println((a + b + b / d) + " итоговая сумма");
        } else {
            System.out.println("бонусов нет");
            System.out.println((c) + " итоговая сумма");
        }
    }
}