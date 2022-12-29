package Vectors;

public class Vector2D extends Vector {
static final String vector2= "Это вектор для двумерной системы координат.";
    double size2;

    public Vector2D(double x1, double x2, double y1, double y2) {
        super(x1, x2, y1, y2);
    }

    public Vector2D() {
    }
    @Override
    public Double vectorLength() {
        return Math.sqrt(Math.pow((x2 - x1), 2)
                        + Math.pow((y2 - y1), 2));

    }

    @Override
    public Double scalarMultiplication() {
        return x1*y1+x2*y2;

    }

    @Override
    public Vector2D vectorAddition() {
        x1+=x2;
        y1+=y2;
        return this;
    }



    @Override
    public void vectorSubtraction() {

    }

    @Override
    public void vectorComparison() {

    }

    @Override
    public void printInformation() {

    }

    @Override
    public String toString() {
        return "Vector2D{" +
                "size2=" + size2 +
                ", x1=" + x1 +
                ", x2=" + x2 +
                ", y1=" + y1 +
                ", y2=" + y2 +
                '}';
    }
}
// a += vector.getA();
//         b += vector.getB();
//         findLength();
//         return this;
//         }
//
//public Vector2D subtract(Vector2D vector) {
//        a -= vector.getA();
//        b -= vector.getB();
//        findLength();
//        return this;
