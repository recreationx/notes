#include <stdio.h>
#define SIZE 20

int rCountArray(int array[], int n, int a);

int main()
{
    int array[SIZE];
    int index, count, target, size;
    printf("Enter array size: \n");
    scanf("%d", &size);
    printf("Enter %d numbers: \n", size);
    for (index = 0; index < size; index++)
        scanf("%d", &array[index]);
    printf("Enter the target number: \n");
    scanf("%d", &target);
    count = rCountArray(array, size, target);
    printf("rCountArray(): %d\n", count);
    return 0;
}

int rCountArray(int array[], int n, int a)
{
    if (n == 0) {
        return 0;
    } else {
        if (array[n - 1] == a) {
            return 1 + rCountArray(array, n - 1, a);
        } else {
            return 0 + rCountArray(array, n - 1, a);
        }
    }
}