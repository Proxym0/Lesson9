package Vectors;

public class Main {
    public static void main(String[] args) {
        Vector v2= new Vector2D(3,4,4,5);

        System.out.println(((Vector2D)v2).vector2 + " Длинна вектора состовляет: " + v2.vectorLength());
        System.out.println(((Vector2D)v2).vector2 + " Скалярное произведение состовляет: "+ v2.scalarMultiplication());
        System.out.println(((Vector2D)v2).vector2 +" Сложени векторов составляет: " + v2.vectorAddition());
    }

    @Override
    public String toString() {
        return "Main{}";
    }
}