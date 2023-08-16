import co.edu.uptc.model.Matrix;
import co.edu.uptc.model.MatrixManager;

public class Main {
    public static void main(String[] args) {
        MatrixManager manager = new MatrixManager(new Matrix(3));
        for (int i = 0; i < 3; i++) {
        System.out.println(manager.createMatrix(new Matrix(3)).get(i));
        }
    }
}



//ssh-keygen -t rsa -b 4096