public class AccessModifier {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(2.5);
        System.out.println(circle1.getArea());
        System.out.println(circle2.getArea());

    }
}
