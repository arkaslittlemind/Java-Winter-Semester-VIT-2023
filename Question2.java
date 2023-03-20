import java.util.Arrays;

class Vector  {
    private double[] elements;

    public Vector(double[] elements) {
        this.elements = elements;
    }

    public double[] getElements() {
        return elements;
    }

    public int getSize() {
        return elements.length;
    }

    public Vector add(Vector other) {
        if (getSize() != other.getSize()) {
            throw new IllegalArgumentException("Vectors must have same size for addition.");
        }
        double[] result = new double[getSize()];
        for (int i = 0; i < getSize(); i++) {
            result[i] = elements[i] + other.getElements()[i];
        }
        return new Vector(result);
    }

    public Vector multiply(Vector other) {
        if (getSize() != other.getSize()) {
            throw new IllegalArgumentException("Vectors must have same size for multiplication.");
        }
        double[] result = new double[getSize()];
        for (int i = 0; i < getSize(); i++) {
            result[i] = elements[i] * other.getElements()[i];
        }
        return new Vector(result);
    }
}

class Matrix {
    private double[][] elements;

    public Matrix(double[][] elements) {
        this.elements = elements;
    }

    public double[][] getElements() {
        return elements;
    }

    public int getNumRows() {
        return elements.length;
    }

    public int getNumCols() {
        return elements[0].length;
    }

    public Matrix add(Matrix other) {
        if (getNumRows() != other.getNumRows() || getNumCols() != other.getNumCols()) {
            throw new IllegalArgumentException("Matrices must have same dimensions for addition.");
        }
        double[][] result = new double[getNumRows()][getNumCols()];
        for (int i = 0; i < getNumRows(); i++) {
            for (int j = 0; j < getNumCols(); j++) {
                result[i][j] = elements[i][j] + other.getElements()[i][j];
            }
        }
        return new Matrix(result);
    }

    public Matrix multiply(Matrix other) {
        if (getNumCols() != other.getNumRows()) {
            throw new IllegalArgumentException("Number of columns of first matrix must match number of rows of second matrix for multiplication.");
        }
        double[][] result = new double[getNumRows()][other.getNumCols()];
        for (int i = 0; i < getNumRows(); i++) {
            for (int j = 0; j < other.getNumCols(); j++) {
                for (int k = 0; k < getNumCols(); k++) {
                    result[i][j] += elements[i][k] * other.getElements()[k][j];
                }
            }
        }
        return new Matrix(result);
    }
}

public class Question2 {
    public static void main(String[] args) {
        Vector v1 = new Vector(new double[]{1, 2, 3});
        Vector v2 = new Vector(new double[]{4, 5, 6});

        System.out.println("v1 + v2 = " + Arrays.toString(v1.add(v2).getElements()));
        System.out.println("v1 * v2 = " + Arrays.toString(v1.multiply(v2).getElements()));

        Matrix m1 = new Matrix(new double[][]{{1, 2}, {3, 4}});
        Matrix m2 = new Matrix(new double[][]{{5, 6}, {7, 8}});

        System.out.println("m1 + m2 = " + Arrays.deepToString(m1.add(m2).getElements()));
        System.out.println("m1 * m2 = " + Arrays.deepToString(m1.multiply(m2).getElements()));
    }
}