package Vectors;

public abstract class Vector implements MethodInterface{
    double x1;
    double x2;
    double y1;
    double y2;
    double z1;
    double z2;

    public Vector(double x1, double x2, double y1, double y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    public Vector(double x1, double x2, double y1, double y2, double z1, double z2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
        this.z1 = z1;
        this.z2 = z2;
    }

    public Vector() {
    }
}
