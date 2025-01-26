#include <stdio.h>
#define SIZE 4

void reduceMatrix2D(int ar[][SIZE], int rowSize, int colSize);

int main() {
    int arr[SIZE][SIZE] = {4, 3, 8, 6, 9, 0, 6, 5, 5, 1, 2, 4, 9, 8, 3, 7};
    reduceMatrix2D(arr, SIZE, SIZE);
}

void reduceMatrix2D(int ar[][SIZE], int rowSize, int colSize) {
    for (int i = 0; i < SIZE; i++) {
        for (int j = 0; j < SIZE; j++) {
            if (i == j) {
                int sum = ar[i][j];
                for (int k = i + 1; k < SIZE; k++) {
                    sum += ar[k][j];
                    ar[k][j] = 0;
                }
                ar[i][j] = sum;
            }

            printf("%d ", ar[i][j]);
        }
        printf("\n");
    }
}
