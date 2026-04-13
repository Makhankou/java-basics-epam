package com.epam.rd.autotasks;

class Spiral {
    static int[][] spiral(int rows, int columns) {
        int[][] matrix = new int[rows][columns];
        int lastNumber = rows * columns;
        int row = 0;
        int column = 0;
        int[] right = {0, 1};
        int[] down = {1, 0};
        int[] left = {0, -1};
        int[] up = {-1, 0};
        int[] currentPath = right;
        int directionsIndex = 0;
        for (int i = 1; i<= lastNumber; i++) {
            matrix[row][column] = i;
            if(currentPath == right && column < columns - 1 && matrix[row][column + 1] == 0) {
                currentPath = right;
            } else if (currentPath == down && row < rows - 1 && matrix[row + 1][column] == 0) {
                currentPath = down;
            } else if(currentPath == left && column > 0 && matrix[row][column - 1] == 0) {
                currentPath = left;
            } else if(currentPath == up && row > 0 && matrix[row - 1][column] == 0) {
                currentPath = up;
            } else {
                directionsIndex = (directionsIndex + 1) %4;
                switch (directionsIndex) {
                    case 0:
                        currentPath = right;
                        break;
                    case 1:
                        currentPath = down;
                        break;
                    case 2:
                        currentPath = left;
                        break;
                    case 3:
                        currentPath = up;
                        break;
                }
            }

            row = row + currentPath[0];
            column = column + currentPath[1];
        }
        return matrix;
    }
}
