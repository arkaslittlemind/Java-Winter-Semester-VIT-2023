public class GenericsExample1 {
    public static void main(String[] args) {
        shout("Arka");
    }
    private static <T> void shout (T thingToShout) {
        System.out.println(thingToShout + "!!!");
    }

}
