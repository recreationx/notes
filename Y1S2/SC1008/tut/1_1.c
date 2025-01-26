#include <stdio.h>

// def a1 - c2 as float/int
// check for floating pt with fabs(op) >= 0.0001

int main() {
    int a1, b1, c1, a2, b2, c2;
    int numerator_x, numerator_y, common_denominator;
    double x, y;

    printf("Enter the values for a1, b1, c1, a2, b2, c2:\n");
    scanf("%d %d %d %d %d %d", &a1, &b1, &c1, &a2, &b2, &c2);
    common_denominator = (a1 * b2) - (a2 * b1);

    if (common_denominator == 0) {
        printf("Unable to compute because the denominator is zero!");
        return 0;
    }

    numerator_x = (b2 * c1) - (b1 * c2);
    numerator_y = (a1 * c2) - (a2 * c1);

    x = (double) numerator_x / common_denominator;
    y = (double) numerator_y / common_denominator;

    printf("x = %.2f and y = %.2f\n", x, y);
    
}