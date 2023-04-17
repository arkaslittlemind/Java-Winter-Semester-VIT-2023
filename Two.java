import java.util.*;

public class Two {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter fan speed: ");
        int speed = input.nextInt();
        input.nextLine(); // consume the remaining newline character

        System.out.print("Is fan on? (true/false): ");
        boolean on = input.nextBoolean();
        input.nextLine(); // consume the remaining newline character

        System.out.print("Enter fan radius: ");
        double radius = input.nextDouble();
        input.nextLine(); // consume the remaining newline character

        System.out.print("Enter fan color: ");
        String color = input.nextLine();

        Fan fan = new Fan(speed, on, radius, color);
        System.out.println(fan.toString());
    }

}


class Fan {
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public Fan() {
        speed = 0;
        on = false;
        radius = 5;
        color = "blue";
    }

    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        if (on) {
            return "Fan speed: " + speed + ", color: " + color + ", radius: " + radius;
        } else {
            return "Fan color: " + color + ", radius: " + radius + ", fan is off";
        }
    }
}
