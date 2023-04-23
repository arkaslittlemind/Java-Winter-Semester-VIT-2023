class Quadrilaterals{
    int x1, y1, x2, y2, x3, y3, x4, y4;
    public void set(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
        this.x4 = x4;
        this.y4 = y4;
    }
}

class Square extends Quadrilaterals{
    Square(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4){
        set(x1, y1, x2, y2, x3, y3, x4, y4);
    }
    int squareArea(){
        int side = (int)Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
        return side*side;
    }
}

class Rectangle extends Quadrilaterals{
    Rectangle(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4){
        set(x1, y1, x2, y2, x3, y3, x4, y4);
    }
    int rectangleArea(){
        int side1 = (int)Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
        int side2 = (int)Math.sqrt(Math.pow(x3-x2, 2) + Math.pow(y3-y2, 2));
        return side1*side2;
    }
}

class Trapezoid extends Quadrilaterals{
    int height;
    Trapezoid(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4, int height){
        set(x1, y1, x2, y2, x3, y3, x4, y4);
        this.height = height;
    }
    int trapezoidArea(){
        int side1 = (int)Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
        int side2 = (int)Math.sqrt(Math.pow(x3-x2, 2) + Math.pow(y3-y2, 2));
        return (side1+side2)*height/2;
    }
}

class Parallelogram extends Quadrilaterals{
    Parallelogram(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4){
        set(x1, y1, x2, y2, x3, y3, x4, y4);
    }
    int parallelogramArea(){
        int side1 = (int)Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
        int side2 = (int)Math.sqrt(Math.pow(x3-x2, 2) + Math.pow(y3-y2, 2));
        return side1*side2;
    }
}


public class areaOfQuadrilaterals {
    public static void main(String[] args){
        Square s = new Square(0, 0, 0, 5, 5, 5, 5, 0);
        System.out.println("The area of the square is: " + s.squareArea());
        Rectangle r = new Rectangle(0, 0, 0, 5, 10, 5, 10, 0);
        System.out.println("The area of the rectangle is: " + r.rectangleArea());
        Trapezoid t = new Trapezoid(0, 0, 0, 5, 10, 5, 10, 0, 5);
        System.out.println("The area of the trapezoid is: " + t.trapezoidArea());
        Parallelogram p = new Parallelogram(0, 0, 0, 5, 10, 5, 10, 0);
        System.out.println("The area of the parallelogram is: " + p.parallelogramArea());
    }
}
