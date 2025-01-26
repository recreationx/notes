#include <stdio.h>
#include <stdlib.h>

void calcFrequency(int frequency[], int arr[], int N);
void printHistogram(int frequency[]);

int main() {
    printf("Input N: \n");

    int N;
    scanf("%d", &N);

    int arr[N];
    int frequency[10];

    for (int i = 0; i < N; i++) {
        *(arr + i) = rand() % 100;
    }

    for (int i = 0; i < 10; i++) {
        frequency[i] = 0;
    }

    calcFrequency(frequency, arr, N);

    printHistogram(frequency);
}

void calcFrequency(int frequency[], int arr[], int N) {
    for (int i = 0; i < N; i++) {
        int freqIndex = arr[i] % 10;
        // frequency[freqIndex] += 1;
        *(frequency + freqIndex) += 1;
    }
}

void printHistogram(int frequency[]) {
    for (int i = 0; i < 10; i++) {
        printf("%d - %d | ", i, (i * 10 + 9));
        for (int j = 0; j < frequency[i]; j++) {
            printf("*");
        }
        printf("\n");
    }
}

