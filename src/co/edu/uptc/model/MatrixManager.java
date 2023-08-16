package co.edu.uptc.model;

import java.util.Random;
import java.util.Vector;

public class MatrixManager {

    private Matrix matrix;
    private Vector<Vector<Integer>> vectors;

    public MatrixManager() {
    }

    public MatrixManager(Matrix matrix) {
        this.matrix = matrix;
        vectors = new Vector<>();
    }

    public Vector<Vector<Integer>> createMatrix(Matrix matrix) {
        int n = matrix.getN();
        Vector<Vector<Integer>> v = new Vector<>();
        v = vectors;
        Random number = new Random();
        for (int i = 0; i < n; i++) {
            Vector<Integer> numbers = new Vector<>();
            vectors.add(numbers);
            for (int j = 0; j < n; j++) {
                numbers.add(number.nextInt(1, 10));
            }
        }
        return v;
    }

    public void transposeMatrix(){

    }
}
