#include <stdio.h>
#include <ctype.h>

int main() {
    int digits = 0, letters = 0;
    char input;

    printf("Enter your characters (# to end):\n");
    while (input != '#') {
        scanf("%c", &input);

        if (isalpha(input) != 0) {
            letters += 1;
        } else if (isdigit(input) != 0) {
            digits += 1;
        }
    }

    printf("The number of digits: %d\n", digits);
    printf("The number of letters: %d\n", letters);
}