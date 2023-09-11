package ru.mirea.practice4_1.matrix;

public class Tester {
    public static void main(String[] args) {
        Matrix matrix1 = new Matrix(new double[][]{{1,2,3}, {4,5,6}, {7,8,9}});
        Matrix matrix2 = new Matrix(new double[][]{{9,8,7}, {6,5,4}, {3,2,1}});


        matrix1.printMatrix();
        System.out.println();
        matrix2.printMatrix();
        System.out.println();

        matrix1.addMatrix(matrix2);
        matrix1.printMatrix();
        System.out.println();
        matrix2.printMatrix();
        System.out.println();

        matrix1.multiplyingByNumber(0.5);
        matrix1.printMatrix();
        System.out.println();

        Matrix newMatrix = matrix1.multiplyingByMatrix(matrix2);
        newMatrix.printMatrix();
        System.out.println();
    }
}
