#include <stdio.h>

int main() {
    int height = 0;
    int current;

    printf("Enter the height:\n");
    scanf("%d", &height);
    printf("Pattern:\n");

    for (int i = 1; i <= height; i++) {
        current = i % 3;
        if (current == 0) {
            current = 3;
        }
        for (int j = 0; j < i; j++) {
            printf("%d", current);
        }
        printf("\n")
    }

}