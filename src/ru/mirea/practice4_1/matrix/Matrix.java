package ru.mirea.practice4_1.matrix;

public class Matrix {
    private double[][] matrix;
    private int xLength;
    private int yLength;

    public Matrix(double[][] matrix) {
        this.matrix = matrix;
        this.xLength = matrix.length;
        this.yLength = xLength != 0 ? matrix[0].length : 0;
    }

    public double[][] getMatrix() {
        return matrix;
    }

    public int getXLength() {
        return xLength;
    }

    public int getYLength() {
        return yLength;
    }

    public void addMatrix(Matrix matrix){

        if(matrix.getXLength() != xLength || matrix.getYLength() != yLength) {
            System.out.println("Dimensions doesn't match!");
            return;
        }

        for(int i = 0; i < xLength; i++){
            for(int j = 0; j < yLength; j++){
                this.matrix[i][j] += matrix.getMatrix()[i][j];
            }
        }
    }

    public void multiplyingByNumber(double number){
        for(int i = 0; i < xLength; i++){
            for(int j = 0; j < yLength; j++){
                this.matrix[i][j] *= number;
            }
        }
    }

    public void printMatrix(){
        for(int i = 0; i < xLength; i++){
            for(int j = 0; j < yLength; j++){
                System.out.print("| " + matrix[i][j] + " ");
            }
            System.out.println("|");
        }
    }

    Matrix multiplyingByMatrix(Matrix matrix) {
        if(matrix.getXLength() != yLength)
            return new Matrix(new double[][]{{}});

        double[][] result = new double[xLength][matrix.getYLength()];

        for (int row = 0; row < result.length; row++) {
            for (int col = 0; col < result[row].length; col++) {
                double cell = 0;

                for (int i = 0; i < matrix.getXLength(); i++) {
                    cell += getMatrix()[row][i] * matrix.getMatrix()[i][col];
                }

                result[row][col] = cell;
            }
        }

        return new Matrix(result);
    }
}
