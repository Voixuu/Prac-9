package pac;
//1.Можно ли вызвать метод экземпляра или обратиться к переменной экземпляра из статического метода?
//Нет
//2.Можно ли вызвать статический метод или обратиться к статической переменной из метода экземпляра?
//Да
public class C {
    // Делаем переменную c статической, чтобы к ней можно было обращаться из статического метода
    static Circle c = new Circle(2);

    public static void main(String[] args) {
        C instance = new C(); // Создаем объект класса C
        instance.method1(); // Вызов нестатического метода через объект
    }

    public void method1() {
        method2(); // Вызов статического метода, допустимо
    }

    public static void method2() {
        System.out.println("What is area " + c.getArea()); // Допустимо, так как c теперь статическая
    }
}