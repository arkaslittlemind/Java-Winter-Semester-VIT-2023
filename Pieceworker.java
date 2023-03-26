
public class Pieceworker extends Employee {
    private double wage;
    private int pieces;

    /**
     * parameterized constructor
     * @param first
     * @param last
     * @param ssn
     * @param wage
     * @param pieces
     */
    public Pieceworker(String first, String last, String ssn, double wage, int pieces) {
        super();
        this.wage = wage;
        this.pieces = pieces;
    }

    /**
     * @return the wage
     */
    public double getWage() {
        return wage;
    }

    /**
     * @param wage the wage to set
     */
    public void setWage(double wage) {
        this.wage = wage;
    }

    /**
     * @return the pieces
     */
    public int getPieces() {
        return pieces;
    }

    /**
     * @param pieces the pieces to set
     */
    public void setPieces(int pieces) {
        this.pieces = pieces;
    }

    // calculate earnings; override abstract method earnings in Employee
    /**
     * @return
     */
    @Override
    public double earnings() {
        return wage * pieces;
    }

    // return String representation of pieceworker object
    public String toString() {
        return String.format("pieceworker employee: %s\n%s: $%,.2f\n%s: %d", super.toString(), "wage", getWage(),
                "pieces", getPieces());
    }
}