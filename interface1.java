
interface Area {

    final static float pi = 3.14F;

    float compute(float a, float b);
}

class Rectangle implements Area {

    public float compute(float a, float b) {
        return (a * b);
    }
}

class circle implements Area {

    public float compute(float a, float b) {
        return a * a * pi;
    }
}

class interface1 {

    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        circle cir = new circle();
        Area a;
        a = rect;
        System.out.println("Area of the Rectangle = " + a.compute(12, 13));
        circle b;
        b = cir;
        System.out.println("Area of the circle = " + b.compute(12, 0));

    }
}
