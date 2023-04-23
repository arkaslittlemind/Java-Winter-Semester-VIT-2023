public class PieceWorker extends worker {
    private int wage;
    private int pieces;
    PieceWorker(String name, String address, int wage, int pieces) {
        super(name, address);
        this.wage = wage;
        this.pieces = pieces;
    }
    public void earnings() {
        System.out.println("Earnings of the worker: " + this.wage * this.pieces);
    }
}