// p is at 3478, number is at 7700
// (i) p = 100, number = 8
// number = 8, &number = 7700, p = 100, &p = memory address of ptr p, *p = value stored at memmory location 100

// p is at 3478, number is at 7700
// (i) p = 100, number = 8
// number = 8, &number = 7700, p = 100, &p = memory address of ptr p, *p = value stored at memmory location 100

// (ii) number = p;
// number = the value of the memory address that p holds

// (iii) p = &number
// number = the value of the memory address that p holds
// &number = 7700, p = the memory address of number (7700), &p = memory address of ptr p, *p = value of number

// (iv) *p = 10
// number = 7700
// &number = 7700, p = 7700, &p = memory address of ptr p, *p = 10

// (v) number = &p
// number = the memory address of ptr p aka &p

// (vi) p = &p;


#include <stdio.h>

int main() {
    int number;
    int *p;

    number = p;

    printf("number = %d, &number = %p, p = %p, &p = %p, *p = %d\n", number, &number, p, &p, *p);
}