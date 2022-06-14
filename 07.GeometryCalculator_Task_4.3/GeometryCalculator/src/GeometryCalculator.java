public class GeometryCalculator {
    // метод должен использовать абсолютное значение radius
    public static double getCircleSquare(double radius) {
        return Math.PI * Math.pow(Math.abs(radius), 2);
    }

    // метод должен использовать абсолютное значение radius
    public static double getSphereVolume(double radius) {
        return 4 * Math.PI * Math.pow(Math.abs(radius), 3) / 3 ;
    }

    // перед расчетом площади проверяется возможен ли такой треугольник
    public static boolean isTriangleRightAngled(double a, double b, double c) {
        if (a < 0 || b < 0 || c < 0) {
        return false;
    } else return !(a + b <= c) && !(a + c <= b) && !(b +c <= a);
    }

    // методом isTriangleRightAngled, если невозможен вернуть -1.0
    public static double getTriangleSquare(double a, double b, double c) {
        if (isTriangleRightAngled(a, b, c)) {
            double p = (a + b + c) / 2;
            return Math.sqrt(p * (p - a) * (p - b) * (p - c));
        } else return -1.0;

    }
}
