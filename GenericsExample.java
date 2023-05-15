public class GenericsExample {
    public static void main(String[] args) {
        IntegerPrinter printer = new IntegerPrinter(23);
        printer.print();

        DoublePrinter doublePrinter = new DoublePrinter(23.78);
        doublePrinter.print();
    }
}
