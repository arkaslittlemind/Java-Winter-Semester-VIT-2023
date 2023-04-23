public class Circle implements areaperi {
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public void area(areaperi r) {
        Circle c = (Circle) r;
        double ar = 3.14 * Math.pow(c.r, 2);
        System.out.println("The Area of the Circle: " + ar);
    }

    @Override
    public void perimeter(areaperi r) {
        Circle c = (Circle) r;
        double per = 2 * 3.14 * c.r;
        System.out.println("The Perimeter of the Circle: " + per);
    }
}