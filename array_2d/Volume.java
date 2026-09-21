class Cube {
    private double side;

    public Cube(double side) {
        this.side = side;
    }

    public double getVolume() {
        return side * side * side;
    }
}

class Cylinder {
    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double getVolume() {
        return Math.PI * radius * radius * height;
    }
}

class Sphere {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    public double getVolume() {
        return (4.0 / 3.0) * Math.PI * radius * radius * radius;
    }
}

public class Volume {
    public static void main(String[] args) {

        Cube cube = new Cube(5);
        Cylinder cylinder = new Cylinder(3, 10);
        Sphere sphere = new Sphere(4);

        System.out.println("Cube volume: " + cube.getVolume());
        System.out.println("Cylinder volume: " + cylinder.getVolume());
        System.out.println("Sphere volume: " + sphere.getVolume());
    }
}