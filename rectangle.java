public class rectangle implements areaperi {
    private double l;
    private double b;

    public rectangle(double l, double b) {
        this.l = l;
        this.b = b;

    }

    @Override
    public void area(areaperi rec) {
        rectangle o = (rectangle) rec;

        double ar = o.l * o.b;
        System.out.println("The Area of Rectangle: " + ar);
    }

    @Override
    public void perimeter(areaperi rec) {
        rectangle o = (rectangle) rec;
        double per = 2 * (o.l + o.b);
        System.out.println("The Perimeter of Rectangle: " + per);

    }
}
