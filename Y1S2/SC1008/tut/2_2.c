#include <stdio.h>

int digitValue1(int num, int k);
void digitValue2(int num, int k, int *result);

int main() {
    int num, digit, result = -1;
    
    printf("Enter the number: \n");
    scanf("%d", &num);
    printf("Enter k position: \n");
    scanf("%d", &digit);
    printf("digitValue1(): %d\n", digitValue1(num, digit));
    digitValue2(num, digit, &result);
    printf("digitValue2(): %d\n", result);
    return 0;
}

int digitValue1(int num, int k) {
    for (int i = 0; i < k - 1; i++) {
        num /= 10;
    }
    return num % 10;
}

void digitValue2(int num, int k, int *result) {
    for (int i = 0; i < k - 1; i++) {
        num /= 10;
    }
    *result = num % 10;
}