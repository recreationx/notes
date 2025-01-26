#include <stdio.h>
void add1(int ar[], int size);
int main()
{
    int array[3][4];
    int h, k;
    // input
    for (h = 0; h < 3; h++)
        for (k = 0; k < 4; k++)
            scanf("%d", &array[h][k]);

    for (h = 0; h < 3; h++) /* line a */
        add1(array[h], 4);

    // Original: for every hth row in the array, pass the ptr to the 1st elem of the array
    // add1 iterates up to kth (4) and add 1 to every element in that row

    add1(array[0], 3* 4);

    //Modified: The pointer to the first element of the array is passed into add1
    // add1 iterates from 0 up to kth (12), aka *(arr + k) thus adding 1 to every elem in the array
    
    // display
    for (h = 0; h < 3; h++)
    {
        for (k = 0; k < 4; k++)
            printf("%10d", array[h][k]);
        putchar("\n");
    }
    return 0;
}
void add1(int ar[], int size)
{
    int k;
    for (k = 0; k < size; k++)
        ar[k]++;
}