package b2;

public class Main {
    public static void main(String[] args) {
        // Tính diện tích hình tròn
        double circleArea1 = StaticMethod.calcCircleArea(3.5);
        double circleArea2 = StaticMethod.calcCircleArea(6);

        // Tính diện tích tam giác
        double triangleArea1 = StaticMethod.calcTriangleArea(3, 4, 5);
        double triangleArea2 = StaticMethod.calcTriangleArea(4.5, 7, 6);

        // Tính diện tích hình chữ nhật
        double rectangleArea1 = StaticMethod.calcRectangleArea(2.5, 6);
        double rectangleArea2 = StaticMethod.calcRectangleArea(4, 7);

        // Hiển thị kết quả
        System.out.println("Diện tích hình tròn 1: " + circleArea1);
        System.out.println("Diện tích hình tròn 2: " + circleArea2);
        System.out.println("Diện tích tam giác 1: " + triangleArea1);
        System.out.println("Diện tích tam giác 2: " + triangleArea2);
        System.out.println("Diện tích hình chữ nhật 1: " + rectangleArea1);
        System.out.println("Diện tích hình chữ nhật 2: " + rectangleArea2);
    }
}
