#include <stdio.h>
#include <math.h>

int main() {
    double x;
    printf("Enter x:\n");
    scanf("%lf", &x);
    double sum = 1;
    double exponential = 1;
    for (int i = 1; i <= 10; i++) {
        sum = sum + (pow(x, i) / exponential);
        exponential *= i;
    }
    printf("Result = %.2lf\n", sum);
}
