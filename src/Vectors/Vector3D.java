package Vectors;

public class Vector3D extends Vector {
    double size3;


    public Vector3D(double x1, double x2, double y1, double y2, double z1, double z2) {
        super(x1, x2, y1, y2, z1, z2);
    }

    public Vector3D() {
    }

    @Override
    public Double vectorLength() {
        return Math.sqrt(Math.pow((x2 - x1), 2)
                + Math.pow((y2 - y1), 2)+ Math.pow((z2 - z1), 2));
           }

    @Override
    public Double scalarMultiplication() {
        return x1*y1+x2*y2;
    }


    @Override
    public Vector2D vectorAddition() {

        return null;
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

}
