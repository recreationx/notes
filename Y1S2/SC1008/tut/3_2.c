#include <stdio.h>
#define SIZE 4

void transpose2D(int ar[][SIZE], int rowSize, int colSize);

int main() {
    int arr[SIZE][SIZE] = {1,2,3,4,5,1,2,2,6,3,4,4,7,5,6,7};
    transpose2D(arr, SIZE, SIZE);
}

void transpose2D(int ar[][SIZE], int rowSize, int colSize) {
    int new[SIZE][SIZE];
    for (int i = 0; i < SIZE; i++) {
        for (int j = 0; j < SIZE; j++) {
            new[j][i] = ar[i][j];
        }
    }
    for (int i = 0; i < SIZE; i++) {
        for (int j = 0; j < SIZE; j++) {
            printf("%d", new[i][j]);
        }
        printf("\n");
    }

}