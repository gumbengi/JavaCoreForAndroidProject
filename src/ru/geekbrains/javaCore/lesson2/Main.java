package ru.geekbrains.javaCore.lesson2;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = { {1, 2, 3}, {1, 2}, {1} };
/*        for (int i = 0; i < matrix.length; i++){
            int[] innerMatrix = matrix[i];

            for (int j = 0; j <innerMatrix.length; j++) {
                System.out.println(matrix[i][j]);
            }
            System.out.println();
        }

 */
            for (int i = 0; i < matrix.length; i++) {
                for (int k=0; k < matrix[i].length; k++) {
                    System.out.println(matrix[i][k]);
                }
                System.out.println();
            }


    }

}
