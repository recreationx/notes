#include <stdio.h>

int main() {
    int no_of_lines;
    printf("Enter number of lines:\n");
    scanf("%d", &no_of_lines);

    for (int i = 0; i < no_of_lines; i++) {
        int sum = 0;
        int count = 0;
        int current;
        printf("Enter line %d (end with -1):\n", i);
        while (1) {
            scanf("%d", &current);

            if (current == -1) {
                break;
            }

            sum += current;
            count += 1;
        }

        double average = (double) sum / count;
        printf("Average = %.2f\n", average);
    }
}