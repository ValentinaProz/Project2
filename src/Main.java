public class Main {
    public static void main(String[] args) {
        int ticketCost = 13676; // Объявляете переменные для входных данных и
        int rublesForOneMile = 20; // параметров программы: одну для хранения
        // стоимости билета, другую для хранения количества
        // рублей для одной бонусной мили

        int bonusMile = ticketCost / rublesForOneMile; // Рассчитываете количество бонусных миль, используя
        // значения заведённых переменных. Ответ сохраняете в
        // новую переменную и выводите на экран
        System.out.println("Hello!");
        System.out.println("You have " + bonusMile + " bonus miles.");
        System.out.println("Have a nice day!");
    }
}
