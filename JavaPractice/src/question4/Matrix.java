package question4;

import java.util.Arrays;


        public  class Matrix implements Operations {
        private int[][] matrix;

        public Matrix(int[][] matrix) {
            this.matrix = matrix;
        }

        public void add(Operations other) {
            question4.Matrix m = (Matrix) other;
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    matrix[i][j] += m.matrix[i][j];
                }
            }
        }

        public void multiply(Operations other) {
            question4.Matrix m = (question4.Matrix) other;
            int[][] result = new int[matrix.length][m.matrix[0].length];
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < m.matrix[0].length; j++) {
                    int sum = 0;
                    for (int k = 0; k < matrix[0].length; k++) {
                        sum += matrix[i][k] * m.matrix[k][j];
                    }
                    result[i][j] = sum;
                }
            }
            matrix = result;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            for (int[] row : matrix) {
                sb.append(Arrays.toString(row)).append("\n");
            }
            return sb.toString();
        }
    }


