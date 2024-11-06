package pac;
public class CircleTest {
    public static void main(String[] args) {
        // Создаем массив из объектов Circle с разными радиусами
        Circle[] circles = {
                new Circle(3.0),
                new Circle(4.5),
                new Circle(2.2),
                new Circle(5.1),
                new Circle(3.8)
        };

        // Инициализируем переменные для хранения круга с максимальной площадью
        Circle largestCircle = circles[0];
        double maxArea = largestCircle.getArea();

        // Проходим по массиву, чтобы найти круг с самой большой площадью
        for (int i = 1; i < circles.length; i++) {
            double area = circles[i].getArea();
            if (area > maxArea) {
                maxArea = area;
                largestCircle = circles[i];
            }
        }

        // Выводим радиус и площадь круга с самой большой площадью
        System.out.println("Круг с самой большой площадью:");
        System.out.println("Радиус: " + largestCircle.getRadius());
        System.out.println("Площадь: " + maxArea);
    }
}