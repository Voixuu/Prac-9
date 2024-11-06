package pac;

public class TestDate {
    public static void main(String[] args) {
        java.util.Date[] dates = new java.util.Date[10];

        // Инициализируем первый элемент массива
        dates[0] = new java.util.Date();

        // Теперь можно безопасно вызывать toString() на dates[0]
        System.out.println(dates[0]);
        System.out.println(dates[0].toString());
    }
}